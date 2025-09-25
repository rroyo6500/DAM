package constantes;

/**
 *
 * @author r.royo
 */
public class Constantes2_robert {

    public static double PI = 3.1416;
    public static final int RADI_1 = 10;
    public static final int RADI_2 = 7;
    public static final int RADI_3 = 43;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double area = 0;
        
        area = PI * Math.pow(RADI_1, 2);
        System.out.println(String.format("%.2f", area));
        
        area = PI * Math.pow(RADI_2, 2);
        System.out.println(String.format("%.2f", area));
        
        area = PI * Math.pow(RADI_3, 2);
        System.out.println(String.format("%.2f", area));
        
    }
    
}
