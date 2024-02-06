package wk5;

import java.util.ArrayList;

//javadoc => java documentation
// document: class, instance variable, methods

/**
 * This is a cool Pizza Order class that we had fun making
 * @author Prof Blanc
 * @version 1.0
 * @since 2024-02-06
 * @implNote This is how you implement this class
 */

public class PizzaOrder {

    private int numberOfSlices, numberOfToppings;

    /**
     *
     * This is a list of possible pizza sizes
     */
    enum PizzaSizes {PERSONAL, SMALL, MEDIUM, LARGE, EXTRA_LARGE}
    private PizzaSizes pizzaSize;

    private ArrayList<String> toppings = new ArrayList<>();

    private double price;
    //create the getters and setters for all private instance variables
    // right-click => Generate => Getters and Setters => select all private instance variables


    //create a pizza with the size of the pizza and the toppings

    /**
     * The one and only constructor to create a PizzaOrder object
     * @param size The size of the pizza as a string
     * @param toppings an unlimited amount of toppings as string
     */
    public PizzaOrder(String size, String... toppings){
        //datatype... => unlimited amount of args
        setPizzaSize(size);
        setToppings(toppings);
        setNumberOfSlices();
        setPrice();
    }

    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    /**
     * Gets the price of the pizza
     * @return the price of the pizza as a double
     */
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        int basePrice = 5;
        int surcharge = switch (pizzaSize){
            default -> 1;
            case SMALL -> 2;
            case MEDIUM -> 3;
            case LARGE -> 4;
            case EXTRA_LARGE -> 5;
        };
        double pricePerSlice = 0.75;
        price = basePrice + surcharge + pricePerSlice * numberOfSlices;
    }
    public void setNumberOfSlices() {
        this.numberOfSlices = switch (pizzaSize){
            case SMALL -> 6;
            case MEDIUM -> 8;
            case LARGE -> 10;
            case EXTRA_LARGE -> 12;
            default -> 4;
        };
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    private void setNumberOfToppings(int numberOfToppings) {
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

    public String getToppings() {
        String value = "";
        for(String topping : toppings){
            value += topping + '\t';
        }
        return value;
    }

    public void setToppings(String[] toppings) {

        ArrayList<String> allowedToppings = new ArrayList<>();
        allowedToppings.add("pepperoni");
        allowedToppings.add("cheese");
        allowedToppings.add("pineapple");
        allowedToppings.add("bacon");
        allowedToppings.add("steak");
        allowedToppings.add("chicken");

        for(String topping : toppings){
            if(allowedToppings.contains(topping.toLowerCase())){
                numberOfToppings++;
                this.toppings.add(topping);
            }
        }

    }

    public static PizzaOrder SmallPepperoniPizza(){
        return new PizzaOrder("Small", "cheese", "pepperoni");
    }
    public static PizzaOrder MediumThreeToppingPizza(String topping1, String topping2, String topping3){
        return new PizzaOrder("medium", topping1, topping2, topping3);
    }

    //toString method: summarizes the instance variables of a class
    // right-click: generate : toString

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "numberOfSlices=" + numberOfSlices +
                ", numberOfToppings=" + numberOfToppings +
                ", pizzaSize=" + pizzaSize +
                ", toppings=" + toppings +
                ", price=" + price +
                '}';
    }
}

/*
    using the pizza size, create a number of slices value
        P       4
        S       6
        M       8
        L       10
        XL      12

        In the set number of slices

calculate a price: setPrice method
    5 is base price
    add a charge for each size: 1,  2, 3, 4, 5: P, S, M, L, XL
    add a charge of .75 per slice
 */