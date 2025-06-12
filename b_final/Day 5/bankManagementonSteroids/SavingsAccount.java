public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount()	{}
	public SavingsAccount(String accountNumber, double balance, double interestRate)	{
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(double interestRate)	{this.interestRate = interestRate;}
	public double getInterestRate()	{return interestRate;}
	
	void displayInfo()	{
		System.out.println("Account Number:" + accountNumber);
		System.out.println("Balance:" + balance);
		System.out.println("Interest Rate:" + interestRate);
	}
}
