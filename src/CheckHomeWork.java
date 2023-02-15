import java.util.Arrays;

public class CheckHomeWork
{
    public static void main(String[] args){
        char[][] table = new char[3][3];
        char[] symbols = {'X', 'O'};

        for (int rows = 0, symbol = 0; rows < table.length; rows++)
        {
            for (int cols = 0; cols < table[rows].length; cols++)
            {
                table[rows][cols] = symbols[symbol];
                symbol = (symbol == 0) ? ++symbol : --symbol;
            }
        }
        System.out.println(Arrays.deepToString(table));
    }
}