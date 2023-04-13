package Interface;

public interface BankAccount 
{
	void deposit();
	void withdraw();
	public static void main(String[] args) 
	{
		CheckingAccount ca = new CheckingAccount();
		ca.deposit();
		ca.withdraw();
	}
	
	
}
class CheckingAccount implements BankAccount
{

	@Override
	public void deposit() 
	{
		System.out.println("The amount is deposited.");
		
	}

	@Override
	public void withdraw() 
	{
		System.out.println("The amount is withdrwan.");
		
	}
	
}

