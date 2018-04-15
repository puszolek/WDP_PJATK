/**
 *
 *  @author Kochańska Paula PD2676
 *
 */

package zad3;


public class BooksOnShelves {
	
	// pola klasy
	private int numOfBooks;
	private int shelfCapacity;
	private int numOfShelves;
	private int booksOnLastShelf;
	
	// konstruktor klasy
	public BooksOnShelves(int books, int shelfCap)
	{
		if (numOfBooks < 0)
		{
			System.out.println("Minimalna liczba ksiazek to 0.");
			numOfBooks = 0;
		}
		else
		{
			numOfBooks = books;
		}
		
		if (shelfCap < 1)
		{
			System.out.println("Minimalna pojemnosc polki to 1.");
			shelfCapacity = 1;
		}
		else 
		{
			shelfCapacity = shelfCap;
		}
		
		numOfShelves = (int)Math.ceil((double)numOfBooks/(double)shelfCapacity);
		
		booksOnLastShelf = numOfBooks % shelfCapacity;
		booksOnLastShelf = (booksOnLastShelf==0 & numOfBooks!=0) ? shelfCapacity : booksOnLastShelf;
	}

	// metoda zwracająca ilosc zajętych polek przez ksiazki
	public int getNumOfShelves()
	{
		return numOfShelves;
	}
	
	// metoda zwracajaca ilosc ksiazek na ostatniej polce
	public int getBooksOnLastShelf()
	{
		return booksOnLastShelf;
	}
}
