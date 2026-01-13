package arrays;


import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class RobertRoyo_Arrays2 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] valors = {45, 23, 67, 12, 89, 72, 39, 19, 89, 23, 13, 89};

        for (int i = 0; i < valors.length; i++) {
            System.out.print(valors[i] + "    ");
        }
        System.out.println("\n");
        
        System.out.print("Introduce un numero: ");
        int num = IN.nextInt();
        
        int c = 0;
        for (int i = 0; i < valors.length; i++) {
            if (valors[i] == num) {
                c++;
            }
        }
        System.out.println("El numero " + num + " esta repetido " + c + " veces");

    }

}
