public class Customer implements ICustomerOperations {
	private String customerName;
	private String customerID;
	private Account[] accounts = new Account[10]; // Increased size for demo

	public Customer(String customerName, String customerID) {
		this.customerName = customerName;
		this.customerID = customerID;
	}

	public void addAccount(Account a) {
		boolean flag = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = a;
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Success: Account " + a.getAccountNumber() + " insertion successful!");
		} else {
			System.out.println("Error: Account " + a.getAccountNumber() + " insertion failure!");
		}
	}

	public void deleteAccount(Account a) {
		boolean flag = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == a) {
				accounts[i] = null;
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Success: Account " + a.getAccountNumber() + " deletion successful!");
		} else {
			System.out.println("Error: Account " + a.getAccountNumber() + " deletion failure!");
		}
	}

	// Search by String accountNumber
	public void searchAccount(String accountNumber) {
		boolean flag = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNumber().equals(accountNumber)) {
				flag = true;
				System.out.println("Found account " + accounts[i].getAccountNumber() + " at index " + i + ".");
				accounts[i].displayInfo();
				break;
			}
		}
		if (!flag) {
			System.out.println("Error: Account " + accountNumber + " not found.");
		}
	}

	public void oneLiner() {
		System.out.println("------------------------------------------------");
	}

	public void gapDivider() {
		System.out.println("\n\n\n\n");
	}

	public void displayDetails() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				oneLiner();
				System.out.println("Showing Details for account index: " + i);
				oneLiner();
				accounts[i].displayInfo();
				oneLiner();
				gapDivider();
			}
		}
	}
}