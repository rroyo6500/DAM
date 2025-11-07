package ExamenRobertRoyo;

/**
 *
 * @author r.royo
 */
public class TStyle {

    // RESET
    public static final String RESET = "\u001B[0m";

    // TEXT COLORS (foreground)
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String DEFAULT = "\u001B[39m";

    // BACKGROUND COLORS
    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_MAGENTA = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";
    public static final String BG_DEFAULT = "\u001B[49m";

    // TEXT STYLES
    public static final String BOLD = "\u001B[1m";
    public static final String DIM = "\u001B[2m";
    public static final String ITALIC = "\u001B[3m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String BLINK = "\u001B[5m";
    public static final String REVERSE = "\u001B[7m";
    public static final String HIDDEN = "\u001B[8m";
    public static final String STRIKETHROUGH = "\u001B[9m";

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
    
    // text style
    public static String bold(Object msg){
        return BOLD + msg + RESET;
    }
    public static String underline(Object msg){
        return UNDERLINE + msg + RESET;
    }

}
