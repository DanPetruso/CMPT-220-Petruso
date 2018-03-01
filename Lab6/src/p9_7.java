import java.util.Date;

class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    public Account(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDate() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double money){
        balance-=money;
    }

    public void deposit(double money){
        balance+=money;
    }
}

public class p9_7 {
    public static void main(String [] args){
        Account acct = new Account();
        acct.setId(1122);
        acct.setBalance(20000);
        acct.setAnnualInterestRate(4.5);
        acct.withdraw(2500);
        acct.deposit(3000);
        System.out.println("Balance: " + acct.getBalance() + "\nMonthly Interest: " + acct.getMonthlyInterest() +
                                "\nDate Created: " + acct.getDate());
    }
}
