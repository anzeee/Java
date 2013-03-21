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
public class cirkeln2 {
    public static void main(String[] args) {        
       //Deklaration 
        double radie, omkrets, area;
        Scanner sc = new Scanner(System.in);
        Support program = new Support();
        
        System.out.println("Skriv in radien: ");
        radie = sc.nextDouble();
        
        program.omkrets(radie);
        program.area(radie);
              
        Support juan = new Support();
        omkrets = juan.omkrets(radie);
        System.out.println("Omkretsen är: " + omkrets);
        
        Support hasse = new Support();
        area = hasse.area(radie);
        System.out.println("Arean är: " + area);
        
                
              
        
    }//end main
    
}//end class
