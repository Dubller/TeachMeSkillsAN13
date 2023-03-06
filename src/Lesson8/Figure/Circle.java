package Lesson8.Figure;

public class Circle extends Figure{
    // Создаем private переменную радиуса круга.
    private final double radius; // Предложила идешка.
    // Создаем private статическую константу ПИ.
    private static final double PI = 3.14159265358979323846; /* Поскольку значение ПИ является константой и не
                                                                изменяется,целесообразно объявить его как
                                                                статическую конечную переменную. */

    // Создаем конструктор для создания нового круга с заданным радиусом.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Переопределяем метод area для вычисления площади круга.
    public double area() {
        return PI * radius * radius; // Вычисляем площадь по формуле πr².
    }

    // Переопределяем метод perimeter для вычисления длины окружности.
    public double perimeter() {
        return 2 * PI * radius; // Вычисляем периметр по формуле 2πr.
    }
}
