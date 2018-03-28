import java.util.Date;

public class p11_3 {
	public static void main(String[] args) {
		Account acct = new Account(1, 500);
		acct.setAnnualInterestRate(0.045);
		acct.setBalance(800);
		acct.deposit(200);
		acct.withdraw(600);
		acct.setId(4);
		
		System.out.println(acct.toString());
		
		
		Checking checking = new Checking(2, 600, -40);
		checking.setAnnualInterestRate(.05);
		checking.setOverdraftLimit(-80);
		checking.withdraw(40);
		
		System.out.println(checking.toString());
		
		
		Savings savings = new Savings(3, 700);
		savings.setAnnualInterestRate(0.06);
		savings.withdraw(30);
		
		System.out.println(savings.toString());

	}
}


class Checking extends Account{
	public double overdraftLimit;
	
	public Checking() {
		super();
		overdraftLimit = -50;
	}
	
	public Checking(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public void setOverdraftLimit(double set) {
		this.overdraftLimit = set;
	}
	
	public double getOverdraftLimit() {
		return this.overdraftLimit;
	}
	
	public void withdraw(double amt) {
		if(getBalance() - amt > overdraftLimit)
			setBalance(getBalance() - amt);
		else
			System.out.println("Amount exceeds overdraft limit.");
	}
	
	public String toString() {
		return super.toString() + ", Overdraft limit: $" + overdraftLimit;
	}
}


class Savings extends Account{
	
	public Savings() {
		super();
	}
	
	public Savings(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double amt) {
		if(amt < getBalance())
			setBalance(getBalance() - amt);
		else
			System.out.println("Transaction invalid.");
	}
}



class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	Account() {
		this(0, 0); 
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + String.format("%.2f", balance) + 
			"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
}