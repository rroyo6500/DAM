package For;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class FOR2_Robert {

    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("Introduce el primer numero: ");
        int n1 = IN.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int n2 = IN.nextInt();

        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = n1; i >= n2; i--) {
                System.out.println(i);
            }
        }

    }

}
