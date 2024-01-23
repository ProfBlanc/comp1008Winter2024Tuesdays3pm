package wk3;

public class Person {
    private String name = "Ben";
    private byte age = 1;
    private double weight = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3)
            this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age >= 1 && age <=120)
            this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight >= 1 && weight <= 12345)
            this.weight = weight;
    }

    public Person(){}

    public Person(String name, byte age, double weight) {

        setName(name);
        setAge(age);
        setWeight(weight);

    }
}
