package OOPIntro;

public class Car {
    String model; // null != "Unknown"
    String color; // null
    double weight; // 0
    int productionYear; // 0
    int maxSpeed; // 0
    boolean enginedWorks;

    public Car()
    {
//        model = "Unknown";
//        color = "Unknown";
//        weight = 0;
//        productionYear = 0;
//        maxSpeed = 0;
    }

    public Car(String carModel, String carColor, double carWeight, int carYear, int carSpeed)
    {
        model = carModel;
        color = carColor;
        weight = carWeight;
        productionYear = carYear;
        maxSpeed = carSpeed;
    }

    public Car(String model, String color)
    {
        this.model = model;
        this.color = color;
    }

    public void getCarDetails()
    {
        System.out.println("Car model is: " + model);
        System.out.println("Car color is: " + color);
        System.out.println("Car production year is: " + productionYear);
        System.out.println("Car weight is: " + weight);
        System.out.println("Car max speed is: " + maxSpeed);
    }

    public void startCar()
    {
        this.enginedWorks = true;
        System.out.println("Car started moving...");
    }

    public void stopCar()
    {
        this.enginedWorks = false;
        System.out.println("Car stopped moving...");
    }

    public void carStatus()
    {
        if (enginedWorks)
        {
            System.out.println("Car is driving...");
        } else
        {
            System.out.println("Car is stopped...");
        }
    }
}