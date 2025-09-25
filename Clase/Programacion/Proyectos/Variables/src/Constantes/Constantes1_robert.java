package constantes;

/**
 *
 * @author r.royo
 */
public class Constantes1_robert {

    public static final double GRAVETAT = 9.8d;
    public static final int PES_1 = 75;
    public static final int PES_2 = 162;
    public static final int PES_3 = 20000;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double pes = 0;
        
        pes = PES_1 * GRAVETAT;
        System.out.println(String.format("%.2f", pes));
        
        pes = PES_2 * GRAVETAT;
        System.out.println(String.format("%.2f", pes));
        
        pes = PES_3 * GRAVETAT;
        System.out.println(String.format("%.2f", pes));
        
    }
    
}
