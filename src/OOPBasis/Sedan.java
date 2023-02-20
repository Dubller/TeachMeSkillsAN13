package OOPBasis;

public class Sedan extends Cars{
    public Sedan()
    {

    }

    public Sedan(String model, String color, int productionYear)
    {
        super(model, color, productionYear);
        setCategory("Sedan");
    }

    @Override
    public void category() {
        System.out.println("This is " + getCategory());
    }
}
