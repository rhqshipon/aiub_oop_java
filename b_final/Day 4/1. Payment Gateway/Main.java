public class Main {
	public static void main(String[] args) {
		IPaymentMethod pm1 = new CreditCardPayment();
		MyTransaction mt1 = new MyTransaction(pm1);
		mt1.processTransaction(100.0);
		
		IPaymentMethod pm2 = new PayPalPayment();
		pm2.pay(100.0);
	}
}
