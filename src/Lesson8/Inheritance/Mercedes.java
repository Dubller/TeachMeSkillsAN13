package Lesson8.Inheritance;

public class Mercedes extends Cars implements Highlander{
    public Mercedes()
    {
        setModel("Mercedes");
    }

    public Mercedes(String model, String color, int productionYear, int maxSpeed)
    {
        super(model, color, productionYear, maxSpeed); // super - вызов конструктора главного объекта - Cars
    }

    public Mercedes(String color, int productionYear, int maxSpeed)
    {
        super(color, productionYear, maxSpeed); // super - вызов конструктора главного объекта - Cars
        setModel("Mercedes");
    }

    @Override
    public void additionalInformation() {
        System.out.println("This car is a Mercedes. It has additional information...");
    }

    @Override
    public void getJeepDetails() {

    }

    @Override
    public void getAdditionalInfo() {

    }
}
