package ParcelesRobertRoyo;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Parcelas3 {
    
    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    public static final int PREU_P1 = 25;
    public static final int PREU_P2 = 20;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nom;
        String p1, p2;
        double llargP1, ampleP1;
        double llargP2, ampleP2;
        
        // ------------------------------------------------------------------
        
        System.out.print("Introdueix el teu nom: ");
        nom = IN.nextLine();
        
        System.out.println("\nBenvingut/da, " + nom + "! Comencem amb el calcul de las parcel·las.\n");
        
        // ------------------------------------------------------------------
        
        System.out.print("Introdueix el nom de la 1a parcel·la: ");
        p1 = IN.nextLine();
        
        System.out.print("Introdueix el llarg de '" + p1 + "': ");
        llargP1 = IN.nextDouble();
        System.out.print("Introdueix el ample de la '" + p1 + "': ");
        ampleP1 = IN.nextDouble();
        IN.nextLine();
        
        System.out.println("--------------------------------");
        
        System.out.print("Introdueix el nom de la 2a parcel·la: ");
        p2 = IN.nextLine();
        
        System.out.print("Introdueix el llarg de la '" + p2 + "': ");
        llargP2 = IN.nextDouble();
        System.out.print("Introdueix el ample de la '" + p2 + "': ");
        ampleP2 = IN.nextDouble();
        IN.nextLine();
        
        // ------------------------------------------------------------------
        
        int areaP1 = (int) (ampleP1 * llargP1);
        int areaP2 = (int) (ampleP2 * llargP2);
        
        int perimetreP1 = (int) (2 * (llargP1 + ampleP1));
        int perimetreP2 = (int) (2 * (llargP2 + ampleP2));
        
        int preuP1 = PREU_P1 * perimetreP1;
        int preuP2 = PREU_P2 * perimetreP2;
        
        // ------------------------------------------------------------------

        String p1Encriptado = p1.replaceAll("[aeiouAEIOU]", "#");
        String p2Encriptado = p2.replaceAll("[aeiouAEIOU]", "#");
        
        // ------------------------------------------------------------------
        
        System.out.println("\nL'area de '" + p1 + "' es: " + areaP1);
        System.out.println("El perimetre de '" + p1 + "' es: " + perimetreP1);
        System.out.println("El preu de '" + p1 + "' es: " + preuP1 + "€");
        System.out.println("--------------------------------");
        System.out.println("L'area de '" + p2 + "' es: " + areaP2);
        System.out.println("El perimetre de '" + p2 + "' es: " + perimetreP2);
        System.out.println("El preu de '" + p2 + "' es: " + preuP2 + "€");
        
        // ------------------------------------------------------------------
        
        System.out.println("\n" + p1 + " --> " + p1Encriptado);
        System.out.println(p2 + " --> " + p2Encriptado);
        
         // ------------------------------------------------------------------
         
         System.out.print("\nIntrodueix part del nom d'una parcel·la: ");
         String n = IN.nextLine();
         
         System.out.println("\n" + p1Encriptado + " --> " + p1.contains(n));
         System.out.println(p2Encriptado + " --> " + p2.contains(n));
        
    }

}
