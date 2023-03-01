package Lesson8.Inheritance;

public class Opel extends Cars implements Highlander, LowBudgetCars{
    public Opel()
    {
        setModel("Opel");
    }

    public Opel(String model, String color, int productionYear, int maxSpeed)
    {
        super(model, color, productionYear, maxSpeed); // super - вызов конструктора главного объекта - Cars
    }

    public Opel(String color, int productionYear, int maxSpeed)
    {
        super(color, productionYear, maxSpeed); // super - вызов конструктора главного объекта - Cars
        setModel("Opel");
    }

    @Override
    public void additionalInformation() {
        System.out.println("This car is a Opel. It has additional information...");
    }

    @Override
    public void getJeepDetails() {

    }

    @Override
    public void getAdditionalInfo() {

    }
}