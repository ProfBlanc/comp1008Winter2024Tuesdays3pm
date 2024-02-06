package wk5;

import java.util.ArrayList;

public class Week5 {

    public static void main(String[] args) {

        //example1();
        PizzaOrder pizzaOrder = new PizzaOrder("large", "cheese", "pepperoni", "green peppers");
        System.out.println(pizzaOrder.getToppings());
        System.out.println(pizzaOrder.getNumberOfToppings());
        System.out.println(pizzaOrder.getPizzaSize());

    }
    static void example3(){
        example2();
        example2("Hello");
        example2("Hello", "World");
        example2("Hi", "Bye", "Dry");

    }
    static void example2(String... items){
        //enhanced for loop
        //for(DataType placeHolderName : collection (array, arraylist)
        for(String item : items){
            System.out.println(item);
        }
    }
    static void example1(){
        //ArrayList<DataType> name = new ArrayList<>
        ArrayList<String> something = new ArrayList<>();

        ArrayList<Integer> nums = new ArrayList<>();

        ArrayList<Byte> bytes = new ArrayList<>();
        bytes.add((byte)100);
        ArrayList<Double> doubles = new ArrayList<>(2);

        doubles.add(1d);
        doubles.add(2d);
        doubles.add(3d);

        System.out.println(doubles.size());
        System.out.println(doubles.get(1));
        doubles.add(1, 11d);
        doubles.set(2, 22d);

    }
}
