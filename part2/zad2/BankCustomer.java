package zad2;

public class BankCustomer {

	Account account;
	Person person;
	
	public BankCustomer(Person p)
	{
		this.account = new Account();
		this.person = p;
	}

	public Account getAccount() 
	{
		return this.account;
	}
	
	@Override
	public String toString()
	{
		return "Klient: " + this.person.getName() + " stan konta " + this.account.getMoney();
	}
	
}
