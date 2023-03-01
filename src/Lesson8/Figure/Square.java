package Lesson8.Figure;

public class Square extends Figure{
    public Square()
    {
        // default constructor
    }

    public Square(int A, int B, int C, int D)
    {
        super(A, B, C, D);
    }

    @Override
    public void calculateParameter() {
        // формула высчитывания параметра для четырехугольника
        setParameter(getA() * 4);
    }

    @Override
    public void calculateArea() {
        // формула высчитывания площади квадрата
    }
}
