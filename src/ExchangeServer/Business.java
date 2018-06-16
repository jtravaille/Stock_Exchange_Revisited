package ExchangeServer;

import java.util.ArrayList;

public class Business {
    /** A class that represents a company or business that players can interact with,
     * such as investing/buying shares.
     */

    private String name;
    private Integer currentValue;
    private ArrayList<Integer> recentValues;

    public Business(String name, Integer value) {
        this.name = name;
        this.currentValue = value;
    }

    public void changeValue(Integer value) {
        recentValues.add(this.currentValue);
        this.currentValue = value;
    }


    public String getName() {
        return name;
    }

    public float getCurrentValue() {
        return currentValue;
    }

    @Override
    public String toString() {
        String returnString = "Business{name='%s', currentValue=%.2f}";
        float printValue = currentValue /100;
        return String.format(returnString, name, printValue);
    }
}
