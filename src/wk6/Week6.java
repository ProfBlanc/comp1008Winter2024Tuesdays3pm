package wk6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Week6 {

    //psvm+tab
    public static void main(String[] args) {
        example2();
    }
    static void example1(){

        //arraylist is a dynamic collection of reference data types
        // a calendar that points to events

        //primitive data types have a reference class-wrapper
        //int, Integer  char, Character
        // double, byte, boolean, short float => uppercase first letter

        ArrayList<Float> arrayList = new ArrayList<>(5);
        arrayList.add(1.23F);
        arrayList.add(1.234F);
        arrayList.add(1.235F);
        arrayList.add(1.236F);
        //add(), contains(), remove(index: int, value: object), indexOf(value)
        //add(index, value), size()
        arrayList.remove(0);
        arrayList.add(1, 123f);

    }
    static void example2(){

        //create an arraylist of 10 short values
        // each value is a random number between -100 & 100
        // ask the user for a number
        // determine if this number exists in the arraylist
            //yes, output the position (index)
            // no, output a sorry message

        //declare your variable
        //Scanner, Random, array list of Short, var to store user guess
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Short> arrayList = new ArrayList<>(10);
        short userGuess = 0;
        //use loop, and add random values between -100 and 100
        for(int i = 0; i < 10; i++){
            arrayList.add( (short) random.nextInt(-100, 101)  );
        }
        // ask the user for a Short value
        System.out.println("Enter a value to guess");
        userGuess = input.nextShort();
        // use a method to determine if value is found => output the index || sorry msg
        if(arrayList.contains(userGuess)){
            System.out.printf("The value of %d was located at index %d%n", userGuess,
                    arrayList.indexOf(userGuess));
        }
        else{
            System.out.println("Sorry but the value of " + userGuess + " was not found");
        }
        // take up at 3:30
    }
    static void example3(){}
    static void example4(){}
    static void example5(){}
}
