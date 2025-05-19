public class Start {
	public static void main(String[] args) {
		// Account a1 = new Account(100001, "Mohammad Rabiul Hoque", 500.5);
		// Customer c1 = new Customer("+8801123456789", a1);
		// c1.displayDetails();
		
		Customer c1 = new Customer("+880123456678", 5);
		
		Account a1 = new Account();
		a1.setAccountHolderName("OOP1 G");
		a1.setAccountNum(11111111);
		a1.setBalance(2000.0);
		
		Account a2 = new Account();
		a2.setAccountHolderName("OOP1 C");
		a2.setAccountNum(11111112);
		a2.setBalance(2500.0);
		
		Account a3 = new Account();
		a3.setAccountHolderName("OOP2 G");
		a3.setAccountNum(11111113);
		a3.setBalance(2000.0);
		
		Account a4 = new Account();
		a4.setAccountHolderName("OOP2 I");
		a4.setAccountNum(11111114);
		a4.setBalance(2500.0);
		
		Account a5 = new Account();
		a5.setAccountHolderName("OOP1 G");
		a5.setAccountNum(11111115);
		a5.setBalance(2000.0);
		
		Account a6 = new Account();
		a6.setAccountHolderName("OOP1 C");
		a6.setAccountNum(11111116);
		a6.setBalance(2500.0);
		
		System.out.println();
		System.out.println();
		
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a3);
		c1.insertAccount(a4);
		c1.insertAccount(a5);
		c1.insertAccount(a6);
		
		c1.showAllAccounts();
		
		c1.removeAccount(a2);
		
		c1.showAllAccounts();
		
		c1.removeAccount(a2);
		
		
		System.out.println();
		c1.searchAccount(1113);
	}
}
