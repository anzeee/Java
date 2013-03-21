/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author Johan Andersson
 */
public class Ohm {   public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            double u, r, i;
            char fort;   
            
            do {
            System.out.println("skriv in ett värde på strömmen: ");
            
            i = sc.nextDouble();
            
            System.out.println("skriv in ett värde på resistansen: ");
            
            r = sc.nextDouble();
            
            u = i * r;
            
            System.out.println("Spänningen är lika med: " + u);
               
            System.out.println("Vill du fortsätta? (j/n)");
              fort = sc.next().charAt(0);
            
                 
            } while ( fort == 'j');
             
             if (fort == ('n')) {
                 System.out.println("DÅ SES VI NÅGON ANNAN GÅNG! :)");
             }
            
            
                
    

    }//end main
}//end class

