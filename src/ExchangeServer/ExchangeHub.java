package ExchangeServer;

import java.util.List;

public class ExchangeHub {
    /** The main holder for the businesses to be invested in
     */

    private List<Business> businessList;
    private BusinessImporter businessImporter;

    public ExchangeHub(String filename) {
        businessImporter = new BusinessImporter();
        retrieveBusinesses(filename);
        System.out.println(businessList);
    }

    public List<Business> getBusinessList() {
        return businessList;
    }

    private void retrieveBusinesses(String filename) {
        businessList = businessImporter.importBusinessList(filename);
    }
}
