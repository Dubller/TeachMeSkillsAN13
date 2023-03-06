package ToString;

public class Human {
    private String name;
    private String surname;
    private int age;
    private float height;
    final private int birthDate = 1988;

    public Human(String name, String surname, int age, float height)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + height;
    }
}
