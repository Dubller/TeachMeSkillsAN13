package Lesson8.Inheritance;

public class Cars {
    // Inheritance (наследование) - выстраивание иерархии объектов от общего к конкретному;
    // это приобретение свойств и переменных высшего объекта

    // Polymorphism - один интерфейс, множественная реализация
    private String model;
    private String color;
    private int productionYear;
    private int maxSpeed;

    public Cars()
    {
        this.model = "Unknown";
        this.color = "Unknown";
    }

    public Cars(String model, String color, int productionYear, int maxSpeed)
    {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
    }

    public Cars(String color, int productionYear, int maxSpeed)
    {
        this.color = color;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
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

    public void getCarDetails()
    {
        System.out.println("Car model: " + this.model);
        System.out.println("Car color: " + this.color);
        System.out.println("Car production year: " + this.productionYear);
        System.out.println("Car maximum speed: " + this.maxSpeed);
    }

    public void additionalInformation()
    {
        System.out.println("No additional information.");
    }
}
