public class Customer {
	private String phoneNum;
	private Account[] account = new Account[10];

	private int iteration = 0;

	// Constructos
	public Customer() {
	}

	public Customer(String phoneNum, Account account) {
		this.phoneNum = phoneNum;
		this.account[iteration] = account;
	}

	// Set methods
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setAccount(Account account) {
		this.account[iteration] = account;
	}

	// Get methods
	public String getPhoneNum() {
		return phoneNum;
	}

	public Account getAccount() {
		return account[iteration];
	}

	// Insert and destroy methods
	public void addAccount(Account account) {
		if (iteration < 10) {
			this.account[iteration] = account;
			iteration++;
		} else {
			System.out.println("Error: A customer cannot have more than 10 bank accounts!");
		}
	}

	// A function to display everything conveniently
	public void displayDetails() {
		System.out.println("Phone Number: " + phoneNum);
		for (int i = 0; i < iteration; i++) {
			if (account[i] != null) {
				System.out.println("\nAccount info " + i);
				account[i].displayDetails();
			}
		}
	}
}