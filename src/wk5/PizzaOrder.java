package wk5;

import java.util.ArrayList;

public class PizzaOrder {

    private int numberOfSlices, numberOfToppings;

    enum PizzaSizes {PERSONAL, SMALL, MEDIUM, LARGE, EXTRA_LARGE}
    private PizzaSizes pizzaSize;

    private ArrayList<String> toppings = new ArrayList<>();

    //create the getters and setters for all private instance variables
    // right-click => Generate => Getters and Setters => select all private instance variables


    //create a pizza with the size of the pizza and the toppings
    public PizzaOrder(String size, String... toppings){
        //datatype... => unlimited amount of args
        setPizzaSize(size);
        setToppings(toppings);
    }

    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    public void setNumberOfSlices(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    public PizzaSizes getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {

        this.pizzaSize = switch (pizzaSize.toLowerCase()){
            case "personal" -> PizzaSizes.PERSONAL;
            case "medium"-> PizzaSizes.MEDIUM;
            case "large" -> PizzaSizes.LARGE;
            case "xl", "extra", "extra large"-> PizzaSizes.EXTRA_LARGE;
            default -> PizzaSizes.SMALL;
        };
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
}
