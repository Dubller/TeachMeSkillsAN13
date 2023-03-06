package Lesson8.Figure;

public class Triangle extends Figure {
    private final double  a; // Предложила идешка.
    private final double b; // Предложила идешка.
    private final double c; // Предложила идешка.

    // Создаем конструктор для создания нового треугольника с заданными длинами сторон.
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Переопределяем метод area для вычисления площади треугольника по формуле Герона.
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Используем формулу Герона для вычисления площади.
    }

    // Переопределяем метод perimeter для вычисления периметра треугольника.
    public double perimeter() {
        return a + b + c; // Сумма трех сторон.
    }
}
