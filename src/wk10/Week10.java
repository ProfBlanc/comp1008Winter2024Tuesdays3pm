package wk10;

public class Week10 {

    static void example9(){}
    static void example8(){}
    static void example7(){}
    static void example6(){}
    static void example5(){}
    static void example4(){
        //super             //sub
        Human h1 = new Superhero();

        /*
         general                        specific

            Animal          Cat         Tiger


         */

        h1.breathe();

        //Superhero sh = new Human();

    }
    static void example3(){
        Human bruceWayne = new Human("Bruce Wayne", 35, 220, 180);
        Superhero batman = new Superhero(bruceWayne, "Batman", "rich", 1234);

        System.out.println(bruceWayne);
        System.out.println(batman);

        bruceWayne.breathe();
        batman.breathe();

    }
    static void example2(){

        Human bruce = new Human();

        Superhero batman = new Superhero();
        //bruce.fight();
        batman.fight("Someone");

        Superhero batman1 = new Superhero();

    }
    static void example1(){
        Human bruceWayne = new Human("Bruce Wayne", 35, 220, 180);
        System.out.println(bruceWayne);
        bruceWayne.walk();
        bruceWayne.breathe();

        System.out.println("-".repeat(20));

        Superhero batman = new Superhero();
        System.out.println(batman);
        batman.walk();
        batman.breathe();

    }
    public static void main(String[] args) {
        example4();
    }
}
