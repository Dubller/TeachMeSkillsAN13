package HomeWork5;

public class CreditCart {
    String bankAccountNumber;
    int amount;

    public CreditCart()
    {
        bankAccountNumber = "No Information";
    }

    void addMoneyToAccount(int addMoney)
    {
        amount = amount + addMoney;
    }

    void getAmountOnAccount()
    {
        System.out.println("You have " + amount + " of money.");
    }

    void getMoneyFromAccount(int getCash)
    {
        amount = amount - getCash;
    }
}
