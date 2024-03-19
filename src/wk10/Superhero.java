package wk10;

public class Superhero extends Human{

    String superHeroName, superPower;
    double strength;

    public Superhero(){}

    public Superhero(String name, int age, double weight, double height) {
        super(name, age, weight, height);
    }
    public Superhero(Human human, String superHeroName, String superPower, double strength){

        super(human.name, human.getAge(), human.weight, human.height);
        this.superPower = superPower;
        this.superHeroName = superHeroName;
        this.strength = strength;

    }

    void fight(String opponent){
        System.out.println(superHeroName + " is fighting " + opponent);
    }

    void testMethod(){
        name = "Superhero";
        height = 200;
        weight = 111;
        //age = 12;
    }

    @Override
    public String toString(){

        int lastChar = super.toString().length() - 1;

        return "Superhero" + super.toString().substring(5, lastChar)
                + String.format(", SuperHero Name = %s, Super Power = %s, " +
                "Strength = %.0f%n", superHeroName, superPower, strength)
                ;
    }

    @Override
    void breathe(){
        System.out.println(superHeroName + " doesn't breathe. " + superHeroName +" just fights!");
    }
}
