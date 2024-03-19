package wk10;

public class Human {

    String name;
    private int age;
    protected double weight;
    public double height;

    public Human(){}
    public Human(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void breathe(){
        System.out.println(name + " is breathing");
    }
    void walk(){
        System.out.println(name + ", with a weight of " + weight + " is walking");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
