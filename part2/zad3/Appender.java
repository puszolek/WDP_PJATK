/**
 *
 *  @author Kochańska Paula PD2676
 *
 */

package zad3;


public class Appender {

	String string = "";
	
	public Appender(String s)
	{
		this.string += s;
	}

	public Appender append(String s, int i) throws IllegalArgumentException
	{
		try 
		{
			if(i < 0)
			{
				throw new IllegalArgumentException("Wartość i nie może być ujemna!");
			}
			
			while(i > 0)
			{
				this.string += s;
				i--;
			}
		} 
		catch (IllegalArgumentException e) 
		{
		    System.out.println("Rzucono wyjątek IllegalArgumentException: " + e.getMessage());
		}
		
		return this;
	}
	
	@Override
	public String toString()
	{
		return this.string;
	}
}
