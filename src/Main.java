import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        // Task 1. Сравнить две целочисленные значения. Вывести найбольшее.
        compareNumbers();
        compareSoftwareDevelopers();
    }

    // Task 1. Сравнить две целочисленные значения. Вывести найбольшее.
    static void compareNumbers()
    {
        // int x, y, z;
        // int x = 19, y = 19, z = -5;
        // int x = y = z = 10;

        int x = 0;
        int y = 15;
        int z = -1;

//        int temp = 0;

//        if (temp < y)
//        {
//            temp = y;
//        }
//
//        if (temp < z)
//        {
//            temp = z;
//        }
//
//        if (temp < x)
//        {
//            temp = x;
//        }

//        System.out.println("Your highest number is: " + temp);

        if (x < y)
        {
            x = y;
        } else if (x < z)
        {
            x = z;
        }

        System.out.println("You highest number is: " + x);

        int num1 = 10;
        int num2 = 15;

//        if (num1 > num2)
//        {
//            System.out.println("The biggest number is: " + num1);
//        } else
//        {
//            System.out.println("The biggest number is: " + num2);
//        }

        System.out.printf("Your highest number is: %d\n", (num1 > num2) ? num1 : num2); // (logic) ? option 1 : option 2
    }

    // Task 2. Сравнение количества программистов и грамматические оборот
    static void compareSoftwareDevelopers() {
        int softwareDevelopers = 20;

        if (softwareDevelopers == 1) {
            System.out.println("У нас на работе " + softwareDevelopers + " программист");
        } else if (softwareDevelopers >= 1 && softwareDevelopers < 5) {
            System.out.println("У нас на работе " + softwareDevelopers + " программиста");
        } else if (softwareDevelopers >= 5 && softwareDevelopers < 21) {
            System.out.println("У нас на работе " + softwareDevelopers + " программистов");
        }
    }
}