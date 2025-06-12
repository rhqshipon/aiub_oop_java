public class Start {
	public static void main(String[] args)	{
		SavingsAccount s1 = new SavingsAccount("000001", 500.50, 0.05);
		FixedAccount f1 = new FixedAccount("000002", 500.50, 5);
		
		s1.displayInfo();
		f1.displayInfo();
	}
}
