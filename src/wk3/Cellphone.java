package wk3;

public class Cellphone {

    String make;

    double screenSize;

    //int[] memory = {8, 16, 32};
    //enum: enumerable. preset values. aka dropdown menu of options

    // declaring the enum

    //declaring an attribute that holds ONE value of the preset values

    // enum a list/array of constants
    enum Memory {EIGHT, SIXTEEN, THIRTY_TWO}

    Memory ram = Memory.EIGHT;
    //String s1;

    double[] dimensions = new double[3];

    boolean dualSims, operatingSystem;

    public Cellphone(){}

    public Cellphone(String make, double screenSize, Memory ram, double[] dimensions, boolean dualSims, boolean operatingSystem) {
        this.make = make;
        this.screenSize = screenSize;
        this.ram = ram;
        this.dimensions = dimensions;
        this.dualSims = dualSims;
        this.operatingSystem = operatingSystem;
    }
}
