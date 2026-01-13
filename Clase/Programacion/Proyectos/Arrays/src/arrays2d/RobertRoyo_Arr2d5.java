package arrays2d;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class RobertRoyo_Arr2d5 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[][] lletres = {{'a', 'c', 'e'}, {'a', 'b', 'a'}, {'l', 'd', 'z'}};

        for (int i = 0; i < lletres.length; i++) {
            for (int j = 0; j < lletres[i].length; j++) {
                System.out.print(lletres[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.print("Introduce la coordenada Y (1-" + lletres.length + "): ");
        int y = IN.nextInt() - 1;

        System.out.print("Introduce la coordenada X (1-" + lletres[y].length + "): ");
        int x = IN.nextInt() - 1;

        System.out.print("Introduce el nuevo valor para la posicion " + x + " | " + y + " (Valor actual: '" + lletres[y][x] + "'): ");
        char letra = IN.next().charAt(0);

        lletres[y][x] = letra;
        for (int i = 0; i < lletres.length; i++) {
            for (int j = 0; j < lletres[i].length; j++) {
                System.out.print(lletres[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
