/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author johand8
 */
public class Myndig {
      public static void main( String args[] )
   {
      Scanner sc = new Scanner(System.in);
      int alder;
      boolean myndig;

      System.out.print("Skriv din alder: ");
      
      alder = sc.nextInt();   
      myndig = alder > 17;
     
      if ( myndig )  {System.out.println("Du ar myndig!");  }
      else { System.out.println("Du ar inte myndig...");     
   }
      
      
    }//end main 
}//end class
