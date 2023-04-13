package Abstract;

abstract class BankAccount
{
	double  account_number=32005245, balance=50555;
	abstract void deposit();
	abstract void withdraw();
}
class CheckingAccount extends BankAccount
{
	void deposit(double amount) 
	{
		if (balance == amount &&  account_number==32005245) 
		{
			System.out.println("Deposited:- "+amount);
		}
		
	}
	
	void withdraw() 
	{
		if (balance>=500) 
		{
			System.out.println("You can withdraw your amount: "+balance);
		}
	}

	@Override
	void deposit() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Question_2 
{
	public static void main(String[] args) 
	{
		CheckingAccount ca = new CheckingAccount();
		ca.deposit(50555);
		ca.withdraw();
		
	}

}
