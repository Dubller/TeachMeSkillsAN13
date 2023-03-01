package Lesson8.AdvancedOOP;

public class Mercedes extends Cars{
    public Mercedes(String model, String color, int productionYear, int maxSpeed, String[] sparParts) {
        super(model, color, productionYear, maxSpeed, sparParts);
    }

    public Mercedes(String model, String color, int productionYear, int maxSpeed) {
        super(model, color, productionYear, maxSpeed);
    }

    public Mercedes(Cars mercedes) {
        super(mercedes);
    }
}
