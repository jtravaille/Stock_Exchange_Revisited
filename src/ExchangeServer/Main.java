package ExchangeServer;

public class Main {

    public static void main(String[] args) throws Exception {
        String path = System.getProperty("user.dir");
        String filename = path + "\\src\\ExchangeServer\\EconomyList.txt";
        ExchangeHub exchangeHub = new ExchangeHub(filename);
    }
}
