package ArraysRobertRoyo;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Arrays_RobertRoyo {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);
    public static final Random R = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 0;
        while (opcion != 5) {

            try {
                System.out.println("""
                               \nSelecciona una opcion de programa:
                               \t1. Calculo letra DNI / NIE
                               \t2. Ordenacion nombres
                               \t3. Tabla puntuacion
                               \t4. Ruleta
                               \t5. Salir
                               """);
                System.out.print("\t- ");
                opcion = IN.nextInt();
                IN.nextLine();

                switch (opcion) {
                    case 1 -> {
                        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
                        char letra;

                        while (true) {
                            try {
                                System.out.print("\nIntroduce el tipo de documento que tienes (DNI | NIE): ");
                                String documento = IN.nextLine().toUpperCase();

                                System.out.print("Introduce los numeros de tu documento: ");
                                String numeros = IN.nextLine().toUpperCase();
                                String copia = numeros;

                                switch (documento) {
                                    case "NIE":
                                        if (!numeros.matches("[XYZxyz]\\d{7}")) {
                                            throw new IllegalArgumentException("ERROR: Debes introducir un NIE valido.");
                                        }

                                        numeros = numeros.replace('X', '0').replace('Y', '1').replace('Z', '2');
                                    case "DNI":
                                        if (!numeros.matches("\\d{8}")) {
                                            throw new IllegalArgumentException("ERROR: Debes introducir un DNI valido.");
                                        }

                                        letra = letras[(Integer.parseInt(numeros) % 23)];
                                        break;
                                    default:
                                        throw new IllegalArgumentException("ERROR: Debes especificar un tipo de documento valido (DNI | NIE)");
                                }

                                System.out.println("La letra de tu " + documento + " [ " + copia + " ]" + " es " + letra);

                                break;
                            } catch (IllegalArgumentException iae) {
                                System.err.println(iae.getMessage());
                            }
                        }

                    }
                    case 2 -> {
                        String[] estudiantes = new String[7];
                        for (int i = 0; i < estudiantes.length; i++) {
                            System.out.print("Introduce el nombre del estudiante numero " + (i + 1) + ": ");
                            estudiantes[i] = IN.nextLine();
                        }
                        int opcionOrden = 0;
                        while (opcionOrden != 1 && opcionOrden != 2) {
                            try {
                                System.out.print("Introduce el orden (Ascendente [1] | Descendente [2]): ");
                                opcionOrden = IN.nextInt();
                                IN.nextLine();

                                if (opcionOrden != 1 && opcionOrden != 2) {
                                    throw new IllegalArgumentException("""
                                                                       ERROR: Tienes que introducir una opcion valida.
                                                                       \t1. Ascendente
                                                                       \t2. Descendente
                                                                       """);
                                }
                            } catch (InputMismatchException ime) {
                                System.err.println("ERROR: Tienes que introducir un numero.");
                                IN.nextLine();
                            } catch (IllegalArgumentException iae) {
                                System.err.println(iae.getMessage());
                            }
                        }

                        Arrays.sort(estudiantes);

                        switch (opcionOrden) {
                            case 1 -> {
                                for (int i = 0; i < estudiantes.length; i++) {
                                    System.out.print(estudiantes[i] + "  ");
                                }
                            }
                            case 2 -> {
                                String[] tmp = new String[7];

                                int p = 0;
                                for (int i = estudiantes.length - 1; i >= 0; i--) {
                                    tmp[p] = estudiantes[i];
                                    p++;
                                }

                                for (int i = 0; i < estudiantes.length; i++) {
                                    System.out.print(tmp[i] + "  ");
                                }
                            }
                        }
                        System.out.println("");

                    }
                    case 3 -> {

                        int[] puntuacion = new int[10];
                        int[] premios = new int[10];

                        for (int i = 0; i < premios.length; i++) {
                            puntuacion[i] = R.nextInt(100, 1000);
                            premios[i] = R.nextInt(1000, 10001);
                        }
                        Arrays.sort(puntuacion);
                        Arrays.sort(premios);

                        System.out.println("""
                                           Tabla de puntuacion:
                                           ----------------------------------------------------------------""");
                        int p = (premios.length - 1);
                        for (int i = 0; i < premios.length; i++) {
                            System.out.println(String.format("TOP %d - %d puntos [ %d € ]", ((int) i + 1), puntuacion[p], premios[p]));
                            p--;
                        }

                    }
                    case 4 -> {

                        /*
                        v -> Verde
                        r -> Rojo
                        n -> Negro
                         */
                        char[] ruleta = new char[37];
                        ruleta[0] = 'v';

                        for (int i = 1; i < ruleta.length; i++) {
                            if (i > 0 && i <= 10 || i > 18 && i <= 28) {
                                if (i % 2 == 0) {
                                    ruleta[i] = 'n';
                                } else {
                                    ruleta[i] = 'r';
                                }
                            } else if (i > 10 && i <= 18 || i > 28 && i <= 36) {
                                if (i % 2 == 0) {
                                    ruleta[i] = 'r';
                                } else {
                                    ruleta[i] = 'n';
                                }
                            }
                        }

                        while (true) {
                            try {
                                System.out.print("Quieres apostar por: Par (p) | Impar (i) | Verde (v) | Rojo (r) | Negro (n): ");
                                char opcionRuleta = Character.toLowerCase(IN.next().charAt(0));

                                int resultado = R.nextInt(0, 37);
                                boolean win = false;

                                switch (opcionRuleta) {
                                    case 'p' -> {
                                        if (resultado % 2 == 0) {
                                            win = true;
                                        }
                                    }
                                    case 'i' -> {
                                        if (resultado % 2 == 1) {
                                            win = true;
                                        }
                                    }
                                    case 'v' -> {
                                        if (ruleta[resultado] == 'v') {
                                            win = true;
                                        }
                                    }
                                    case 'r' -> {
                                        if (ruleta[resultado] == 'r') {
                                            win = true;
                                        }
                                    }
                                    case 'n' -> {
                                        if (ruleta[resultado] == 'n') {
                                            win = true;
                                        }
                                    }
                                    default -> {
                                        throw new IllegalArgumentException("ERROR: Apuesta no valida.");
                                    }
                                }

                                switch (ruleta[resultado]) {
                                    case 'v' ->
                                        System.out.println("La ruleta ha caido en el numero " + TStyle.green(resultado) + " ( " + String.valueOf(ruleta[resultado]) + " )" + ".");
                                    case 'r' ->
                                        System.out.println("La ruleta ha caido en el numero " + TStyle.red(resultado) + " ( " + String.valueOf(ruleta[resultado]) + " )" + ".");
                                    case 'n' ->
                                        System.out.println("La ruleta ha caido en el numero " + resultado + " ( " + String.valueOf(ruleta[resultado]) + " )" + ".");
                                }                             
                                
                                System.out.println(String.valueOf(ruleta[resultado]));

                                System.out.println(win ? "Has ganado!!" : "Lo siento. has perdido");

                                break;
                            } catch (IllegalArgumentException iae) {
                                System.err.println(iae.getMessage());
                            }
                        }

                    }
                    case 5 -> {
                        break;
                    }
                    default -> {
                        throw new IllegalArgumentException("ERROR: Opcion no valida. " + opcion);
                    }
                }

            } catch (InputMismatchException ime) {
                System.err.println("ERROR: la opcion debe ser un numero.");
                IN.nextLine();
            } catch (IllegalArgumentException iae) {
                System.err.println(iae.getMessage());
                IN.nextLine();
            }

        }

    }

}

class TStyle {

    // RESET
    public static final String RESET = "\033[0m";

    // TEXT COLORS (foreground)
    private static final String BLACK = "\033[30m";
    private static final String RED = "\033[31m";
    private static final String GREEN = "\033[32m";
    private static final String YELLOW = "\033[33m";
    private static final String BLUE = "\033[34m";
    private static final String MAGENTA = "\033[35m";
    private static final String CYAN = "\033[36m";
    private static final String WHITE = "\033[37m";

    // BACKGROUND COLORS
    private static final String BG_BLACK = "\033[40m";
    private static final String BG_RED = "\033[41m";
    private static final String BG_GREEN = "\033[42m";
    private static final String BG_YELLOW = "\033[43m";
    private static final String BG_BLUE = "\033[44m";
    private static final String BG_MAGENTA = "\033[45m";
    private static final String BG_CYAN = "\033[46m";
    private static final String BG_WHITE = "\033[47m";

    // TEXT STYLES
    private static final String BOLD = "\033[1m";
    private static final String ITALIC = "\033[3m";
    private static final String UNDERLINE = "\033[4m";
    private static final String REVERSE = "\033[7m";
    private static final String STRIKETHROUGH = "\033[9m";

    // text colors
    public static String red(Object msg) {
        return String.format("%s%s%s", RED, String.valueOf(msg), RESET);
    }

    public static String green(Object msg) {
        return String.format("%s%s%s", GREEN, String.valueOf(msg), RESET);
    }

    public static String yellow(Object msg) {
        return String.format("%s%s%s", YELLOW, String.valueOf(msg), RESET);
    }

    public static String blue(Object msg) {
        return String.format("%s%s%s", BLUE, String.valueOf(msg), RESET);
    }

    public static String magenta(Object msg) {
        return String.format("%s%s%s", MAGENTA, String.valueOf(msg), RESET);
    }

    public static String cyan(Object msg) {
        return String.format("%s%s%s", CYAN, String.valueOf(msg), RESET);
    }

    public static String white(Object msg) {
        return String.format("%s%s%s", WHITE, String.valueOf(msg), RESET);
    }

    public static String black(Object msg) {
        return String.format("%s%s%s", BLACK, String.valueOf(msg), RESET);
    }

    // text bg
    public static String bg_black(Object msg) {
        return String.format("%s%s%s", BG_BLACK, String.valueOf(msg), RESET);
    }

    public static String bg_red(Object msg) {
        return String.format("%s%s%s", BG_RED, String.valueOf(msg), RESET);
    }

    public static String bg_green(Object msg) {
        return String.format("%s%s%s", BG_GREEN, String.valueOf(msg), RESET);
    }

    public static String bg_yellow(Object msg) {
        return String.format("%s%s%s", BG_YELLOW, String.valueOf(msg), RESET);
    }

    public static String bg_blue(Object msg) {
        return String.format("%s%s%s", BG_BLUE, String.valueOf(msg), RESET);
    }

    public static String bg_magenta(Object msg) {
        return String.format("%s%s%s", BG_MAGENTA, String.valueOf(msg), RESET);
    }

    public static String bg_cyan(Object msg) {
        return String.format("%s%s%s", BG_CYAN, String.valueOf(msg), RESET);
    }

    public static String bg_white(Object msg) {
        return String.format("%s%s%s", BG_WHITE, String.valueOf(msg), RESET);
    }

    // text style
    public static String bold(Object msg) {
        return String.format("%s%s%s", BOLD, String.valueOf(msg), RESET);
    }

    public static String italic(Object msg) {
        return String.format("%s%s%s", ITALIC, String.valueOf(msg), RESET);
    }

    public static String underline(Object msg) {
        return String.format("%s%s%s", UNDERLINE, String.valueOf(msg), RESET);
    }

    public static String reversed(Object msg) {
        return String.format("%s%s%s", REVERSE, String.valueOf(msg), RESET);
    }

    public static String strikethrough(Object msg) {
        return String.format("%s%s%s", STRIKETHROUGH, String.valueOf(msg), RESET);
    }

}
