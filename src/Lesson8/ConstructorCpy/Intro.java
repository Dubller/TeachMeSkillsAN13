package Lesson8.ConstructorCpy;

public class Intro {
    public static void main(String[] args)
    {
        Cars opelG50 = new Opel("opel GL 50", "White", 2005, new String[]{"Wheel"});
        Cars opelG51 = new Opel(opelG50);
        Cars opelG55 = new Opel(opelG51);

        System.out.println(opelG50);
        System.out.println();
        System.out.println(opelG51);
        System.out.println();
        System.out.println(opelG55);

        opelG50.setColor("Red");
        opelG51.setColor("Grey");
        opelG55.setColor("Black");

        System.out.println();

        System.out.println(opelG50);
        System.out.println();
        System.out.println(opelG51);
        System.out.println();
        System.out.println(opelG55);
    }
}
