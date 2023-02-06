public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Java. This is a very long string");
        System.out.print("Welcome");

        // System.in.read();

        System.out.print("Welcome........................................................");
        System.out.println("Welcome........................................................");

        System.out.println("Concatenation with sign + .........................................           " +
                            "This is the same line..........");
        System.out.println("My name is Archil." + " " + "I am from Georgia.");
        System.out.println("My name is Archil." + " I am from Georgia.");
        System.out.println();
        // System.out.print(); -> mistake

        int age = 35;

        System.out.println("My name is Archil. My age is " + age);
        System.out.printf("My name is Archil. I am %d years old", age); // %d - digit, %s - string

        // Примитивные типы данных
        int ageArchil = 34; // примитив, хранится в стеке, прямо значение

        // Ссылочные типы данных
        String myName = "Archil"; // стек - хранится адрес области памяти в куче (хипе), а в самой куче (хипе)
        // хранится уже значение
        String Ilona = "Ilona";


        // Примитивные переменные
        byte myByte = 15; // -128 before 127
        short myShort = 29456; // -32.... before 32....
        int myInt = 23000000; // -2........... before 2...........
        long myLong = 5600000000L; // 64 bit, 8 byte -9............. + 9...............

        char myChar = 'A'; // UTF-16, 2 bytes

        float myFloat = 2.5F;
        double myDouble = 3.4555;

        boolean trueOrFalse = true; // false

        // Ссылочный тип
        String myString;

        System.out.println();
        checkMyTypes();
        getMyDetails();
        arithmeticOperations();
        System.out.println();
        conditionOperator();
    }

    static void checkMyTypes()
    {
        int ageArchil; // trash
        int ageKiril = 23;

        ageArchil = 34;

        System.out.println("My name is Archil. My age is: " + ageArchil);
        System.out.printf("My name is Archil. I am %d years old. He is Kiril. He is %d years old\n", ageArchil, ageKiril);
    }

    static void getMyDetails()
    {
        String name = "Archil";
        String surname = "Sikharulidze";
        int age = 34;
        int height = 171;
        float weight = 86.5F;
        char firstLetterSurname = 'S';
        boolean married = true;

        System.out.println("My name is " + name);
        System.out.println("My surname is " + surname);
        System.out.println("My age is " + age);
        System.out.println("My height is " + height);
        System.out.println("My weight is " + weight);
        System.out.println("First letter of my surname is " + firstLetterSurname);
        System.out.println("Am I married? " + married);

        byte number1 = 15;
        byte number2 = 126;
        int myName = number1 * number2;

        double number3 = 34.568;
        int number4 = (int)number3;

        int intNumber = 300;
        byte fromByteToInt = (byte) intNumber;

        System.out.println(number4);
        System.out.println(fromByteToInt);
    }

    static void arithmeticOperations()
    {
        // +
        // -
        // /
        // *
        // % modus
        // ++, --

        int number1 = 14;
        int number2 = 3;
        double weight = 82.3;
        double height = 171;

        int sum = number1 + number2;

        System.out.println("Арифметические переменные:");
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
        System.out.println((double) number1 / number2);

        // % modus остаток
        System.out.println(number1 % number2);

        // инкремент, дикремент
        number1 = number1 + 1;
        number1 += 1; // number1 /= 2;
        number1++; // number1 + 1
        number1--; // number1 - 1

        System.out.println(number1);
        System.out.println(number1++);
        System.out.println(number1);
        System.out.println(number1--);
        System.out.println(number1);

        System.out.println();
        System.out.println(number1);
        System.out.println(++number1);
        System.out.println(--number1);
    }

    static void conditionOperator()
    {
        int age = 10;
        int age2 = 10;
        boolean married = false;
        boolean notMarried = true;

        if (age == age2) // равно
        {
            System.out.println("Numbers are equal");
        } else
        {
            System.out.println("Numbers are not equal...");
        }

        if (age <= 20)
        {
            System.out.println("Number is less or equal to 20");
        } else if (age >= 20)
        {
            System.out.println("Number is more or equal to 20");
        } else {
            System.out.println("All other cases");
        }

        if (married == false)
        {
            if (age == 20)
            {
                System.out.println("I am not married and I am 20 years old....");
            } else {
                System.out.println("I am not married and I am not 20 years old...");
            }
        } else {
            System.out.println("I am married.");
        }

        if (married == false && age == 20) // логическое и
        {
            System.out.println("I am married and I am 20 years old");
        }

        if (married == true || age == 20) // логическое или
        {
            System.out.println("I am married or I am 20 years old...");
        }

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue == isFalse);

        int height1 = 171;
        int height2 = 169;
        int biggestHeight = (height1 >= height2) ? height1 : height2; // тернарный оператор

        System.out.println(biggestHeight);
        System.out.println((height1 >= height2) ? height1 : height2);
    }
}