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
public class klotet3 {
    public static void main(String[] args) {
        //Deklaration
        Scanner sc = new Scanner(System.in);
        double r, v;
       
        
        //inmatning
        System.out.println("Vad har klotet för radie?");
          r = sc.nextInt();  
         v = 4 * Math.PI * r *r *r / 3;
         
         //utskrift
          System.out.println("Klotets Volym är: " + v);
          
          
    
    }//end main
}//end class
