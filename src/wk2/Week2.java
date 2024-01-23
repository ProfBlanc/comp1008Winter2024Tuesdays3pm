package wk2;

import java.util.Random;
import java.util.Scanner;

public class Week2 {

    //psvm + tab
    public static void main(String[] args) {

        //task2();
        //typecasting();
//        guessingGame();
        creatingObject();
    }

    static void creatingObject(){

        GuessingGame guessingGame = new GuessingGame(1, 10);
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter a number");
            int number = input.nextInt();

            if(guessingGame.checkUserGuess(number)){
                System.out.println("Correct");
                break;
            }
            else{
                System.out.println("Incorrect");
            }
        }
        while(true);
        System.out.println(guessingGame.numberToGuess);
    }

    static void guessingGame(){
        /*
        Ask the user to guess a number between 1 and 10.
        Allow the user a maximum of 3 guesses.
        If guesses correctly
            congratulate them
        if guesses incorrectly.
            message: number is higher or lower
         */
        //what variables do we need?
        //random number => Random object   => random.nextInt(min, max)
        //keep track of guesses
        // Scanner to user input

        Random random = new Random();
        int trackNumberOfGuesses = 0;
        int MAX_NUMBER_OF_GUESSES = 3, MIN_VALUE = 1, MAX_VALUE = 10;
        int numberToGuess = random.nextInt(MIN_VALUE, MAX_VALUE + 1);
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our game.");
        System.out.printf("You will have %d guess to guess a number" +
                " between %d & %d%n", MAX_NUMBER_OF_GUESSES, MIN_VALUE, MAX_VALUE);

        while(trackNumberOfGuesses < MAX_NUMBER_OF_GUESSES){

            System.out.printf("Enter guess number %d of %d: %n", trackNumberOfGuesses + 1, MAX_NUMBER_OF_GUESSES);
            int userGuess = input.nextInt();

            if(userGuess == numberToGuess){
                System.out.println("Congrats! You win! The number was indeed " + numberToGuess);
                break;
            }
            else{
                String hint = userGuess < numberToGuess ? "higher" : "lower";
                System.out.printf("Incorrect. Please guess a %s number%n", hint);
            }

            trackNumberOfGuesses++;
        }

    }

    static void greet(String name){
        greet(name, 18);
    }
    static void greet(String name, int age){
        System.out.printf("Hello %s. You are %d years old.",
                name, age);
    }
    static void greet(int age, String name){
        greet(name, age);
    }

    static void outputNumber(double n){
        System.out.println("Value is " + n + " from double arg");
    }

//    static void outputNumber(byte n){
//        System.out.println("Value is " + n + " from byte arg");
//    }
    static void workingWithMethods(){
        outputNumber((byte)123);
        outputNumber(1234);
    }

    static void task1() {

        /*
            Ask user for their name
            Ask user for the year they were born

            Output how old they are in
                years
                months
                days
                seconds
         */
        // create variables that we need
        int age, years, months, days, seconds, year;
        int currentYear = 2024;
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Enter your name");
        name = input.nextLine();
        System.out.println("Enter birth year");
        year = input.nextInt();

        years = currentYear - year;
        months = years * 12;
        days = years * 365;
        seconds = 60 * 60 * 24 * 365 * years;

        //souf + tab

        System.out.printf("Hello %s. You are %d years old. " +
                        "In months, that makes %d. " +
                        "In days, that makes %d. " +
                        "In seconds, that makes %d",
                name, years, months, days, seconds
        );


    }

    /*
    Task 2

    You are a transport.
    You transport stuff
    You charge by the pound: how much? $10/pound.
    Your truck can only fit 50 pounds of weight.

    Ask user how many pounds of material they need to transport
    Output how many trips you need to transport all material
    Output the price of your services

    Sample
    40lbs of material
        1 trip  $400

    325lbs of material
        7 trips
            $3250

     */
    static void task2() {
        Scanner input = new Scanner(System.in);
        int maxPounds = 50;
        int costPerTrip = 10;

        System.out.println("Enter how many pounds that you would like to transport");
        int userRequest = input.nextInt();

        int cost = userRequest * costPerTrip;
        int trips = userRequest % maxPounds != 0 ? (userRequest / maxPounds) + 1 : userRequest / maxPounds;

        System.out.printf("Your cost is %d because I need to make %d trips because you've " +
                "requested that I transport %d pounds. ", cost, trips, userRequest);


    }

    static void typecasting(){

        String s1 = "123";
        int v1 = Integer.parseInt(s1);
        float v2 = Float.parseFloat(s1);

        byte v3 = 123;
        //promote       implicity typecasting   smaller to bigger
        int v4 = v3;

        short v5 = (short)v4;


        int v6 = 130;
        byte v7 = (byte)v6;

/*
int
        127      128       129     130
byte
        127     -128        -127    -126
-128-127


 */
        System.out.println(v7);
    }
}