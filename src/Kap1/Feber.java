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
public class Feber {
    private static double feber;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Feber;
        System.out.println("Ange din Kroppstemperatur:");
        feber = sc.nextDouble();
        
        if (feber>37.5) {
            System.out.println("Du har Feber din febriga jävel!!!!!");
            
        }
        if (feber<35) {
                System.out.println("Du har för låg kroppstemperatur!!!!!!");
            }
           
                else {
            System.out.println("Du är Frisk!!!!!");
                }
        
                
        
        
        
        
    }//end main
          
}//end class
