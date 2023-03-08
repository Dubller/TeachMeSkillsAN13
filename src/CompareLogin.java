public class CompareLogin {
    public void compareTwoStrings(String a, String b) throws ComparisonException
    {
        if (!a.equals(b))
        {
            throw new ComparisonException();
        }
    }
}
