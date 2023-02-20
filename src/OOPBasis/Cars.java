package OOPBasis;

public class Cars {
    // Access Modifiers
    // public - accessible from everywhere
    // private - only class
    // protected - class, package, inheritance
    // default, package visible, package-protected
    private String model;
    private String color;
    private int productionYear;
    private String category;

    public Cars()
    {
        model = "Unknown";
        color = "Unknown";
        category = "Unknown";
    }

    public Cars(String model, String color, int productionYear)
    {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void getFullDetails()
    {
        System.out.println("Car model is: " + this.model);
        System.out.println("Car color is: " + this.color);
        System.out.println("Car production year is: " + this.productionYear);
        System.out.println("Car category is: " + this.category);
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory()
    {
        return category;
    }

    public void category()
    {
        System.out.println("Your car category: " + this.category);
    }

    public void drive()
    {
        System.out.println("It is driving car");
    }
}