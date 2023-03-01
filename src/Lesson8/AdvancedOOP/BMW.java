package Lesson8.AdvancedOOP;

public class BMW extends Cars{
    public BMW(String model, String color, int productionYear, int maxSpeed, String[] sparParts) {
        super(model, color, productionYear, maxSpeed, sparParts);
    }

    public BMW(String model, String color, int productionYear, int maxSpeed) {
        super(model, color, productionYear, maxSpeed);
    }

    public BMW(Cars bmw) {
        super(bmw);
    }
}
