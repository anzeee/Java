/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author johand8
 */
public class Soltimmar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Hur många soltimmar har Stockholm?");
        int s = sc.nextInt();
       
        System.out.println("Hur många soltimmar har Oslo?");
        int o = sc.nextInt();
        
        System.out.println("Hur många soltimmar har Helsingfors?");
        int h = sc.nextInt();
        
        System.out.print("s: ");
        for (i = 0; i < s; i++) {
            System.out.print("*");}
        
        System.out.println("");
        
        System.out.print("o: ");
        for (i = 0; i < o; i++) {
            System.out.print("*");}
        
            System.out.println("");
            
            System.out.print("h: ");
        for ( i = 0; i < h; i++) {
            System.out.print("*"); }
            
        
        
    }//end main
    
}//end class

