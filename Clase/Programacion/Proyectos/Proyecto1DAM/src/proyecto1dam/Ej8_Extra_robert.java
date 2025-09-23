package proyecto1dam;

/**
 *
 * @author r.royo
 */
public class Ej8_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int v1 = 10;
        int v2 = 20;
        
        System.out.println("var1 = " + v1);
        System.out.println("var2 = " + v2);
        
        v1 += v2;
        v2 = v1 - v2;
        v1 = v1 - v2;
        
        System.out.println("var1 = " + v1);
        System.out.println("var2 = " + v2);
        
        
    }
    
}
