package ExchangeServer;

import java.util.Random;

public class EventDriver {

    /** Class that provides random number and event generation that effect the businesses
     */

    private ExchangeHub hub;
    private Random generator;


    public EventDriver(ExchangeHub hub) {
        this.hub = hub;
        this.generator = new Random();
    }



}
