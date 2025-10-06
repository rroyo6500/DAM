package Scanner;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Scanner2_robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        System.out.println("Introdueix 5 numeros enters: ");
        System.out.print("Numero 1: ");
        int n1 = IN.nextInt();
        System.out.print("Numero 2: ");
        int n2 = IN.nextInt();
        System.out.print("Numero 3: ");
        int n3 = IN.nextInt();
        System.out.print("Numero 4: ");
        int n4 = IN.nextInt();
        System.out.print("Numero 5: ");
        int n5 = IN.nextInt();
        IN.nextLine();
        
        double suma = (double) n1 + (double) n2 + (double) n3 + (double) n4 +(double)  n5;
        System.out.println("La suma dels numeros anteriors es: " + (int) suma);
        System.out.println("La mitjana dels numeros anteriors es: " + (suma / 5));
    }

}
