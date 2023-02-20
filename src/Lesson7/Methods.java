package Lesson7;

import java.util.Scanner;

public class Methods {
    // Scanner scanner = new Scanner(System.in); scanner class level

    public static void main(String[] args){
        getMyFullDetails("Archil", "Sikharulidze", 34, 171, 88.4);

        int sum = getIntegerSum(34, 45);
        int sum1 = getIntegerSum(12, 39);

        if (sum == sum1)
        {
            System.out.println("The numbers are equal...");
        } else
        {
            System.out.println("The numbers are not equal...");
        }

        // getDetailsThroughScanner();
        getNumbers(1, 2, 10, 11);
        getNumbers(101, -1, 2);

        System.out.println(sumPar(14, 25));
        System.out.println(sumPar(12.3, 18.9));
        System.out.println(sumPar(12.3, 18.9, 15));

        System.out.println(sumPar(12, 13)); // могут вызвать непонятицу, тут может быть и int & double
    }

    static void getMyFullDetails(String name, String surname, int age, int height, double weight)
    {
        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
        System.out.println("Your weight is: " + weight);
    }

    // не возвращаем значение, void
    static void noReturnValue()
    {
        System.out.println("Welcome"); // вывод в консоль, но не возвращение значения
    }
    static int getIntegerSum(int x, int y)
    {
        return x + y;
    }

    static Scanner returnScanner()
    {
        Scanner scanner = new Scanner(System.in);

        return scanner;
    }

    static void getDetailsThroughScanner()
    {
        String name = returnScanner().nextLine();
        String surname = returnScanner().nextLine();
        int age = returnScanner().nextInt();

        returnScanner().close();

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
    }

    // (int ... numbers, int age) -> mistake
    // (int age, int ... numbers) -> right
    static void getNumbers(int ... numbers) // int[] numbers, varargs
    {
        for (int el : numbers)
        {
            System.out.println(el);
        }
    }

    static int sumPar(int x, int y) // method signature
    {
        return x + y;
    }

    static double sumPar(double x, double y)
    {
        return x + y;
    }

    static double sumPar(double x, double y, int z)
    {
        return x + y + z;
    }
}
