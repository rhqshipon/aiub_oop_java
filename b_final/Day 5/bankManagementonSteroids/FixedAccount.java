public class FixedAccount extends Account	{
	private float tenureYear;
	
	public FixedAccount()	{}
	public FixedAccount(String accountNumber, double balance, float tenureYear)	{
		super(accountNumber, balance);
		this.tenureYear = tenureYear;
	}
	
	public void setTenureYear(float tenureYear)	{this.tenureYear = tenureYear;}
	public float getTenureYear()	{return tenureYear;}
	
	void displayInfo()	{
		System.out.println("Account Number:" + accountNumber);
		System.out.println("Balance:" + balance);
		System.out.println("Tenure Year:" + tenureYear);
	}
}
