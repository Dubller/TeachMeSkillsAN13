public class MyMain {
    public static void main(String[] args)
    {
        // Object
        // Throwable
        // Error & Exception
        // Exception: checked & unchecked

        CompareLogin compareStrings = new CompareLogin();

        try
        {
            compareStrings.compareTwoStrings("Archil", "Teona");
        } catch (ComparisonException e)
        {
            System.out.println(e);
        }
    }
}
