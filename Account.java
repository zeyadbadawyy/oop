import java.sql.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account(){}
    public Account(int id, double balance)
    {
        this.id=id;
        this.balance=balance;
    }

    public int getID()
    {return id;}

    public double getBalance()
    {return balance;}

    public static double getAnnualIntRate()
    {return annualInterestRate;}

    public void setID(int id)
    {this.id =id;}

    public void setBalance(double balance)
    {this.balance =balance;}

    public void setAnnualInterestRate(double annualInterestRate)
    {this.annualInterestRate =annualInterestRate;}

    public double getMonthlyInterestRate()
    {
        return (annualInterestRate/12.0);
    }

    public double getMonthlyInterest()
    {
        return balance * getMonthlyInterestRate();
    }

    public void deposit(double n)
    {
        balance= balance + n;
    }
    public void withdraw(double n)
    {
        if(n<=balance)
            balance= balance - n;
        else
            System.out.println("Not Enough in balance");
    }
}
