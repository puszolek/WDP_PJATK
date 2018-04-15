/**
 *
 *  @author Kochańska Paula PD2676
 *
 */

package zad4;


import static javax.swing.JOptionPane.*;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    String input = showInputDialog("Podaj 3 liczby");
    Scanner scan = new Scanner(input);
    String msg = "";
    try 
    {
    	 msg += NumTeller.say(scan.nextInt()) + '\n'; 
    	 msg += NumTeller.say(scan.nextInt()) + '\n';
    	 msg += NumTeller.say(scan.nextInt()) + '\n';
    }
    catch (Exception e)
    {
    	System.out.println("Error: wadliwe dane wejściowe!");
    }
   
    System.out.println(msg);
  }

}
