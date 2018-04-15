/**
 *
 *  @author Kochańska Paula PD2676
 *
 */

package zad3;


public class Main {
  public static void main(String ... args) {
    int numOfBooks = 10/*<-  liczba ksiazek */;
    int shelfCap   = 3/*<-  pojemnosc polki*/;
    BooksOnShelves b = new BooksOnShelves(numOfBooks, shelfCap);
    System.out.println("Liczba polek: " + b.getNumOfShelves());
    System.out.println("Liczba ksiazek na ostatniej polce: " + b.getBooksOnLastShelf());
  }
}
