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
public class Summera {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in); 
        int x, y, sum;
        
        System.out.println("Skriv in ett tal:");        
        x = sc.nextInt();
        System.out.println("Skriv ett tal till; ");
        y = sc.nextInt();
      
      
        sum = x / y;
        
        System.out.println("Summan är: "+ sum );
        
    
        
        
        
        
        
    }// end main
     
 
}//end class
