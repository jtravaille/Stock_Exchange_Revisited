package ExchangeServer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BusinessImporter {
    /** Class to read in the details of the businesses to be included in the server from a file
     */

    private String filename;
    private List<Business> businessList;

    public BusinessImporter() {
        this.businessList = new ArrayList<Business>();
    }

    public List<Business> importBusinessList(String filename) {

        this.filename = filename;
        this.businessList = new ArrayList<Business>();

        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("Business:")) {
                    Business newBusiness;
                    line = bufferedReader.readLine();
                    String businessName = line;
                    line = bufferedReader.readLine();
                    Integer businessValue = Integer.valueOf(line);
                    newBusiness = new Business(businessName, businessValue);
                    businessList.add(newBusiness);
                }
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println("Cannot open file '" + filename + "'");
            businessList = null;
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + filename + "'");
            ex.printStackTrace();
            businessList = null;
        }
        return businessList;
    }
}
