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
public class IfTest {
    
    public static void main(String[] args) {
        
        int x,y;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ange x");
           x = sc.nextInt();
        System.out.println("Ange y");
           y = sc.nextInt();
           
           
           if (x > 0 && y > 0 )  {
               System.out.println("Båda positiva"); }
           
           else if (x > 0 || y > 0)  {
               System.out.println("Ett tal är positivt");
           }
           
           else {
               System.out.println("Inget är positivt");
           }
              

        
    }//end main
}//end class
