public class PayPalPayment implements IPaymentMethod	{
	private double amount;
	
	public void pay(double amount)	{
		System.out.println("Paid $" + amount + " using PayPal.");
	}
}