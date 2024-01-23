package wk3;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Week3 {

    public static void main(String[] args) {
        example5();
    }
    static void example1(){

      Laptop dell = new Laptop();  //constructor

        System.out.println(dell.make);
        System.out.println(dell.storage);

        dell.make = "Dell";
        dell.model = "inspiron";
        dell.cpu="i5";
        dell.color="grey";
        dell.weight = 7.2;
        dell.storage = 1000000000;
        dell.dimensions[0] = 100;
        dell.dimensions[1] = 200;
        dell.dimensions[2] = 300;



    }
    static void example2(){

        Laptop dell = new Laptop("Dell", "inspiron", "grey", "i5", 10000000, 8.5,
                new double[]{10,20,30});


    }
    static void example3(){

        Scanner input = new Scanner(System.in);

        Cellphone c1 = new Cellphone();
        Cellphone c2 = new Cellphone("iPhone", 100, Cellphone.Memory.THIRTY_TWO,
                new double[]{123, 456,789}, false, true);

        System.out.println(c2.make);
        c2.make = "iiPhone";
        System.out.println(c2.screenSize);

        c2.screenSize = 123;
        System.out.println(c2.screenSize);

    }
    static void example4(){

        String[] names = new String[5];
        System.out.println(names[4]);
        System.out.println(names.length);

        int[] nums = new int[5];
        System.out.println(nums[2]);

        Person[] people = new Person[5];
        System.out.println(people[2]);

        double[] second = {1,2,3,4,5};
        System.out.println(second.length);
        System.out.println(second[2]);

        Object[] anyValues = {second[1], nums[0], people[2],
        names[3], true, "Cool!"};

        System.out.println(anyValues.length);
        System.out.println(anyValues[4]);

    }
    static void example5(){

        /*

                Monday          Tues            Wed

                python          java            co-op
                css             math            business
         */

        String[][] schedule1 = new String[3][2];
        schedule1[0][0] = "python";
        schedule1[0][1] = "css";
        schedule1[1][0] = "java";
        schedule1[1][1] = "math";
        schedule1[2][0] = "co-op";
        schedule1[2][1] = "business";

        System.out.println(schedule1[2][1]);


        String[][] schedule2 = {{"python", "css"},
                {"java", "math"}, {"co-op", "business"}};

        for(int i= 0; i < schedule2.length; i++){

            for(int j = 0; j < schedule2[i].length; j++){

                System.out.println(schedule2[i][j]);
            }
        }
    }
    static void example6(){}
    static void example7(){}
    static void example8(){}
    static void example9(){}
    static void example10(){}
}
