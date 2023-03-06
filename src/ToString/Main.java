package ToString;

public class Main {
    public static void main(String[] args)
    {
        Human archil = new Human("Archil", "Sikharulidze", 34, 171);

        System.out.println(archil.toString());
    }

    static void ObjectExample()
    {
        // Объект типа Object может хранить в себе любые типы
        Object[] objects = new Object[] {"Archil", "Sikharulidze", 34, 171, 88.8};
        Object[] objects2 = new Object[] {"Archil", "Sikharulidze", 34, 171, 88.8};

        for (Object elements : objects)
        {
            System.out.println(elements);
        }
        // toString
        // hasCode
        // equals()

        System.out.println();
        System.out.println("HasCode() of my objects object is : " + objects.hashCode()); // уникальный целый номер моего объекта
        System.out.println();
        System.out.println("HasCode() of my objects object is : " + objects2.hashCode()); // уникальный целый номер моего объекта

        System.out.println();
        System.out.println("Objects[] 1 == Objects[] 2: " + (objects == objects2)); // ссылки на память

        // shallow copy vs. deep copy -> shallow comparison vs. deep comparison
        System.out.println("Objects[] 1.equals(Objects[] 2): " + objects.equals(objects2)); // no deep comparison, shallow comparison
        System.out.println("objects[2].equals(objects2[2]): " + objects[2].equals(objects2[2]));

        // ДЗ 9
        // Прочитать про суперкласс Object Java
        // Посмотреть дополнительно, как можно сравнить два Объекта глубокое сравнение (deep copy)

        // 0x00392 == 0x00955, 000010001 == 0000110001 -> String, Object
        // equals -> String -> 0x00392 -> value "Archil"
        // char 65 79 81 65 == 65 97 81 77 (false)
        // Object -> equals Object -> 0x0001 -> String -> 0x00001
        // objects1[0] == objects2[0] -> значения

        // Object1 -> array[] names, int age = 34;
        // Object2 = new Object2 { Object1 };
        // int age = 34;
        // array[] -> ссылка на array[] из Object1

        System.out.println("objects2[0].hashCode(): " + objects2[0].hashCode());
    }
}
