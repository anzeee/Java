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
public class Cirkeln {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double pi, radie, area, omkrets;
        
        pi = 3.14159;
        
        System.out.println("Vad är radien?");
        
        radie = sc.nextDouble();
        
        area = radie * radie * pi;
        omkrets = 2 * radie * pi;
        
        System.out.println("Arean är: " + radie * radie * pi);
     
        
        System.out.println("Omkretsen är: " + 2 * radie * pi);
      
           
        
        
        
    }//end main
    
}//end class
