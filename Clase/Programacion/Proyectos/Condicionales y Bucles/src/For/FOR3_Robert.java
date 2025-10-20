package For;

/**
 *
 * @author r.royo
 */
public class FOR3_Robert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int c = 0;
        for (int i = 0; i <= 100; i++) {
            if ((i % 2) == 1) {
                System.out.println(i);
                c++;
            }
        }
        
        System.out.println("Total: " + c);
        
    }

}
