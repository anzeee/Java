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
public class klotet2 {
    
    public static void main(String[] args) {
        Support program = new Support();
        Scanner sc = new Scanner(System.in);
        double radie, volym;
        
        System.out.println("Skriv in radie:");
           radie = sc.nextDouble();
           
           volym = program.volym(radie);
       
           
           System.out.println("Volymen är: " + volym);
         
           
          
           
           
           
    }//end main
}//end class
