public class Start {
	public static void main(String[] args) {
		// Polymorphism: Account reference to SavingsAccount and FixedAccount
		Account sa = new SavingsAccount("SA123", 1000.0, 5.0);
		Account fa = new FixedAccount("FA456", 5000.0, 3);

		// Customer
		Customer c = new Customer("Alice", "C001");

		// Add accounts
		c.addAccount(sa);
		c.addAccount(fa);

		// Display all accounts
		c.displayDetails();

		// Deposit and Withdraw
		sa.deposit(500);
		sa.withdraw(200);

		fa.deposit(1000);
		fa.withdraw(300);

		// Display info using polymorphism
		sa.displayInfo();
		fa.displayInfo();

		// Search for account
		c.searchAccount("SA123");
		c.searchAccount("FA999"); // Not found

		// Delete account
		c.deleteAccount(sa);
		c.displayDetails();
	}
}