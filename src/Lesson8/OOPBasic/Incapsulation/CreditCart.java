package Lesson8.OOPBasic.Incapsulation;

public class CreditCart {

    // OOP
    // Инкапсуляция - скрытие данных объекта от внешних факторов, скрытие полей (переменных)
    // private - доступно в рамках самого объекта
    // public - видно везде
    // protected - в рамках пакета
    // default -> package-private
    private String accountNumber;
    private int bankAccount;

    // конструктор по умолчанию, вставим компилятор
    public CreditCart() // пустой конструктор, компилятор не будет добавлять конструктов по умолчанию
    {
        this.accountNumber = "Unknown";
    }

    public CreditCart(String accountNumber, int bankAccount) // переопределил конструктор
    {
        this.accountNumber = accountNumber;
        this.bankAccount = bankAccount;
    }

    public void getDetails()
    {
        System.out.println("Bank account number: " + accountNumber);
        System.out.println("Bank account sum: " + bankAccount);
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String getAccountNumber)
    {
        this.accountNumber = getAccountNumber;
    }

    public int getBankAccount()
    {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount)
    {
        this.bankAccount = bankAccount;
    }

    public void addMoney(int bankAccount)
    {
        this.bankAccount += bankAccount;
    }

    public void withdrawMoney(int bankAccount)
    {
        if (this.bankAccount < bankAccount)
        {
            System.out.println("Not enough money. Enter new amount.");
        } else
        {
            this.bankAccount -= bankAccount;
        }
    }
}