/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author JOHAND8
 */
public class Loopen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namn;
       int n ;
        System.out.println("Skriv ditt namn: ");
        namn = sc.next();
        System.out.println("Hur Många Varv? ");
        n = sc.nextInt();
        int i = 0;
        
        while( i < n ) {
            System.out.println("Du heter " + namn);
            i++;
        }
     
        
        
    }//end main
    
}//end class
