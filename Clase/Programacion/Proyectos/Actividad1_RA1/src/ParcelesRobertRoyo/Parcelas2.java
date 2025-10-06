package ParcelesRobertRoyo;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Parcelas2 {
    
    public static final Scanner IN = new Scanner(System.in);
    
    public static final int PREU_P1 = 25;
    public static final int PREU_P2 = 20;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introdueix el llarg de la parcela 1: ");
        double llargP1 = IN.nextDouble();
        System.out.print("Introdueix el ample de la parcela 1: ");
        double ampleP1 = IN.nextDouble();
        
        System.out.print("Introdueix el llarg de la parcela 2: ");
        double llargP2 = IN.nextDouble();
        System.out.print("Introdueix el ample de la parcela 2: ");
        double ampleP2 = IN.nextDouble();
        
        int areaP1 = (int) (ampleP1 * llargP1);
        int areaP2 = (int) (ampleP2 * llargP2);
        
        int perimetreP1 = (int) (2 * (llargP1 + ampleP1));
        int perimetreP2 = (int) (2 * (llargP2 + ampleP2));
        
        int preuP1 = PREU_P1 * perimetreP1;
        int preuP2 = PREU_P2 * perimetreP2;
        
        System.out.println("L'area de la parcela 1 es: " + areaP1);
        System.out.println("El perimetre de la parcela 1 es: " + perimetreP1);
        System.out.println("El preu de la parcela 1 es: " + preuP1);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("L'area de la parcela 2 es: " + areaP2);
        System.out.println("El perimetre de la parcela 2 es: " + perimetreP2);
        System.out.println("El preu de la parcela 2 es: " + preuP2);
        
    }

}
