import java.util.Arrays;
import java.util.Random;

public class CheckHomeWork {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int index = 0; index < numbers.length; index++)
        {
            numbers[index] = new Random().nextInt(0, 11);
        }

        System.out.println(Arrays.toString(numbers));
    }
}