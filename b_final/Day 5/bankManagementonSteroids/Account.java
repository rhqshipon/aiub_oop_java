public abstract class Account implements IAccountOperations {
	protected String accountNumber;
	protected double balance;
	
	public Account()	{}
	public Account(String accountNumber, double balance)	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void setAccountNumber(String accountNumber)	{this.accountNumber = accountNumber;}
	public void setBalance(double balance)	{this.balance = balance;}
	
	public String getAccountNumber()	{return accountNumber;}
	public double getBalance()	{return balance;}
	
	public void deposit(double amount)	{
		boolean flag = false;
		if(amount > 0)	{
			balance += amount;
			flag = true;
		}
		if(flag)	{System.out.println("Success: Deposit Successful!");}
		else	{System.out.println("Error: Deposit Failed!");}
	}
	
	public void withdraw(double amount)	{
		boolean flag = false;
		if(amount > 0)	{
			balance -= amount;
			flag = true;
		}
		if(flag)	{System.out.println("Success: Withdrawal Successful!");}
		else	{System.out.println("Error: Withdrawal Failed!");}
	}
	
	// public void transfer()	{
		// System.out.println("Dummy Function.");
	// }
	
	public void transfer(double amount)	{
		System.out.println("Dummy Function.");
	}
	
	abstract void displayInfo();
}
