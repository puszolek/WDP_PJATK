/**
 *
 *  @author Kochańska Paula PD2676
 *
 */

package zad1;


public class Main {
  public static void main(String[] args) {

    int a =  6,            // liczby biorace udzial w sumowaniu 
        b =  9,            // i mnozeniu oznaczam przez: a, b, c  
        c = 18;

    int product = a*b*c,   // Mnożenie trzech liczb
    		sum = a+b+c;   // Suma trzech liczb
    
    double halvesSum = (double)a/2 + (double)b/2 + (double)c/2,   // Suma połówek, uwzględniono rzutowanie na double
    	   thirdsSum = (double)a/3 + (double)b/3 + (double)c/3;   // Suma jednych trzecich, uwzględniono rzutowanie na double
    
    System.out.println(a + " + " + b + " + " + c + " = " +  sum);
    System.out.println(a + " * " + b + " * " + c + " = " + product);
    System.out.println(a + "/2 + " + b + "/2 + " + c + "/2 = " +  halvesSum);
    System.out.println(a + "/3 + " + b + "/3 + " + c + "/3 = " +  thirdsSum);
 }
}
