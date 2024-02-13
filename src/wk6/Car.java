package wk6;

import java.util.ArrayList;

public class Car {
    private String color = "black";
    private int doors = 2;
    private double speed;
    enum TransmissionTypes {MANUAL, AUTO, CVT}
    private TransmissionTypes transmission = TransmissionTypes.AUTO;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        ArrayList<String> allowedColors = new ArrayList<>();
        allowedColors.add("black");
        allowedColors.add(0,"blue");
        allowedColors.add(1, "white");

        if(allowedColors.contains(color.toLowerCase()))
            this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors == 2 || doors == 4 || doors == 5)
            this.doors = doors;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed >= 0 && speed <= 400)
            this.speed = speed;
    }

    public TransmissionTypes getTransmission() {
        return transmission;
    }

    public void setTransmission(TransmissionTypes transmission) {
        this.transmission = transmission;
    }
    public void setTransmission(String transmission){
        this.transmission = switch (transmission.toLowerCase()){
            case "auto"-> TransmissionTypes.AUTO;
            case "manual"-> TransmissionTypes.MANUAL;
            default -> TransmissionTypes.CVT;
        };

    }
}
