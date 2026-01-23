package FuncionesYClases.Funciones.SpotifyRobertRoyo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActividadFunciones_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    private static final Scanner IN = new Scanner(System.in);

    private static final double PAGA_PREMIUM = 0.009;
    private static final double PAGA_NORMAL = 0.002;

    private static final double OBJETIVO_DIARIO = 100.0;

    public static void main(String[] args) {

        System.out.println(TStyle.bold(TStyle.green("=== " + TStyle.underline("BENVINGUT A SPOTIFY ANALITICS") + " ===")));
        System.out.println("Analizaremos los datos de los proximos " + TStyle.bold(TStyle.cyan("7")) + " dias");
        System.out.println("Objetivo diario: " + TStyle.bold(TStyle.yellow(OBJETIVO_DIARIO)));
        System.out.println("----------------------------------------");

        double totalFacturado = 0;
        double ingresosMejorDia = 0;
        int mejorDia = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.println("------------------" + TStyle.bold(TStyle.underline(TStyle.cyan("DIA" + i))) + "------------------");

            int reproducciones = validacionGeneral(
                    "Reproducciones del dia " + TStyle.bold(TStyle.cyan(i)),
                    0, 10000000
            );

            int porcentaje = validacionGeneral(
                    "Porcentaje usuarios " + TStyle.bold(TStyle.underline(TStyle.green("Premium"))),
                    0, 100
            );

            double ingresos = calculos(reproducciones, porcentaje);

            totalFacturado += ingresos;
            if (ingresos > ingresosMejorDia) {
                mejorDia = i;
                ingresosMejorDia = ingresos;
            }

            System.out.println("\n" + String.format("""
                    \t> Resultado: %s
                    \t> Rendimiento: %s
                    """,
                    String.format("%.2f", ingresos) + TStyle.bold(TStyle.yellow(" €")),
                    barraVisualizacion(ingresos)
                    )
            );
        }

        System.out.println("----------------------------------------");
        System.out.println("\t" + TStyle.bold(TStyle.underline(TStyle.green("INFORME FIN DE SEMANA"))));
        System.out.println("----------------------------------------");
        System.out.println("\tTotal Facturado: " + TStyle.green(String.format("%.2f", totalFacturado)) + TStyle.bold(TStyle.yellow(" €")));
        System.out.println("\tMEJOR DIA: " +
                TStyle.bold(TStyle.cyan(mejorDia)) + " | " +
                TStyle.green(String.format("%.2f", ingresosMejorDia)) + TStyle.bold(TStyle.yellow(" €"))
        );
        System.out.println("----------------------------------------");

    }

    public static int validacionGeneral (String msg, int min, int max) {
        try {
            System.out.println(msg + ": ");
            int num = IN.nextInt();

            if (num < min || num > max) {
                throw new IllegalArgumentException(String.format("ERROR: Number out of range (%d - %d)", min, max));
            }

            return num;

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            IN.nextLine();
            return validacionGeneral(msg, min, max);
        } catch (InputMismatchException e) {
            System.err.println(
                    String.format(
                            "ERROR: Unicamente puedes introducir numeros dentro del rango (%d - %d)",
                            min, max
                    )
            );
            IN.nextLine();
            return validacionGeneral(msg, min, max);
        }
    }

    public static double calculos(int streams, int percentagePremium) {
        double porcentaje = (double) percentagePremium / 100;

        int cantidadPremium = (int) (streams * porcentaje);
        int cantidadNormal = streams - cantidadPremium;

        double pagaPremium = cantidadPremium * PAGA_PREMIUM;
        double pagaNormal = cantidadNormal * PAGA_NORMAL;

        return pagaNormal + pagaPremium;
    }

    public static String barraVisualizacion(double ingresos) {
        int cantLineas = (int) ((ingresos / OBJETIVO_DIARIO) * 10);
        if (cantLineas > 10) cantLineas = 10;
        int cantPuntos = 10 - cantLineas;



        String lines = "";
        String dots = "";
        for (int i = 0; i < cantLineas; i++){
            lines += "|";
        }
        for (int i = 0; i < cantPuntos; i++) {
            dots += ".";
        }



        String ret = TStyle.bold(TStyle.green(lines) + TStyle.red(dots));

        return String.format("[%s]", ret);
    }

}

// Clase para colores en consola
class TStyle {
    // RESET
    public static final String RESET = "\u001B[0m";
    // TEXT COLORS (foreground)
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String MAGENTA = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";
    // BACKGROUND COLORS
    private static final String BG_BLACK = "\u001B[40m";
    private static final String BG_RED = "\u001B[41m";
    private static final String BG_GREEN = "\u001B[42m";
    private static final String BG_YELLOW = "\u001B[43m";
    private static final String BG_BLUE = "\u001B[44m";
    private static final String BG_MAGENTA = "\u001B[45m";
    private static final String BG_CYAN = "\u001B[46m";
    private static final String BG_WHITE = "\u001B[47m";
    // TEXT STYLES
    private static final String BOLD = "\u001B[1m";
    private static final String ITALIC = "\u001B[3m";
    private static final String UNDERLINE = "\u001B[4m";
    private static final String REVERSE = "\u001B[7m";
    private static final String STRIKETHROUGH = "\u001B[9m";

    // text colors
    public static String red(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + RED);

        return RED + msg + RESET;
    }
    public static String green(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + GREEN);

        return GREEN + msg + RESET;
    }
    public static String yellow(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + YELLOW);

        return YELLOW + msg + RESET;
    }
    public static String blue(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + BLUE);

        return BLUE + msg + RESET;
    }
    public static String magenta(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + MAGENTA);

        return MAGENTA + msg + RESET;
    }
    public static String cyan(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + CYAN);

        return CYAN + msg + RESET;
    }
    public static String white(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + WHITE);

        return WHITE + msg + RESET;
    }
    public static String black(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + BLACK);

        return BLACK + msg + RESET;
    }

    // text bg
    public static String bg_black(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + BG_BLACK);

        return BG_BLACK + msg + RESET;
    }
    public static String bg_red(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + BG_RED);

        return BG_RED + msg + RESET;
    }
    public static String bg_green(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + BG_GREEN);

        return BG_GREEN + msg + RESET;
    }
    public static String bg_yellow(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + BG_YELLOW);

        return BG_YELLOW + msg + RESET;
    }
    public static String bg_blue(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + BG_BLUE);

        return BG_BLUE + msg + RESET;
    }
    public static String bg_magenta(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + BG_MAGENTA);

        return BG_MAGENTA + msg + RESET;
    }
    public static String bg_cyan(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + BG_CYAN);

        return BG_CYAN + msg + RESET;
    }
    public static String bg_white(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + BG_WHITE);

        return BG_WHITE + msg + RESET;
    }

    // text style
    public static String bold(Object msg){
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + BOLD);

        return BOLD + msg + RESET;
    }
    public static String italic(Object msg){
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + ITALIC);

        return ITALIC + msg + RESET;
    }
    public static String underline(Object msg){
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + UNDERLINE);

        return UNDERLINE + msg + RESET;
    }
    public static String reversed(Object msg){
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + REVERSE);

        return REVERSE + msg + RESET;
    }
    public static String strikethrough(Object msg){
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + STRIKETHROUGH);

        return STRIKETHROUGH + msg + RESET;
    }

}