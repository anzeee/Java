import java.util.ArrayList;
import java.util.Scanner;

public class LankadListaTest {
public static void main(String[] args) {
    

ArrayList<String> namnlista = new ArrayList<>();

Scanner sc = new Scanner(System.in);
int nr;
String namn;
char svar;
boolean fortsatt = true;;
    while(fortsatt){
        System.out.print("Länkad lista: ");
    if (namnlista.isEmpty()) System.out.print("Listan är tom");
    else{
        for(int i = 0; i < namnlista.size(); i++)
        System.out.print( i + "." + namnlista.get(i) + " " );
    }
    System.out.println();
    System.out.println("Välj:");
    System.out.println("1. Fyll listan med namn");
    System.out.println("2. Lägg till ett namn");
    System.out.println("3. Lägg till namn på viss plats");
    System.out.println("4. Se element nummer...");
    System.out.println("5. Ta bort element nummer...");
    System.out.println("6. Ta bort ett namn");
    System.out.println("7. Ta bort alla");
    System.out.println("0. Avsluta");
try{
svar = sc.nextLine().charAt(0);
                switch (svar){
                     case '1':
                        namnlista.add("Kalle"); namnlista.add("Lisa");
                        namnlista.add("Anna"); namnlista.add("Johan");
                        namnlista.add("Stina"); namnlista.add("Pelle");
                        break;
                     case '2':
                        System.out.print("Skriv ett namn: ");
                        namn = sc.nextLine();
                        if (!namn.equals("")) namnlista.add(namn);
                        break;
                     case '3':
                        System.out.print("Skriv ett namn: ");
                        namn = sc.nextLine();
                        System.out.print("Ange plats: ");
                        nr = Integer.parseInt(sc.nextLine());
                        if (!namn.equals("")) namnlista.add(nr,namn);
                        break;
                     case '4':
                        System.out.print("Skriv ett nummer: ");
                        nr = Integer.parseInt(sc.nextLine());
                        System.out.print("På denna plats finns " + namnlista.get(nr));
                        System.out.print("(Tryck ENTER)"); sc.nextLine();
                        break;
                     case '5':
                     case '6':
                         System.out.println("Ange namnet du vill ta bort: ");
                         namn = sc.next();
                         boolean hittad = false;
                         if(!namn.equals("")){
                             for (String namnetIListan : namnLista) {
                                 if (namnetIListan.equals(namn)) {
                                     namnLista.remove(namn);
                                     hittad = true;
                                 }
                             }//end for
                         }
                     case '0':
                        fortsatt = false;
                        System.out.println("SLUT");
                        break;
                } // end of switch
} catch(Exception e){ System.out.println("Error");
}
System.out.println();
} // end of while
} // end of main
} // end of class