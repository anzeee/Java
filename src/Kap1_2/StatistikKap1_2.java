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
public class StatistikKap1_2 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int tal, n, max = 0;
                double summa = 0, medelvarde = 0;
                System.out.println("Hur många tal ska behandlas: ");
                n = sc.nextInt();
                
                for (int i = 0; i < n; i++) { 
                    System.out.println("Skriv in ett tal: ");
                    tal = sc.nextInt();  
                    summa = summa + tal;
                    medelvarde = summa / n;
                    if ( tal > max ) {
                        max = tal;
                    }
                }
                System.out.println("Summan är: " + summa);
                System.out.println("Medelvärdet är: " + medelvarde);
                System.out.println("Största värdet är: " + max);
                
                
                
                
                
    }//end main
    
}//end class
