package Lesson8.Inheritance;

public interface Highlander {
    void getJeepDetails(); // no implementation
    void getAdditionalInfo();

    default void getNoObligatoryMethod()
    {
        // Empty
    }
}
