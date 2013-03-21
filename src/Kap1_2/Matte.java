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
public class Matte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tal1, tal2, sum, diff, kvot, pro;
        char r, fort;
        do {
        
        
        System.out.println("Skriv ut x värde: ");
        tal1 = sc.nextInt();
        
        System.out.println("Skriv ut y värde: ");
        tal2 = sc.nextInt();
        
        System.out.println("Vilket räknesätt vill du använda? ");
        r = sc.next().charAt(0);
        
                
         if (r == '+'){
             sum = tal1 + tal2;
             System.out.println("Summan är: " + sum);  }
         
         if (r == '-'){
             diff = tal1 - tal2;
             System.out.println("Differensen är: " + diff); }
                
         if (r == '/'){
             kvot = tal1 / tal2;
             System.out.println("Kvoten är: " + kvot); }
             
         if (r == '*'){
             pro = tal1 * tal2;
             System.out.println("Produkten är: " + pro);  }
         
            System.out.println("Vill du fortsätta? (j)");
            fort = sc.next().charAt(0);
            
        }   while ( fort == 'J' || fort == 'j');
         
         
    }//end main
}//end class
