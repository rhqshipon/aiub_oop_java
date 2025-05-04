public class Start	{
	public static void main(String[] args)	{
		Account a1 = new Account(101, "Mohammad Rabiul Hoque", 500.5);
		Account a2 = new Account(101, "Mohammad Rabiul", 400.5);
		Account a3 = new Account(101, "Mohammad", 300.5);
		Customer c1 = new Customer("+8801914690095", a1);
		c1.addAccount(a2);
		c1.addAccount(a3);
		
		
		
		c1.displayDetails();
		
		// Data Structure, Database
	}
}