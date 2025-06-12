public abstract class Customer implements ICustomerOperations {
	private String customerName; 
	private String customerID;
	private Account[] accounts = new Account[1];
	
	public void addAccount(Account a)	{
		boolean flag = false;
		int i;
		for(i = 0; i < accounts.length; i++ )	{
			if(account[i] == null)	{
				accounts[i] = a;
				flag = true;
				break
			}
		}
		if(flag)	{
			System.out.println("Success: Account " + a.getAccountNumber + " insertion successful!")
			}
		else	{
			System.out.println("Error: Account " + a.getAccountNumber + " insertion failure!")
		}
	}
	
	public void deleteAccount(Account a)	{
		boolean flag = false;
		int i;
		for(i = 0; i < accounts.length; i++ )	{
			if(account[i] == a)	{
				accounts[i] = null;
				flag = true;
				break
			}
		}
		if(flag)	{
			System.out.println("Success: Account " + a.getAccountNumber + " deletion successful!")
			}
		else	{
			System.out.println("Error: Account " + a.getAccountNumber + " deletion failure!")
		}
	}
	
	public void searchAccount(double accountNumber)	{
		int i;
		boolean flag = false;
		for(i = 0; i < accounts.length; i++ )	{
			if(account[i].getAccountNumber == accountNumber)	{
				flag = true;
				break
			}
		}
		if(flag)	{
			System.out.println(" Found account " + a.getAccountNumber + " on index " + a.getAccountNumber + ".")
			}
		else	{
			System.out.println("Error: Account " + a.getAccountNumber + " not found.")
		}
	}
	
	
	public void oneLiner()	{System.out.println("------------------------------------------------");}
	public void gapDivider()	{System.out.println("\n\n\n\n");}
	
	public void displayDetails()	{
		for(int i = 0; i < accounts.length; i++)	{
			if(accounts[i] != null)	{
				oneLiner();
				System.out.println("Showing Details for account index: " + i);
				oneLiner();
				System.out.println("Account Number: " + accounts[i].getAccountNumber());
				System.out.println("Balance: " + accounts[i].getBalance());
				oneLiner();
				gapDivider();
			}
		}
	}
	
}
