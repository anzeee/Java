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
public class Chansen {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.println("Välj alternativ (A/B):");
        c = sc.next().charAt(0);
        System.out.println("Du skrev tecknet " + c);
        
        if (c == 'A'){
            System.out.println("HAHHAHAH DU SUGER, FEL FEL FEL:");
            
        }
        
        if (c == 'C'){
            System.out.println("Du Vann En Lyxkryssning! GRATTIS!!!");
        
        }
        
        if (c == 'Q'){
        System.out.println("Du är elite!!!!");
    
  }
        else  {
            System.out.println("Nitlott sucker!!!!!!!!:");
            
        }
    }//end main
}//end class
