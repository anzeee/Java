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
public class poang {
    public static void main(String[] args) {
       //Deklaration
        Scanner sc = new Scanner(System.in);
       int poang;  
       
       //inmatning 
      System.out.println("Skriv in dina poäng du fick på provet: ");
        poang = sc.nextInt();
        
       //Utskrift
        if (poang >= 50) { System.out.println("Du är godkänd!");
            
        }
        else  { System.out.println("Underkänd!"); }
        
        
    }//end main
}//end class
