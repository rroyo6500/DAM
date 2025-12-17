package ActividadFunciones;

public class ActividadFunciones_Robert {

    public static void main(String[] args) {

        

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
        return RED + msg + RESET;
    }
    public static String green(Object msg) {
        return GREEN + msg + RESET;
    }
    public static String yellow(Object msg) {
        return YELLOW + msg + RESET;
    }
    public static String blue(Object msg) {
        return BLUE + msg + RESET;
    }
    public static String magenta(Object msg) {
        return MAGENTA + msg + RESET;
    }
    public static String cyan(Object msg) {
        return CYAN + msg + RESET;
    }
    public static String white(Object msg) {
        return WHITE + msg + RESET;
    }
    public static String black(Object msg) {
        return BLACK + msg + RESET;
    }

    // text bg
    public static String bg_black(Object msg) {
        return BG_BLACK + msg + RESET;
    }
    public static String bg_red(Object msg) {
        return BG_RED + msg + RESET;
    }
    public static String bg_green(Object msg) {
        return BG_GREEN + msg + RESET;
    }
    public static String bg_yellow(Object msg) {
        return BG_YELLOW + msg + RESET;
    }
    public static String bg_blue(Object msg) {
        return BG_BLUE + msg + RESET;
    }
    public static String bg_magenta(Object msg) {
        return BG_MAGENTA + msg + RESET;
    }
    public static String bg_cyan(Object msg) {
        return BG_CYAN + msg + RESET;
    }
    public static String bg_white(Object msg) {
        return BG_WHITE + msg + RESET;
    }

    // text style
    public static String bold(Object msg){
        return BOLD + msg + RESET;
    }
    public static String italic(Object msg){
        return ITALIC + msg + RESET;
    }
    public static String underline(Object msg){
        return UNDERLINE + msg + RESET;
    }
    public static String reversed(Object msg){
        return REVERSE + msg + RESET;
    }
    public static String strikethrough(Object msg){
        return STRIKETHROUGH + msg + RESET;
    }

}