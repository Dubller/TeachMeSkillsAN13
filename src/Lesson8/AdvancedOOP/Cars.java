package Lesson8.AdvancedOOP;

import java.util.Arrays;

public abstract class Cars {
    private String model;
    private String color;
    private int productionYear;
    private int maxSpeed;
    private String[] sparParts;

    public Cars(String model, String color, int productionYear, int maxSpeed, String[] sparParts)
    {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
        this.sparParts = Arrays.copyOf(sparParts, sparParts.length);
    }

    public Cars(String model, String color, int productionYear, int maxSpeed)
    {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
        this.sparParts = new String[]{"None"};
    }

    public Cars(Cars source)
    {
        this.model = source.model;
        this.color = source.color;
        this.productionYear = source.productionYear;
        this.maxSpeed = source.maxSpeed;
        this.sparParts = Arrays.copyOf(source.sparParts, source.sparParts.length);
    }

    public String toString()
    {
        return  "Car mode: " + this.model + "\n" +
                "Car color: " + this.color + "\n" +
                "Car production year: " + this.productionYear + "\n" +
                "Car maximum speed: " + this.maxSpeed + "\n" +
                "Car spar parts are: " + Arrays.toString(this.sparParts) + "\n";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String[] getSparParts() {
        return Arrays.copyOf(sparParts, sparParts.length); // to avoid reference
    }

    public void setSparParts(String[] sparParts) {
        this.sparParts = Arrays.copyOf(sparParts, sparParts.length);
    }

    public void search()
    {

    }
}
