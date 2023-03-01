package Lesson8;

import java.util.Objects;

public class MyMain {
    public static void main(String[] args)
    {
        // Object
        // equals() -> String && Object
        // hasCode()
        Object[] objects = new Object[3];
        objects[0] = "String";
        objects[1] = 34;
        //objects[2] = new int []{1, 2, 3};
        objects[2] = 'D';
        //objects[4] = new ArrayList<Integer>();

        System.out.println(objects[2].getClass().getSimpleName()); // тип

        Object[] objects1 = new Object[3];
        objects1[0] = "String";
        objects1[1] = 34;
        //objects1[2] = new int []{1, 2, 3};
        objects1[2] = 'D';
        //objects1[4] = new ArrayList<Integer>();

        if (Objects.equals(objects, objects1))
        {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}
