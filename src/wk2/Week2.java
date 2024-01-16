package wk2;

import java.util.Scanner;

public class Week2 {

    //psvm + tab
    public static void main(String[] args) {

        task2();
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
}