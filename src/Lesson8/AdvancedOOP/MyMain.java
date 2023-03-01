package Lesson8.AdvancedOOP;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args)
    {
        Cars[][] catalogue = {
                {       new Mercedes("Mercedes GL 50", "Red", 2022, 280, new String[]{"Wheel"}),
                        new Mercedes("Mercedes GLK 13", "Green", 2023, 240, new String[]{"Wheel", "Bumper"})
                },
                {
                        new BMW("BMW X5", "Black", 2020, 300),
                        new BMW("BMW X3", "Grey", 2018, 220),
                        new BMW("BMW X6", "Silver", 2023, 340)
                },
                {
                        new Opel("Opel Astra", "White", 2003, 180)
                }
        };

        getCatalogueCars(catalogue);
        System.out.println();
        getMaxSpeedCar(catalogue);
        System.out.println();
        System.out.println("-------------------------------------------------");

        // ----------------------------------------------------------------------------------------------------//
        // How to compare Objects
        Cars mercedesGL50 = new Mercedes(catalogue[0][0]);

        // Constructor copy
        System.out.println(mercedesGL50);
        System.out.println();

        // Constructor copy - change array
        mercedesGL50.setSparParts(new String[]{"Back Part", "Windows", "Wheel"});
        System.out.println(mercedesGL50);

        System.out.print("Please enter a car model: ");

        if (!searchCars(scanner(), catalogue))
        {
            System.out.println("No such car has been found.");
        }
    }

    public static void getCatalogueCars(Cars[][] catalogue)
    {
        for(Cars[] cars : catalogue)
        {
            for(Cars models : cars)
            {
                System.out.println(models);
            }
        }
    }

    public static void getMaxSpeedCar(Cars[][] catalogue)
    {
        int carIndexRow = 0;
        int carIndexCol = 0;

        for (int cars = 0, maxSpeed = 0; cars < catalogue.length; cars++)
        {
            for (int car = 0; car < catalogue[cars].length; car++)
            {
                if (maxSpeed < catalogue[cars][car].getMaxSpeed())
                {
                    maxSpeed = catalogue[cars][car].getMaxSpeed();
                    carIndexRow = cars;
                    carIndexCol = car;
                }
            }
        }

        System.out.println("The car with maximum speed is: ");
        System.out.println(catalogue[carIndexRow][carIndexCol]);
    }

    static public Scanner scanner()
    {
        return new Scanner(System.in);
    }

    static boolean searchCars(Scanner scanner, Cars[][] catalogue)
    {
        String model = scanner.nextLine();
        boolean carFound = false;

        for (int cars = 0; cars < catalogue.length; cars++)
        {
            for (int car = 0; car < catalogue[cars].length; car++)
            {
                if (catalogue[cars][car].getModel().contains(model))
                {
                    System.out.println(catalogue[cars][car].toString());
                    if (!carFound) carFound = true;
                }
            }
        }
        return carFound;
    }
}
