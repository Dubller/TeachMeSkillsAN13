package Lesson8.Figure;

public class Rectangle extends Figure{
    private final double width; // Предложила идешка.
    private final double length; // Предложила идешка.

    // Создаем конструктор для создания нового прямоугольника с заданной шириной и длинной.
    public Rectangle(double width, double length ) {
        this.width = width;
        this.length = length;
    }

    // Переопределяем метод area для вычисления площади прямоугольника.
    public double area() {
        return width * length; // Вычисляет площадь по ширине и длинне.
    }

    // Переопределяем метод perimeter для вычисления периметра прямоугольника.
    public double perimeter() {
        return 2 * (width + length); // Вычисляем периметр по формуле 2 * (ширина + длинна).
    }
}
