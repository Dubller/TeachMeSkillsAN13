package OOPBasis;

public class Jeep extends Cars{

    public Jeep()
    {
        //
    }

    public Jeep(String model, String color, int productionYear) {
        super(model, color, productionYear);
    }

    @Override
    public void drive() {
        System.out.println("It is driving Jeep");
    }
}
