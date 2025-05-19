public abstract class OnlineTransaction implements IPaymentMethod	{
	
	void processTransaction(double amount)	{
		pay(amount);
		System.out.println("Transaction complete.");
	}
	
	public abstract void pay(double amount);
}