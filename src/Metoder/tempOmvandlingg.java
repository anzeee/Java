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
public class tempOmvandlingg {
    
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
     
        
        double celsius, x;
        
        System.out.println("Mata in temp i farenheit: ");
        x = sc.nextDouble();
        
        
     
               
           Support juan = new Support();
           
           celsius = juan.tempOmvandling(x);
        
        
        System.out.println("Det blir: " + celsius);
        
        
        
        
    }//end main
                    
        
}//end class
