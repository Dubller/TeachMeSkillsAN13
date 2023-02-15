package OOPIntro;

public class MyMain {
    public static void main(String[] args){
        Car unknownCar = new Car();
        Car bmw = new Car("BWM", "Green", 1400, 2001, 230);
        Car mercedes = new Car("Mercedes", "Red");
        Car opel = new Car("Opel", "Grey", 700, 1988, 150);

        System.out.println("By default maxSpeed: " + unknownCar.maxSpeed);
        System.out.println("By default weight: " + unknownCar.weight);
        System.out.println("By default car model: " + unknownCar.model);
        System.out.println("Boolean by default: " + unknownCar.enginedWorks);

        System.out.println();
        System.out.println("Car model is: " + bmw.model);
        System.out.println("Car color is: " + bmw.color);
        System.out.println("Car production year is: " + bmw.productionYear);
        System.out.println("Car weight is: " + bmw.weight);
        System.out.println("Car max speed is: " + bmw.maxSpeed);

        System.out.println();
        System.out.println("Car model is: " + mercedes.model);
        System.out.println("Car color is: " + mercedes.color);
        System.out.println("Car production year is: " + mercedes.productionYear);
        System.out.println("Car weight is: " + mercedes.weight);
        System.out.println("Car max speed is: " + mercedes.maxSpeed);

        System.out.println();
        opel.getCarDetails();

        System.out.println();
        opel.carStatus();
        opel.startCar();
        opel.carStatus();
        opel.stopCar();
        opel.carStatus();

        System.out.println();

        if (bmw.maxSpeed > opel.maxSpeed)
        {
            System.out.println(bmw.model + " is faster than " + opel.model);
        }

//        System.out.println("Car model is: " + cars.model);
//        System.out.println("Car color is: " + cars.color);
//        System.out.println("Car production year is: " + cars.productionYear);
//        System.out.println("Car weight is: " + cars.weight);
//        System.out.println("Car max speed is: " + cars.maxSpeed);
//
//        System.out.println();
//        cars.model = "Mercedes";
//        cars.color = "White";
//        cars.productionYear = 2005;
//        cars.weight = 1000;
//        cars.maxSpeed = 250;
//        System.out.println("Car model is: " + cars.model);
//        System.out.println("Car color is: " + cars.color);
//        System.out.println("Car production year is: " + cars.productionYear);
//        System.out.println("Car weight is: " + cars.weight);
//        System.out.println("Car max speed is: " + cars.maxSpeed);
    }
}
