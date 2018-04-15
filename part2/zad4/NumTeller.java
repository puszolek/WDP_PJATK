/**
 *
 *  @author Kochańska Paula PD2676
 *
 */

package zad4;


public class NumTeller {
	
	public static String say(int i)
	{
		String message = "";
		message += Integer.toString(i) + "-";
		message += przyrostek(i);
		
		return message;
	}
	
	private static String przyrostek(int i)
	{
		String message = "";
		
		i = Math.abs(i);
		
		if(i == 0 || i % 1000000 == 0) // zero, miliony i więcej
		{
			message = "owy";
		}	
		else if(i % 10 == 0 & i % 100 != 0) // dziesiątki
		{
			message = "ty";
		}
		else if(i % 100 == 0 & i % 1000000 != 0) // setki, tysiące, setki tysięcy
		{
			message = "ny";
		}
		else
		{
			if(i % 100 > 10 & i % 100 < 20)
				message = "ty";
			else
			{
				switch(i % 10)
				{
					case 1:
						message = "szy";
						break;
					case 2:
						message = "gi";
						break;
					case 3:
						message = "ci";
						break;
					case 4:
					case 5:
					case 6:
					case 9:
						message = "ty";
						break;
					case 7:
					case 8:
						message = "my";
						break;
				}
			}	
			
		}
		return message;
	}
}
