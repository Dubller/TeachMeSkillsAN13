package Lesson8.OOPBasic.Incapsulation;

public class Main { // Object Main
    public static void main(String[] args)
    {
        CreditCart sberBank = new CreditCart();
        CreditCart alphaGroup = new CreditCart("ALPHA3433243209234", 400);

        //creditCard.getDetails();

        //creditCard.setAccountNumber("GE67H101218912");
        //creditCard.setBankAccount(5000);

        //creditCard.getDetails();
        //System.out.println("Amount money on my bank account is " + creditCard.getBankAccount());

        //System.out.println("\n");
        //creditCard.addMoney(300);
        //System.out.println("Amount money on my bank account is " + creditCard.getBankAccount());
        //creditCard.withdrawMoney(2300);
        //System.out.println("Amount money on my bank account is " + creditCard.getBankAccount());
        //creditCard.withdrawMoney(2500);
        //System.out.println("Amount money on my bank account is " + creditCard.getBankAccount());

        alphaGroup.getDetails();
        sberBank.getDetails();
    }
}