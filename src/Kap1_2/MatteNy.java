/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author johand8
 */
public class MatteNy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tal1, tal2, sum, diff, kvot, produkt; 
        char raknesatt;
        System.out.println("Skriv in ett tal: ");
        tal1 = sc.nextInt();
        
        System.out.println("Skriv in ett till tal: ");
        tal2 = sc.nextInt();
        
        System.out.println("Vilket räknesätt vill du använda?");
        raknesatt = sc.next().charAt(0);
        
        if ( raknesatt == '+') {
            sum = tal1 + tal2;
            System.out.println("Summan är: " + sum);
        }
        if ( raknesatt == '-') {
            diff = tal1 - tal2;
            System.out.println("Differensen är: " + diff);
        }
        if ( raknesatt == '*') {
            produkt = tal1 * tal2;
            System.out.println("Produkten är: " + produkt);
    }
        
        
        
    }//end main
}//end class
