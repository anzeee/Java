/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author JOHAND8a
 */
public class Alder {
    public static void main(String[] args) {
        //Deklaration
     
        int alder;
        Scanner sc = new Scanner(System.in);
        
        //Inmatning
        System.out.print("Ange din ålder: ");
        alder = sc.nextInt();
        
        //alder = alder + 1;
        alder = alder + 1;
        System.out.print("Nästa gång fyller du " + alder );
        System.out.println(" din gamling!!");
    }//end main
}//end class
