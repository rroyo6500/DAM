package For;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class FOR6_Robert {

    public static final Scanner IN = new Scanner(System.in);
    
    public static final double PI = 3.14159265;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("L'area d'una circunferencia de radi " + i + " es: " + String.format("%.2f" , (PI * Math.pow(i, 2))));
        }
        
    }

}
