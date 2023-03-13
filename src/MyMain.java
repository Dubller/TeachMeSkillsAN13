import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        // static
        // string, StringBuilder

        // Буферизация в Java
        // Вопросы связанные с буферизацией

        // String
        // String pool
        // String ==
        // String. equals
        System.out.println(workStringBuilder());

        System.out.println("\n");

        Cars car1 = new Cars();
        Cars car2 = new Cars("BMW", 2002);
        Cars car3 = new Cars("Mercedes", 2020);

        System.out.println(Cars.getNumberOfCars());
        System.out.println(car1.numberOfCarsCopy);
        System.out.println(car2.numberOfCarsCopy);
        System.out.println(car3.numberOfCarsCopy);

        Cars bmw = new BMW();
        Cars bm2 = new BMW();
        Cars bm3 = new BMW();

        Cars mercedes = new Mercedes();
        Cars mercedes1 = new Mercedes();
        Cars mercedes2 = new Mercedes();

        System.out.println("\n" + Cars.getNumberOfCars());
        System.out.println(bm3.numberOfCarsCopy);
        System.out.println(mercedes2.numberOfCarsCopy);
        System.out.println(mercedes2.numberOfCarsCopy);

        System.out.println("\n");
        String[] cardNumber = getStringDelimiter("3456-1234-AB45-09BB");

        System.out.println(Arrays.toString(cardNumber));

        try{
            int number = Integer.parseInt(cardNumber[0]);
            System.out.println("We converted cardNumber[0] to int: " + number);
        } catch (NumberFormatException e)
        {
            System.out.println("It is impossible to convert.");
        } catch (Exception e)
        {
            System.out.println("General exception...");
        }
    }

    public static StringBuilder workStringBuilder() {
        String name = "Archil";
        String name3 = "Archil";
        String name1 = new String("Archil");

        // name == name3 -> URLS
        // name.equals(name3);
        // name == name1 -> not equal
        // Цепочка символов

        StringBuilder inputText = new StringBuilder(name);
        inputText.deleteCharAt(inputText.length() - 1);

        return inputText;
    }

    public static String[] getStringDelimiter(String cardNumber)
    {
        String[] cardDetails = cardNumber.split("-");

        return cardDetails;
    }
}
