
import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOHAND8
 */
public class GlosLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        HashMap<String, String> tant = new HashMap<>();
        char svar;
        boolean fortsatt = true;
        int antalratt = 0;
        
        while (fortsatt) {

            
        System.out.println("");
        System.out.println("Välj");
        System.out.println("1. Skapa gloslista");
        System.out.println("2. Visa gloslista");
        System.out.println("3. Skriv in ny glosa");
        System.out.println("4. Glostest");
        System.out.println("0. Avsluta");
        
       
        
        try {
            svar = sc.nextLine().charAt(0);
            switch (svar) {
                case '1':
                    System.out.println("");
                       
            tant.put("Sverige", "sweden");
            tant.put("Rakapparat", "shaver");
            tant.put("Sten", "pebble");
            tant.put("Måne", "RoundAndWhiteAndDead");
            tant.put("Samlag", "sexual intercourse");
            tant.put("Alvedon", "alvedon");
            tant.put("Hans Emmoth", "Његов Еммотх");
            
            System.out.println("Listan är fylld!");
                    break;
                case '2':   
                    for (String nyckel : tant.keySet()){
                            System.out.println("");
                            System.out.print(nyckel + ": ");
                            System.out.println(tant.get(nyckel));
                            }//end for
                    break;
                case '3': 
                    System.out.println("Skriv in glosan på svenska: ");
                    String glosaSv = sc.next();
                    System.out.println("Skriv in glosan på engelska: ");
                    String glosaEng = sc.next();
                    tant.put(glosaSv, glosaEng);
                    break;
                case '4': 
                     for (String nyckel : tant.keySet()){
                            System.out.print("Vad är det engelska ordet för " + nyckel + "? ");
                            String svaret = sc.nextLine();
               svaret.equalsIgnoreCase(svaret);             
                              if (svaret.equals(tant.get(nyckel))) {
                                  System.out.println("Rätt");
                                        antalratt ++;
                              }//end if
                              else {System.out.println("Fel svar, det rätta svaret är: " + tant.get(nyckel));
                              }//end else
                            }//end for
                           System.out.println("Du fick " + antalratt + " Rätt");
                            break;
                    
                default:
                  
            }//end switch
            
        }//end try
        catch (Exception e) {}
        System.out.println("");
        }//end while
    }//end main
}//end class
