/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author johand8
 */
public class ny {
    public static void main(String[] args) {
        
         int[] a ={1, 2, 3};
         int[] b ={1, 1, 3};
            
         boolean Koll = Arrays.equals(a, b);
         
         if (Koll == true) {
             System.out.println("Lika");
        }//end if
         else{
             System.out.println("Olika");
         }
    }//end main
}//end class
