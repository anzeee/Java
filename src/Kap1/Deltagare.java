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
public class Deltagare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int deltagare;
        
        System.out.println("Hur många deltagare deltog i tävlingen?");
        
        deltagare = sc.nextInt();
        
        
        if (deltagare>12) {  
            System.out.println("För många!"); 
        }
        
        if (deltagare<12)  {
        System.out.println("OK!");
    }
        
                
        
        
        
        
        
        
        
        
    }//end main
    
}//end class
