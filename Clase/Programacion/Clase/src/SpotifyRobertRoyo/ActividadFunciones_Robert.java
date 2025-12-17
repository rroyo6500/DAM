package SpotifyRobertRoyo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ActividadFunciones_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    private static final Scanner IN = new Scanner(System.in);

    private static final double PAGA_PREMIUM = 0.009;
    private static final double PAGA_NORMAL = 0.002;

    public static void main(String[] args) {

        System.out.println(TStyle.bold(TStyle.green("=== " + TStyle.underline("BENVINGUT A SPOTIFY ANALITICS")) + TStyle.green(" ===")));
        System.out.println("Analitzarem les dades dels pròxims " + TStyle.bold(TStyle.cyan("7")) + " dies");
        System.out.println("Objectiu diari: " + TStyle.bold(TStyle.yellow("100.0€")));
        System.out.println("----------------------------------------");

        for (int i = 1; i <= 7; i++) {
            System.out.println("------------------" + TStyle.bold(TStyle.underline(TStyle.cyan("DIA" + i))) + "------------------");
        }

    }

    public static double getPercentage(String msg, int min, int max) {
        System.out.print(msg + ": ");
        int num = IN.nextInt();
        IN.nextLine();

        if (num < min || num > max) 
            throw new IllegalArgumentException(String.format("ERROR: Number out of range (%d - %d)", min, max));

        return (double) num / 100;
    }

    public static double calc(int streams, double percentagePremium) {
        int cantidadPremium = (int) (streams * percentagePremium);
        int cantidadNormal = streams - cantidadPremium;

        double pagaPremium = cantidadPremium * PAGA_PREMIUM;
        double pagaNormal = cantidadNormal * PAGA_NORMAL;

        return pagaNormal + pagaPremium;
    }

    public static String barraVisualizacion(double ingresos) {
        int cantLineas = (int) (ingresos / 10);
        if (cantLineas > 10) cantLineas = 10;
        int cantPuntos = 10 - cantLineas;

        String ret = "";
        for (int i = 0; i < cantLineas; i++){
            ret += "|";
        }
        for (int i = 0; i < cantPuntos; i++) {
            ret += ".";
        }

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
    public static String red(String msg) {

        return RED + msg + RESET;
    }
    public static String green(String msg) {

        return GREEN + msg + RESET;
    }
    public static String yellow(String msg) {

        return YELLOW + msg + RESET;
    }
    public static String blue(String msg) {

        return BLUE + msg + RESET;
    }
    public static String magenta(String msg) {

        return MAGENTA + msg + RESET;
    }
    public static String cyan(String msg) {

        return CYAN + msg + RESET;
    }
    public static String white(String msg) {

        return WHITE + msg + RESET;
    }
    public static String black(String msg) {

        return BLACK + msg + RESET;
    }

    // text bg
    public static String bg_black(String msg) {

        return BG_BLACK + msg + RESET;
    }
    public static String bg_red(String msg) {

        return BG_RED + msg + RESET;
    }
    public static String bg_green(String msg) {

        return BG_GREEN + msg + RESET;
    }
    public static String bg_yellow(String msg) {

        return BG_YELLOW + msg + RESET;
    }
    public static String bg_blue(String msg) {

        return BG_BLUE + msg + RESET;
    }
    public static String bg_magenta(String msg) {

        return BG_MAGENTA + msg + RESET;
    }
    public static String bg_cyan(String msg) {

        return BG_CYAN + msg + RESET;
    }
    public static String bg_white(String msg) {

        return BG_WHITE + msg + RESET;
    }

    // text style
    public static String bold(String msg){

        return BOLD + msg + RESET;
    }
    public static String italic(String msg){

        return ITALIC + msg + RESET;
    }
    public static String underline(String msg){

        return UNDERLINE + msg + RESET;
    }
    public static String reversed(String msg){

        return REVERSE + msg + RESET;
    }
    public static String strikethrough(String msg){

        return STRIKETHROUGH + msg + RESET;
    }

}