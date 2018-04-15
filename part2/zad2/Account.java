package zad2;

public class Account {

	private double money = 0;
	private static double interestsRate = 0;
	
	public Account()
	{
		this.money = 0;
	}
	
	public static void setInterestRate(double ir) 
	{
		 Account.interestsRate = (ir > 0) ? ir : Account.interestsRate;
	}

	public void deposit(int m)
	{
		this.money += isPositive(m) ? m : 0;
	}
	
	public void withdraw(int m)
	{
		this.money -= (isPositive(this.money - m) & isPositive(m)) ? m : 0;
	}
	
	public void transfer(Account a, int m)
	{
		if(isPositive(this.money - m) & isPositive(m))
		{
			this.money -= m;
			a.deposit(m);
		}
	}	
	
	public void addInterest() 
	{
		this.money += this.money*interestsRate/100;
	}
	
	public boolean isPositive(double value)
	{
		return value >= 0;
	}
	
	public double getMoney()
	{
		return this.money;
	}
}
