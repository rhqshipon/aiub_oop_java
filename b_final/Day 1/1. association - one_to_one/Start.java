public class Start	{
	public static void main(String[] args)	{
		Account a1 = new Account(101, "Mohammad Rabiul Hoque", 500.5);
		Customer c1 = new Customer("+8801123456789", a1);
		
		c1.displayDetails();
	}
}