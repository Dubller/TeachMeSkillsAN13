package Lesson8.ConstructorCpy;

import java.util.Arrays;

public abstract class Cars {
    private String model;
    private String color;
    private int productionYear;
    private String[] sparParts;

    public Cars(String model, String color, int productionYear, String[] sparParts)
    {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.sparParts = Arrays.copyOf(sparParts, sparParts.length);
    }

    public Cars(Cars source)
    {
        this.model = source.model;
        this.color = source.color;
        this.productionYear = source.productionYear;
        this.sparParts = Arrays.copyOf(source.sparParts, source.sparParts.length);
    }

    @Override
    public String toString() {
        return model + " " + color + " " + productionYear;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}
