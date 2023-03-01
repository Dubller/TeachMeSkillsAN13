package Lesson8.Inheritance;

public class BMW extends Cars implements Highlander {
    // Множественное наследование запрещено
    public BMW()
    {
        setModel("BMW");
    }

    public BMW(String model, String color, int productionYear, int maxSpeed)
    {
        super(model, color, productionYear, maxSpeed); // super - вызов конструктора главного объекта - Cars
    }

    public BMW(String color, int productionYear, int maxSpeed)
    {
        super(color, productionYear, maxSpeed); // super - вызов конструктора главного объекта - Cars
        setModel("BMW");
    }

    @Override
    public void additionalInformation() {
        System.out.println("This car is a BMW. It has additional information...");
    }

    @Override
    public void getJeepDetails() {
        System.out.println("BMW implements Interface with getJeepDetails");
    }

    @Override
    public void getAdditionalInfo() {
        System.out.println("BMW implements Interface with getAdditionalInfo");
    }
}