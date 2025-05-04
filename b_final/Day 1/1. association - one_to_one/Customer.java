public class Customer	{
	private String phoneNum;
	private Account account;
	
	// Constructos
	public Customer()	{}
	public Customer(String phoneNum, Account account)	{
		this.phoneNum = phoneNum;
		this.account = account;
	}
	
	// Set methods
	public void setPhoneNum(String phoneNum)	{this.phoneNum = phoneNum;}
	public void setAccount(Account account)		{this.account = account;}
	
	// Get methods
	public String getPhoneNum()	{return phoneNum;}
	public Account getAccount()	{return account;}
	
	// A function to desplay everything conveniently
	public void displayDetails()	{
		account.displayDetails();
		System.out.println("Phone Number: " + phoneNum);
	}
}