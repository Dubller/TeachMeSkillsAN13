package Lesson8.Figure;

public class Figure {
    private int A;
    private int B;
    private int C;
    private int D;
    private int parameter;
    private int area;
    public Figure()
    {
        // default constructor
    }

    public Figure(int A, int B, int C, int D)
    {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public void calculateParameter()
    {
        // Empty
    }

    public void calculateArea()
    {
        // Empty
    }

    public int getParameter() {
        return parameter;
    }

    public void setParameter(int parameter) {
        this.parameter = parameter;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }
}
