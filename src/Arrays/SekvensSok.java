/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author johand8
 */
public class SekvensSok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {13, 15, 7};
        int pos = -1;
        System.out.println("Vilket heltal söker du? ");
        int t = sc.nextInt();
        
        
        
        for (int i = 0; i < arr.length; i++) {
            if (t == arr[i]) {
                pos = i;//anger positionen på hittad plats
                i = arr.length; //loopen slutar
                         
            }//end if
        }//end for
        if (pos == -1) System.out.println("Talet hittades inte!");
        else System.out.println("Talet finns i element nummer " + pos);
    }//end main
}//end class
