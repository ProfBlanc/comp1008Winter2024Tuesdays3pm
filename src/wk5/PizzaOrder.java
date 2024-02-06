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
}
