package HomeWork5;

import java.util.Scanner;

public class MyMain {
    // Scanner scanner = new Scanner(System.in); scanner class level

    public static void main(String[] args){
        CreditCart creditCart = new CreditCart(); // empty

        creditCart.getAmountOnAccount();

        creditCart.addMoneyToAccount(30);
        creditCart.getAmountOnAccount();

        creditCart.addMoneyToAccount(25);
        creditCart.getAmountOnAccount();

        creditCart.getMoneyFromAccount(10);
        creditCart.getAmountOnAccount();

        getMyFullDetails("Archil", "Sikharulidze", 34, 171, 88.4);
        System.out.println();

        System.out.println(returnScanner());
        int sum = getIntegerSum(34, 45);
        int sum1 = getIntegerSum(12, 39);

        if (sum == sum1)
        {
            System.out.println("The numbers are equal...");
        } else
        {
            System.out.println("The numbers are not equal...");
        }

        getDetailsThroughScanner();
    }

    static void getMyFullDetails(String name, String surname, int age, int height, double weight)
    {
        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
        System.out.println("Your weight is: " + weight);
    }

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
}
