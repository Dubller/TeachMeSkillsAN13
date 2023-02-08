import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        checkLogicalNo();
        switchOperator();
        // getMySymbol();
        // enterMyDetails();
        // getRandomNumbers();
        // loops();
        // enterNumbers();
        // oneDimensionalArray();
        // setArraySize();
        workWithArrays();
    }

    static void checkLogicalNo()
    {
        // ==
        // <
        // >
        // <=
        // >=
        // !

        boolean married = false;

        if (!married) // if (married != true)
        {
            System.out.println("Your are married.");
        } else
        {
            System.out.println("You are not married.");
        }

        int x = 10;
        int z = 1;

        if (!(x == z))
        {
            System.out.println("Numbers are equal");
        }
    }

    static void switchOperator()
    {
        int num = 12;

        switch(num)
        {
            case 10: // if (num == 10)
                System.out.println("Num equals " + num);
                break;
            case 11:
                System.out.println("Num does not equal 10");
                break;
            case 12:
            case 13:
                System.out.println("You got this message if you have 12 or 13");
                break;
            default:
                System.out.println("Number does not equal 10 or 11");
                break;
        }
    }

    static void getMySymbol()
    {
        System.out.print("Please, enter symbols from a to d: ");

        Scanner symbol = new Scanner(System.in);

        String mySymbol = symbol.nextLine();

        switch (mySymbol)
        {
            case "a":
                System.out.println("You have entered lower a");
                break;
            case "b":
                System.out.println("You have entered lower b");
                break;
            case "c":
                System.out.println("You have entered lower c");
                break;
            case "d":
                System.out.println("You have entered lower d");
                break;
            default:
                System.out.println("You have entered the wrong value.");
        }

        symbol.close();
    }

    static void enterMyDetails()
    {
        Scanner data = new Scanner(System.in);

        System.out.print("Please, enter you family name: ");
        String name = data.nextLine();

        System.out.print("Please, enter your age: ");
        int age = Integer.parseInt(data.nextLine()); // Integer.parseInt, Double.parseDouble, String.parseString()

        System.out.print("Please, enter where do you live: ");
        data.nextLine();

        data.close();
    }

    static void getRandomNumbers()
    {
        Random randomNumber = new Random();
        int getRandomNumberFullInteger = randomNumber.nextInt(); // full integer scale
        int getRandomNumberWithMax = randomNumber.nextInt(10); // 0 - 9
        int getRandomNumberMinMax = randomNumber.nextInt(-100, 100); // min & max

        System.out.println("Your random number with full integer is: " + getRandomNumberFullInteger);
        System.out.println("Your random number with max 10 is: " + getRandomNumberWithMax);
        System.out.println("Your random number with min and max is: " + getRandomNumberMinMax);
    }

    static void loops()
    {
        // while()
        // do while()
        // for ()

        int numberOfLines = 1;

        while(numberOfLines <= 10)
        {
            System.out.println("Line number " + numberOfLines);
            numberOfLines++;
        }

        numberOfLines = 1;
        System.out.println();

        do
        {
            System.out.println("Line number " + numberOfLines);
            numberOfLines++;
        } while(numberOfLines <= 10);

        System.out.println();

        for (int numberLines = 1; numberLines <=10; numberLines++)
        {
            System.out.println("Line number " + numberLines);
        }
    }

    static void enterNumbers()
    {
        Scanner numbers = new Scanner(System.in);

        for (int counter = 1; counter <= 10; counter++)
        {
            System.out.print("Number " + counter + ": ");
            numbers.nextInt();
        }
        numbers.close();
    }

    static void oneDimensionalArray()
    {
        // Array - массив
        int[] numbers = new int[10]; // одномерный массив с памятью в 10 цифл типа int
        String[] names = new String[10];

        // int[] numbers;
        // numbers = new int[10];

        char[] symbols = new char[] {'A', 'B', 'C', 'D'}; // char[] symbols = new char[4] {'A', 'B', 'C', 'D'};

        System.out.println("My first char symbol is: " + symbols[1]);

        numbers[0] = 1;
        numbers[1] = 2;

        for (int index = 0; index < symbols.length; index++)
        {
            System.out.println(symbols[index]);
        }

        System.out.println(Arrays.toString(symbols));
    }

    static void setArraySize()
    {
        Scanner arrayElements = new Scanner(System.in);

        int[] numbers = new int[arrayElements.nextInt()];

        for (int index = 0; index < numbers.length; index++)
        {
            numbers[index] = index;
        }

        System.out.println(Arrays.toString(numbers));

        arrayElements.close();
    }

    static void workWithArrays()
    {
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        int[] numbers2 = new int[10];

        for (int index = 0; index < numbers.length; index ++)
        {
            numbers2[index] = numbers[index];
        }

        System.out.println(Arrays.toString(numbers2));

        String[] names = new String[] {"Archil", "Ilona", "Kiril", "Igor"};
        String[] selectedNames = new String[names.length];

        selectedNames = Arrays.copyOf(names, names.length);

        System.out.println(Arrays.toString(selectedNames));

        System.out.println(Arrays.compare(names, selectedNames));
    }
}