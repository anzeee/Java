/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author Juan Andersson
 */
public class Aritmetik {
    public static void main(String[] args) {
        //Deklaratiton
        Scanner sc = new Scanner (System.in);
        double x, y, sum, diff, kvot, produkt;
        
        //inmatning
        System.out.print("Skriv in tal1: ");
        x = (int) sc.nextDouble();
        System.out.print("Skriv in ett till tal:");
        y = (int) sc.nextDouble(); 
        //Beräkning
        
        produkt = x * y;
        kvot = x / y;
        sum = x + y;
        diff= x - y;
        //Utskrift
        
        System.out.println("Summan är " + sum);
        System.out.println("Differensen är " + diff);
        System.out.println("Kvoten är " + kvot);
        System.out.println("Produkten är " + produkt);
        
        
        
        
    }//end main
    
   
}//end class
