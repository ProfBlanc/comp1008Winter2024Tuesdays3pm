package wk1;

import java.util.Scanner;

public class Week1 {

    // psvm + tab

    public static void main(String[] args) {
        // ask user for their age.
        // output their age.
        // output how old they will be in 10 years from now.

        //ask user to input
        // output a message
        // save the user input

        Scanner input = new Scanner(System.in);
        //sout + tab
        System.out.print("Enter your age: ");
        byte age = input.nextByte();// 2 ^ 8 = 256: -128     127

        System.out.printf("You are %d years old. In ten years, you will be %d years old.%n",
                age, age+10
        );

    }

}
