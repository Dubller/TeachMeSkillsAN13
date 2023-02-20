package OOPBasis;

public class MyMain {
    public static void main(String[] args)
    {
        // OOP: инкапсуляция и наследование
//        Cars bmw = new Cars();
//        bmw.setModel("BMW");
//        bmw.setColor("Red");
//        bmw.setProductionYear(2014);

//        Cars[] cars = { new Cars(),
//                        new Cars("MBW", "White", 2000),
//                        new Cars("Mercedes", "Red", 2002)};
//
//        for (int car = 0; car < cars.length; car++)
//        {
//            cars[car].getFullDetails();
//            System.out.println();
//        }

        // Наследование
        // Общий чертеж объекта -> Cars

        Cars[] cars = { new Jeep("BMW", "Red", 2003),
                        new Sedan("Mercredes", "Black", 2001),
                        new Jeep("Opel", "Green", 2021)};

        cars[0].getFullDetails();
        System.out.println();
        cars[1].getFullDetails();
        System.out.println();

        cars[0].drive();
    }
}
