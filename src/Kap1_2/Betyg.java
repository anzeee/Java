/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author JOHAND8
 */
public class Betyg {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int poang;
        
        System.out.println("Ange dina poäng: ");
        poang = sc.nextInt();
        
        if(poang >= 20){
            System.out.println("A");
        }
        
        else if(poang >= 15){
            System.out.println("C");
           }
        else if(poang >= 10){
            System.out.println("E");
         }
        
        else{ 
            System.out.println("F");
        }//end if else
        
    }//end main
    
}//end class
