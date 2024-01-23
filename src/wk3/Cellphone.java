package wk3;

public class Cellphone {

    //encapsulation: hiding data / making data less accessible

    //hide data
    // validate data: limit or restrict values

    // accessibility level: limit the access of attributes and actions\

    //4: default aka package-private, public, protected, private
    // package: default, protected: same package, accessible. Not inaccessible
    // public: inside same package or not => still accessible
    // private: only accessible inside class definition

    public String make;

    protected double screenSize;

    //int[] memory = {8, 16, 32};
    //enum: enumerable. preset values. aka dropdown menu of options

    // declaring the enum

    //declaring an attribute that holds ONE value of the preset values

    // enum a list/array of constants
    enum Memory {EIGHT, SIXTEEN, THIRTY_TWO}

    Memory ram = Memory.EIGHT;
    //String s1;

    double[] dimensions = new double[3];

    private double priceToMake = 5;

    private boolean dualSims, operatingSystem;

    public Cellphone(){}

    public Cellphone(String make, double screenSize, Memory ram, double[] dimensions, boolean dualSims, boolean operatingSystem) {
        this.make = make;
        this.screenSize = screenSize;
        this.ram = ram;
        this.dimensions = dimensions;
        this.dualSims = dualSims;
        this.operatingSystem = operatingSystem;
    }

    //getter : retrieve the data value
    // setter is to set the value
    //aka accessor and mutator


    public double getPriceToMake() {
        return priceToMake;
    }

    public void setPriceToMake(double priceToMake) {
        if(priceToMake >= 5)
            this.priceToMake = priceToMake;
    }
}
