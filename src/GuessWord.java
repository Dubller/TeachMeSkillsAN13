import java.util.Arrays;

public class GuessWord {
    public static void main(String[] args)
    {
        // 1. Написать приложение, которое загадывает слово.
        // 2. Предлагает игроку угадать это слово.
        // 3. Игрок может угадать букву или полностью слово.
        // Игра идет до тех пор, пока слово не угадано.
        // Создаем массив String[10] -> слова
        // Random и выбираем какое слово будет угадывать игрок
        // С помощью Scanner игрок вводит слово или букву
        // Программа сравнивает введенное слово или букву с загаданным.
        // Если игрок угадал букву, то показывает на экране угаданную букву. Если слово, то
        // слово и игра заканчивается
        String[] words = new String[] {
                "Apple",
                "Banana",
                "Chess",
                "Field",
                "Ball",
                "Tennis",
                "Minsk",
                "Pen",
                "Eraser",
                "Laptop"
    };

        // Random 0 - 9
        // char[] = words[random].Char
        // Scanner String (nextLine)
        // char[] = nextLine.toCharArray()
        // char[] == char[]
    }
}
