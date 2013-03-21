/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author Johan Andersson
 */
public class Ohm {   public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            double u, r, i;
            
            System.out.println("skriv in ett värde på strömmen: ");
            
            i = sc.nextDouble();
            
            System.out.println("skriv in ett värde på resistansen: ");
            
            r = sc.nextDouble();
            
            u = i * r;
            
            System.out.println("Spänningen är lika med: " + i * r);
               
    

    }//end main
}//end class
