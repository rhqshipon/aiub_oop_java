public class MyTransaction extends OnlineTransaction implements IPaymentMethod	{
	private IPaymentMethod method;
	
	public MyTransaction(IPaymentMethod method)	{
		this.method = method;
	}
	
	@Override
	public void pay(double amount)	{
		method.pay(amount);
	}
}