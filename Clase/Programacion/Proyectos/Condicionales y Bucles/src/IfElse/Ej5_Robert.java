package IfElse;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Ej5_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("introduce el primer numero: ");
        int n1 = IN.nextInt();

        System.out.print("introduce el segundo numero: ");
        int n2 = IN.nextInt();

        System.out.print("introduce el tercer numero: ");
        int n3 = IN.nextInt();

        if (n1 > n2 && n2 > n3) {
            System.out.println(n1 + " > " + n2 + " > " + n3);
        } else {
            if (n1 > n3 && n3 > n2) {
                System.out.println(n1 + " > " + n3 + " > " + n2);
            } else {
                if (n2 > n3 && n3 > n1) {
                    System.out.println(n2 + " > " + n3 + " > " + n1);
                } else {
                    if (n2 > n1 && n1 > n3) {
                        System.out.println(n2 + " > " + n1 + " > " + n3);
                    } else {
                        if (n3 > n1 && n1 > n2) {
                            System.out.println(n3 + " > " + n1 + " > " + n2);
                        } else {
                            if (n3 > n2 && n2 > n1) {
                                System.out.println(n3 + " > " + n2 + " > " + n1);
                            }
                        }
                    }
                }
            }
        }

    }

}
