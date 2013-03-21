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
public class DeltagareNy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int antal;
                
        System.out.println("Hur många personer ska deltaga?");
         antal = sc.nextInt();
         
         if (antal < 13) {
        System.out.println("OK!!");
    }
        if (antal > 12 ) {
            System.out.println("FÖR MÅNGA!!!"); }
        
    }//end main
}//end class 
