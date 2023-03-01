package Lesson8.Figure;

public class Rectangle extends Figure{
    public Rectangle()
    {
        // empty
    }

    public Rectangle(int A, int B, int C, int D)
    {
        super(A, B, C, D);
    }

    @Override
    public void setParameter(int parameter) {
        setParameter(2 * (getA() + getB()));
    }
}
