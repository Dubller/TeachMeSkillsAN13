import java.util.Arrays;
import java.util.Scanner;

public class CheckHomeWork {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];

        for (int rows = 0; rows < numbers.length; rows++) {
            Arrays.fill(numbers[rows], 1);
        }
        System.out.println(Arrays.deepToString(numbers));

        for (int rows[] : numbers)
        {
            for (int cols : rows)
            {
                System.out.print(cols + " ");
            }
            System.out.println();
        }

        for (int index = ((int) 'a'); index <= ((int) 'z'); index++)
        {
            System.out.print(((char) index) + " ");
        }

        System.out.println();
    }

    static void guestWord()
    {
        Scanner scanner = new Scanner(System.in);
        int[][] twoDimensionalArray = new int[5][5];


        for (int rows = 0; rows < twoDimensionalArray.length; rows++) {
            for (int cols = 0; cols < twoDimensionalArray[rows].length; cols++) {
                twoDimensionalArray[rows][cols] += 2;
            }
        }

        for (int rows[] : twoDimensionalArray)
        {
            for (int cols : rows)
            {
                System.out.print(cols + " ");
            }
            System.out.println();
        }

        int countScanner = scanner.nextInt();
        int[][] doubleArray = new int[5][5];
        for (int i = 0, initializationArray = 1; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = i + 1;
                initializationArray++;
            }
        }
    }
}