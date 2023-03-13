public class Cars {
    private static int numberOfCars = 0;
    public int numberOfCarsCopy;
    private String model;
    private int year;

    public Cars()
    {
        numberOfCars++;
        this.numberOfCarsCopy++;
    }

    public Cars(String model, int year)
    {
        this.model = model;
        this.year = year;
        this.numberOfCarsCopy++;
        numberOfCars++;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    void getGeneralMethod()
    {
        System.out.println("General");
    }
}
