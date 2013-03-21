/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

import java.util.Scanner;

/**
 *
 * @author JOHAND8
 */
public class Bytatecken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder  hemligtOrd = new StringBuilder ("??????");
        
        for (int i = 0; i < hemligtOrd.length(); i++) {
            
            System.out.println("Ange en bokstav: ");
            char tecken = sc.next().charAt(0);
            hemligtOrd.setCharAt(i, tecken);
            System.out.println(hemligtOrd.toString());
        }
                
    }//end main  
}//end class
