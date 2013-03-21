
import java.util.LinkedList;
import java.util.Scanner;

public class GlassKon {
    private static Iterable<String> namnLista;
public static void main(String[] args) {
    

LinkedList<String> glassKon = new LinkedList<>();

Scanner sc = new Scanner(System.in);
int nr;
String namn;
char svar;
boolean fortsatt = true;;
    while(fortsatt){
        System.out.print("Länkad lista: ");
    if (glassKon.isEmpty()) System.out.print("Listan är tom");
    else{
        for(int i = 0; i < glassKon.size(); i++)
        System.out.print( i + "." + glassKon.get(i) + " " );
    }
    System.out.println();
    System.out.println("Välj:");
    System.out.println("1. Lägg till en person");
    System.out.println("2. Vem är först i kön?");
    System.out.println("3. Ta bort person");
    System.out.println("0. Avsluta");
try{
svar = sc.nextLine().charAt(0);
                switch (svar){
                     case '1':
                        System.out.print("Skriv ett namn: ");
                        namn = sc.nextLine();
                        glassKon.addLast(namn);
                        break;
                     case '2':
                         System.out.println("Först i kön är: " + glassKon.getFirst());
                         System.out.println("Tryck Enter"); sc.nextLine();
                        break;
                     case '3':
                         System.out.println("Du tar nu bort " + glassKon.removeFirst());
                         System.out.println("Tryck Enter"); sc.nextLine();
                        break;
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

