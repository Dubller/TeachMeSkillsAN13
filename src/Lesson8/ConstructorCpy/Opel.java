package Lesson8.ConstructorCpy;

public class Opel extends Cars{
    public Opel(String model, String color, int productionYear, String[] sparParts) {
        super(model, color, productionYear, sparParts);
    }

    public Opel(Cars source)
    {
        super(source);
    }
}