package Lesson8.AdvancedOOP;

public class Opel extends Cars{
    public Opel(String model, String color, int productionYear, int maxSpeed, String[] sparParts) {
        super(model, color, productionYear, maxSpeed, sparParts);
    }

    public Opel(String model, String color, int productionYear, int maxSpeed) {
        super(model, color, productionYear, maxSpeed);
    }

    public Opel(Cars opel) {
        super(opel);
    }
}
