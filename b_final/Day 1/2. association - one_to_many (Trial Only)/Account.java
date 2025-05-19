public class Account	{
	private int accountNum;
	private String holderName;
	private double balance;
	
	// Constructors
	public Account()	{}
	public Account(int accountNum, String holderName, double balance)	{
		this.accountNum = accountNum;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	// Set Methods
	public void setAccountNum(int accountNum)	{this.accountNum = accountNum;}
	public void setHolderName(String holderName)	{this.holderName = holderName;}
	public void setBalance(double balance)	{this.balance = balance;}
	
	// Get Methods
	public int getAccount()	{return accountNum;}
	public String getHolderName()	{return holderName;}
	public double getBalance()	{return balance;}
	
	// Function to display everything symlessly
	public void displayDetails()	{
		System.out.println("Account Number: " + accountNum);
		System.out.println("Holder Name: " + holderName);
		System.out.println("Balance: " + balance);
	}
}