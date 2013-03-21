/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metoder;

import java.util.Scanner;



/**
 *
 * @author johand8
 */
public class TalMetod {
    public static void main(String[] args) {
         double minst = 0.0;
         double tal1, tal2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("SKRIV IN ETT TAL:");
        tal1 = sc.nextDouble();
        
        System.out.println("SKRIV IN ETT TILL TAL:");
        tal2 = sc.nextDouble();
        
        
        
        
        
        
        
        Metod minsta = new Metod();

      
       
        
      minst = minsta.TalMetod(tal1, tal2);
        System.out.println("Minsta talet är " + minst);
        
        
        
    }// end main
    
}//end class
