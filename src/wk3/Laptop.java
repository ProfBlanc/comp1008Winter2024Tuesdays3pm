package wk3;

public class Laptop {  // inherits from Object

    //attributes
    // make, model, cpu, storage, dimensions, weight, color

    String make, model, color, cpu;
    int storage;
    double weight;
    double[] dimensions = new double[3];

    //constructor = special method
    // no return data type
    // exact same name as class
    public Laptop(){}
    //alt+insert
    // right-click => Generate...

    public Laptop(String make, String model, String color, String cpu, int storage, double weight, double[] dimensions) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.cpu = cpu;
        this.storage = storage;
        this.weight = weight;
        this.dimensions = dimensions;
    }


    //actions

}
