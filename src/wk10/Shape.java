package wk10;

public abstract class Shape {

    String name;
    int sides;
    public Shape(){}
    public Shape(String name, int sides){
        this.name = name;
        this.sides = sides;
    }
    public boolean isEvenSided(){
        return sides >0 && sides % 2 == 0;
    }

    //abstract methods
    //area, perimeter
    public abstract double area();
    public abstract int perimeter();
}





