package ParcelesRobertRoyo;

/**
 *
 * @author r.royo
 */
public class Parcelas1 {
    
    public static final int PREU_P1 = 25;
    public static final int PREU_P2 = 20;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int llargP1 = 50;
        int ampleP1 = 30;
        int llargP2 = 40;
        int ampleP2 = 25;
        
        int areaP1 = ampleP1 * llargP1;
        int areaP2 = ampleP2 * llargP2;
        
        int perimetreP1 = 2 * (llargP1 + ampleP1);
        int perimetreP2 = 2 * (llargP2 + ampleP2);
        
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
