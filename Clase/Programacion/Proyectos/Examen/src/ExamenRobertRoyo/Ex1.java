package ExamenRobertRoyo;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Ex1 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String opcion = "";
        System.out.println("""
                           Selecciona un menjar de les següents opcions:
                           \tX. Pizza
                           \tY. Amanida
                           \tZ. Sushi
                           """);
        System.out.print("\t- ");
        opcion = IN.nextLine();

        switch (opcion) {
            case "x" ->
                System.out.println("Ha seleccionat encarregar " + TStyle.cyan("Pizza"));
            case "y" ->
                System.out.println("Ha seleccionat encarregar " + TStyle.cyan("Amanida"));
            case "z" ->
                System.out.println("Ha seleccionat encarregar " + TStyle.cyan("Sushi"));
            default ->
                System.err.println("L'opció no es vàlida");
        }

    }

}
