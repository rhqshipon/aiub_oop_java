public class Customer	{
	private String phoneNum;
	private Account[] accounts;
	
	public Customer()	{}
	public Customer(String phoneNum, int sizeOfArray)	{
		this.phoneNum = phoneNum;
		this.accounts = new Account[sizeOfArray];
	}
	
	public void setPhoneNum(String phoneNum)	{this.phoneNum = phoneNum;}
	public String getPhoneNum()	{return phoneNum;}
	
	public void oneLiner()	{System.out.println("------------------------------------------------");}
	public void gapDivider()	{System.out.println("\n\n\n\n");}
	
	public void showAllAccounts()	{
		for(int i = 0; i < accounts.length; i++)	{
			if(accounts[i] != null)	{
				oneLiner();
				System.out.println("Showing Details for account index: " + i);
				oneLiner();
				System.out.println("Account Number: " + accounts[i].getAccountNum());
				System.out.println("Holder Name: " + accounts[i].getHolderName());
				System.out.println("Balance: " + accounts[i].getBalance());
				oneLiner();
				gapDivider();
			}
		}
	}
	
	public void insertAccount(Account a)	{
		boolean flag = false;
		int i;
		for(i = 0; i < accounts.length; i++)	{
			if(accounts[i] == null)	{
				accounts[i] = a;
				flag = true;
				break;
			}
		}
		if(flag)	{System.out.println("Success: Account " + a.getAccountNum() + " insertion successful!");}
		else	{System.out.println("Error: Account " + a.getAccountNum() + " insertion failed!");}
	}
	
	public void removeAccount(Account a)	{
		int i;
		boolean flag = false;
		
		for(i = 0; i < accounts.length; i++)	{
			if(accounts[i] == a)	{
				accounts[i] = null;
				flag = true;
				break;
			}
		}
		if(flag)	{System.out.println("Success: Account " + a.getAccountNum() + " deletion successful!");}
		else	{System.out.println("Error: Account " + a.getAccountNum() + " deletion failed!");}
	}
	
	public void searchAccount(int accountNumber)	{
		boolean flag = false;
		for(int i = 0; i < accounts.length; i++)	{
			if(accounts[i] != null)	{
				if(accounts[i].getAccountNum() == accountNumber)	{
					flag = true;
					break;
				}
			}
		}
		if(flag)	{System.out.println("Success: Account " + accountNumber + " exists");}
		else	{System.out.println("Error: Account " + accountNumber + " does not exist");}
	}
	
	public void displayDetails()	{
		System.out.println("Phone Number: " + phoneNum);
	}
}