/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author JOHAND8
 */
public class Skivor {  
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    DecimalFormat d = new DecimalFormat("0.##");
     double Antalskivor, skivor = 0, Skivpris;
     String formateratTal;
        System.out.println("Hej och välkommen till CDR butiken! Här köper du skivor med upp till 15% rabbatt på hela köpet!"
                );
        System.out.println("Priset per skiva är 9.90kr styck");
        System.out.println("Hur många vill du köpa? ");
        Antalskivor = sc.nextDouble();
         Skivpris = Antalskivor * 9.90;
        
        if (Antalskivor >=100) {
            Skivpris = Skivpris * 0.85;
            formateratTal = d.format(Skivpris);
            System.out.println("Det blir 15% Rabatt för dig!");
            System.out.println("Summan är: " + skivor * 0.85);
        
        }
        else if (Antalskivor >=50) {
            Skivpris = Skivpris * 0.90;
            formateratTal = d.format(Skivpris);
            System.out.println("Du får 10% Rabatt!");
            System.out.println("Summan är: " + formateratTal);
        }
        else if (Antalskivor >=10) {
            Skivpris = Skivpris * 0.95;
            formateratTal = d.format(Skivpris);
            System.out.println("Du får 5% Rabatt!");
            System.out.println("Summan är " + formateratTal);
        }
        else {
            formateratTal = d.format(Skivpris);
            System.out.println("Det blir ingen Rabatt för dig!");
        }
        
        
     
     
     
     
     
     
     
     
     
     
     
     
    }//end main
    
}//end class
