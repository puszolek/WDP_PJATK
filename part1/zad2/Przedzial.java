/**
 *
 *  @author Kochańska Paula PD2676
 *
 */

package zad2;


public class Przedzial {

  private int pocz, koniec;
  
  public Przedzial(int a, int b)
  {
    /*<-  kod konstruktora */
	  pocz = a < b ? a : b;
	  koniec = b > a? b : a;
  }

  Przedzial przeciecie(Przedzial p)
  {
    /*<-  kod metody przeciecie(...) */

	  int a, b, c, d = 0;
	  
	  // sprawdzamy, ktory przedzial zaczyna sie wczesniej, zeby uproscic analize
	  if (pocz <= p.pocz)
	  {
		  
		  a = pocz;
		  b = koniec;
		   c = p.pocz;
		  d = p.koniec;
	  }
	  else
	  {
		  a = p.pocz;
		  b = p.koniec;
		  c = pocz;
		  d = koniec;
	  }
	  
	  int beginning = 0;
	  int ending = 0;
	  
	  if((b < c) || (d < a)) // zbiory rozlaczne
	  {
		  return null;
	  }
	  else if((b <= d) & (b >= c)) // b w przedziale (c,d)
	  {
		  beginning = c;
		  ending = b;
	  }
	  else if(b >= d) // b większe od d
	  {
		  beginning = c;
		  ending = d;
	  }
	  else
	  {
		  System.out.println("Dupa");
		  
	  }
	  
	  return new Przedzial(beginning, ending);
  }
  
  /*<-  kod innych metod */
  // niezbedne stworzenie metod poczatek() i koniec() w celu pobrania prywatnych wartosci obiektu
  public int poczatek()
  {
	  return pocz < koniec ? pocz : koniec;
  }
  
  public int koniec()
  {
	  return koniec > pocz ? koniec : pocz;
  }
  
  // konieczne przeciazenie funkcji aby prawidlowo wypisywac obiekt do konsoli
  @Override
  public String toString() {
      return "[" + pocz + "," + koniec + "]";
  }

}
