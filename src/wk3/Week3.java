package wk3;

import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {
        example3();
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
    static void example4(){}
    static void example5(){}
    static void example6(){}
    static void example7(){}
    static void example8(){}
    static void example9(){}
    static void example10(){}
}
