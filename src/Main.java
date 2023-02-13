import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
//        twoDimensionalArray();
        breakPoints();
    }

    static void twoDimensionalArray()
    {
        int[] oneDimensionalArray = new int [] {1, 5, 8};
        int[][] twoDimensionalArray = new int[3][3];
        int[][] ticTacToeTable = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] irregularArray = {
                {7, 10, 9, 1},
                {1},
                {4, 9},
                {19, 20, 21, 34, -1}
        };

        int counter = 1;


        for (int index = 0; index < oneDimensionalArray.length; index++) // reading and modifying
        {
            System.out.println(oneDimensionalArray[index]);
        }

        for (int el : oneDimensionalArray) //foreach for reading only
        {
            System.out.println(el);
        }

        System.out.println(Arrays.toString(oneDimensionalArray));

        for (int rows = 0; rows < twoDimensionalArray.length; rows++)
        {
            for (int cols = 0; cols < twoDimensionalArray[rows].length; cols++)
            {
                twoDimensionalArray[rows][cols] = counter++;
            }
        }

        for (int rows = 0; rows < twoDimensionalArray.length; rows++)
        {
            for (int cols = 0; cols < twoDimensionalArray[rows].length; cols++)
            {
                System.out.print(twoDimensionalArray[rows][cols] + " ");
            }
            System.out.println();
        }

        // foreach reading only
        for (int[] outer : ticTacToeTable)
        {
            for (int data : outer)
            {
                System.out.println(data);
            }
        }

        System.out.println(Arrays.deepToString(twoDimensionalArray));
        System.out.println(Arrays.deepToString(irregularArray));

        // * * * * *
        // * * * * *
        // * * * * *

        char[][][] charSymbols = {
                {{'A', 'B'}},
                {{'D', 'F'}, {'Z', 'Y'}},
        };

        System.out.println(Arrays.deepToString(charSymbols));

        for (int edge = 0; edge < charSymbols.length; edge++)
        {
            for (int innerEdge = 0; innerEdge < charSymbols[edge].length; innerEdge++)
            {
                for (int el = 0; el < charSymbols[edge][innerEdge].length; el++)
                {
                    System.out.println(charSymbols[edge][innerEdge][el]);
                }
            }
        }

        int[] arrayN1 = {1, 2, 3};
        int[] arrayN2 = {8, 7, 4};

        if (Arrays.equals(arrayN1, arrayN2))
        {
            System.out.println("Equal");
        } else {
            System.out.println("Is not equal...");
        }
    }

    static void breakPoints()
    {
        // new, int, float, double, String, static, void, char, boolean
        // break, continue, return
        int num1 = 15;
        int num2 = 20;

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};

        for (int index = 0; index < numbers.length; index++)
        {
            if (index == 5)
            {
                break;
            } else {
                System.out.println(numbers[index]);
            }
        }

        String[] names = new String[] {"Name", "Name2", "Name3"};

        for (int index = 0; index < names.length; index++)
        {
            if (index == 1)
            {
                continue;
            } else {
                System.out.println(names[index]);
            }
        }

        int x = 10;
        int y = 10;

        for (int countNumbers = 1; countNumbers <= 10; countNumbers++)
        {
            System.out.println("Counter: " + countNumbers);
            break;
        }

        for (int countNumbers = 1; countNumbers <= 10; countNumbers++)
        {
            System.out.println("Counter: " + countNumbers);
            return;
        }

        System.out.println("Next Line");
        System.out.println("Second line...");
    }

    static void vocabulary()
    {
        // keys
        String[] keys; // keys - Яблоко
        String[] value; // values - Apple

        String[][] keysValues = new String[1000][1]; // [keys][values] [0][0] -> Яблоко, Apple
    }
}