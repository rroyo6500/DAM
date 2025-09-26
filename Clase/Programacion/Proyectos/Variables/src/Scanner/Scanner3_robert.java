package Scanner;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Scanner3_robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introdueix la base del triangle: ");
        double base = IN.nextDouble();
        
        System.out.print("Introdueix l'altura del triangle: ");
        double altura = IN.nextDouble();
        
        double area = (base * altura) / 2;
        
        System.out.println("L'area del triangle es: " + area);
        
    }

}
