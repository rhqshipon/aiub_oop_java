public interface ICustomerOperations {
	void addAccount(Account a);

	void deleteAccount(Account a);

	void searchAccount(String accountNumber); // Changed to String

	void displayDetails();
}