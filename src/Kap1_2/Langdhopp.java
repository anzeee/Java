/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author JOHAND8
 */
public class Langdhopp {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                
                
         //deklarationen
         double langd, vind;

                System.out.println("Ange vindhastighet: ");
                vind = sc.nextDouble();
                
                System.out.println("Ange hoppets längd: ");
                langd = sc.nextDouble();
                
                if ( vind <=2 && langd >7.92)
                {  System.out.println("Grattis apa");
               }
                else { 
                    System.out.println("Mainstream");
                    
                }
               
                
                
                
                
                
                
                
                
                
                
                
                
                
    }//end main
}//end class
