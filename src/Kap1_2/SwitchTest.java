
package Kap1_2;

import java.util.Scanner;

public class SwitchTest {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double manad;
        
        
        
        System.out.println("Ange Månad: ");
        manad = sc.nextDouble();
        
        switch (manad) {
            case 1.0:
                System.out.println("Januari");
                break;    
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Augusti");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default: 
                System.out.println("Ange ett tal mellan 1-12");
             
        }
        
        
        
        
        
        
        
        
        
    }//end main
}//end class
