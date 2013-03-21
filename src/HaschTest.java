
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
public class HaschTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> ht = new HashMap<String,String>();
        char svar;
        boolean fortsatt = true;
        while (fortsatt) {
            
        }
        
        ht.put("Danmark", "København");
        ht.put("Sverige", "Stockholm");
        ht.put("Norge", "Oslo");
        ht.put("Ryssland", "Москва́");
        ht.put("Tyskland", "Berlin");
        ht.put("Finland", "Helsingfors");
        ht.put("Frankrike", "Paris");
        
        System.out.println("Land? ");
        String land = sc.nextLine();
        while(!land.equals('#')) {
            
            System.out.println("Huvudstad: " + ht.get(land));
            System.out.println("Land? ");
            land = sc.nextLine();
        }     
        System.out.println("SLUT");
    }//end main
}//end class
    