package Variables;

/**
 *
 * @author r.royo
 */
public class Variables8_robert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int v1 = 10;
        int v2 = 20;
        int residual = 0;
        
        System.out.println("var1 = " + v1);
        System.out.println("var2 = " + v2);
        
        residual = v1;
        v1 = v2;
        v2 = residual;
        
        System.out.println("--------------------------------");
        System.out.println("var1 = " + v1);
        System.out.println("var2 = " + v2);
        
    }
    
}
