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
public class Klotet {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       double r;
       
        System.out.println("Vad är klotets radie?");
        r = sc.nextDouble();
        
        
        System.out.println("Volymen är: " + 4 * Math.PI * r * r * r / 3);
        
        
    }//end main
    
}//end class
