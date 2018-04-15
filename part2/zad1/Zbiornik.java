/**
 *
 *  @author Kochańska Paula PD2676
 *
 */

package zad1;


public class Zbiornik {
	
	static int licznik = 0;
	
	private int numerZbiornika = 0;
	private double stanWody = 0;
	private double pojemność = 0;
	
	public Zbiornik(int poj)
	{
		licznik++;
		this.numerZbiornika = licznik;
		this.stanWody = 0;
		this.pojemność = poj;
	}
	
	public void dolej(double woda)
	{
		this.stanWody+= woda;
		
		if(this.stanWody > pojemność)
		{
			this.stanWody = pojemność;
		}
	}
	
	public void odlej(double woda)
	{
		this.stanWody-= woda;
		
		if(this.stanWody < 0)
		{
			this.stanWody = 0;
		}	
	}
	
	@Override
	public String toString()
	{
		return "Zbiornik " + numerZbiornika + ", pojemność " + pojemność + ", stan wody " + stanWody;
	}
}  
