package Lesson8.Inheritance;

public class Main {
    public static void main(String[] args)
    {
        //Cars mercedes = new Mercedes("White", 2018, 320);
        //Cars bmw = new BMW();
        //Cars opel = new Opel();

        //opel.getCarDetails();
        //System.out.println();
        //bmw.getCarDetails();
        //System.out.println();
        //mercedes.getCarDetails();

        Cars[] catalogue = new Cars[]
                {
                        new BMW("Black", 2005, 310),
                        new Mercedes("White", 2015, 320),
                        new Opel("Grey", 2005, 220)
                };

        for (Cars car : catalogue)
        {
            car.getCarDetails();
            System.out.println();
        }

        System.out.println();
        catalogue[0].additionalInformation();
        catalogue[1].additionalInformation();
        catalogue[2].additionalInformation();
    }
}
