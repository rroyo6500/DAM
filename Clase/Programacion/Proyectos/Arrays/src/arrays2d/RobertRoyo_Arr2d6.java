package arrays2d;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class RobertRoyo_Arr2d6 {

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
        
        System.out.print("Introduce una letra: ");
        char letra = IN.next().charAt(0);
        
        int c = 0;
        for (int i = 0; i < lletres.length; i++) {
            for (int j = 0; j < lletres[i].length; j++) {
                if (lletres[i][j] == letra) {
                    c++;
                }
            }
        }
        
        if (c == 0) {
            System.err.println("No se ha encontrado la letra '" + letra + "' en la lista.");
        } else {
            System.out.println("En la lista hay " + c + " '" + letra + "'.");
        }
        
        
    }

}
