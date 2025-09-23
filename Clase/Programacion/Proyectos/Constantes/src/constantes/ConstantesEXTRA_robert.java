package constantes;

/**
 *
 * @author r.royo
 */
public class ConstantesEXTRA_robert {

    public static final int BILLET_500 = 500;
    public static final int BILLET_100 = 100;
    public static final int BILLET_50 = 50;
    public static final int BILLET_20 = 20;
    public static final int BILLET_10 = 10;
    public static final int BILLET_5 = 5;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int diners = 232;
        
        int billets500 = diners / BILLET_500;
        diners = diners % BILLET_500;
        int billets100 = diners / BILLET_100;
        diners = diners % BILLET_100;
        int billets50 = diners / BILLET_50;
        diners = diners % BILLET_50;
        int billets20 = diners / BILLET_20;
        diners = diners % BILLET_20;
        int billets10 = diners / BILLET_10;
        diners = diners % BILLET_10;
        int billets5 = diners / BILLET_5;
        diners = diners % BILLET_5;
        int sobrant = diners;
        
        System.out.println("Billets de 500 necesaris: " + billets500);
        System.out.println("Billets de 100 necesaris: " + billets100);
        System.out.println("Billets de 50 necesaris: " + billets50);
        System.out.println("Billets de 20 necesaris: " + billets20);
        System.out.println("Billets de 10 necesaris: " + billets10);
        System.out.println("Billets de 5 necesaris: " + billets5);
        System.out.println("Diners sobrants: " + sobrant);

        
    }
    
}
