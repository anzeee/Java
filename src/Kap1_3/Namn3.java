/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

/**
 *
 * @author JOHAND8
 */
public class Namn3 {
    public static void main(String[] args) {
        
        String namn = "Olle";
        String enamn = "Persson";
        
        
        System.out.println(namn.charAt(0)+ "." + enamn.charAt(0));
           String helaNamnet = "Johan Andersson";
           System.out.print(helaNamnet.charAt(0) + ".");
           
           for (int i = 0; i < helaNamnet.length(); i++) {
             if (helaNamnet.charAt(i) == ' ' ){
                  System.out.println(helaNamnet.charAt(i + 1));
                  
                  
                  
                 }
           }
    }//end main
}//end class
