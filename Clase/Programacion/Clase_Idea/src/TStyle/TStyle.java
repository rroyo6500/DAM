package TStyle;

import java.io.File;
import java.nio.file.FileSystems;
import java.util.List;

public interface TStyle {
    // RESET
    String RESET = "\u001B[0m";
    // TEXT COLORS (foreground)
    String __BLACK = "\u001B[30m";
    String __RED = "\u001B[31m";
    String __GREEN = "\u001B[32m";
    String __YELLOW = "\u001B[33m";
    String __BLUE = "\u001B[34m";
    String __MAGENTA = "\u001B[35m";
    String __CYAN = "\u001B[36m";
    String __WHITE = "\u001B[37m";
    // BACKGROUND COLORS
    String __BG_BLACK = "\u001B[40m";
    String __BG_RED = "\u001B[41m";
    String __BG_GREEN = "\u001B[42m";
    String __BG_YELLOW = "\u001B[43m";
    String __BG_BLUE = "\u001B[44m";
    String __BG_MAGENTA = "\u001B[45m";
    String __BG_CYAN = "\u001B[46m";
    String __BG_WHITE = "\u001B[47m";
    // TEXT STYLES
    String __BOLD = "\u001B[1m";
    String __ITALIC = "\u001B[3m";
    String __UNDERLINE = "\u001B[4m";
    String __REVERSE = "\u001B[7m";
    String __STRIKETHROUGH = "\u001B[9m";

    // text colors
    public static String red(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __RED);

        return __RED + msg + RESET;
    }
    public static String green(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __GREEN);

        return __GREEN + msg + RESET;
    }
    public static String yellow(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __YELLOW);

        return __YELLOW + msg + RESET;
    }
    public static String blue(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __BLUE);

        return __BLUE + msg + RESET;
    }
    public static String magenta(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __MAGENTA);

        return __MAGENTA + msg + RESET;
    }
    public static String cyan(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __CYAN);

        return __CYAN + msg + RESET;
    }
    public static String white(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __WHITE);

        return __WHITE + msg + RESET;
    }
    public static String black(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __BLACK);

        return __BLACK + msg + RESET;
    }

    // text bg
    public static String bg_black(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __BG_BLACK);

        return __BG_BLACK + msg + RESET;
    }
    public static String bg_red(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __BG_RED);

        return __BG_RED + msg + RESET;
    }
    public static String bg_green(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __BG_GREEN);

        return __BG_GREEN + msg + RESET;
    }
    public static String bg_yellow(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __BG_YELLOW);

        return __BG_YELLOW + msg + RESET;
    }
    public static String bg_blue(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __BG_BLUE);

        return __BG_BLUE + msg + RESET;
    }
    public static String bg_magenta(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __BG_MAGENTA);

        return __BG_MAGENTA + msg + RESET;
    }
    public static String bg_cyan(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __BG_CYAN);

        return __BG_CYAN + msg + RESET;
    }
    public static String bg_white(Object msg) {
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __BG_WHITE);

        return __BG_WHITE + msg + RESET;
    }

    // text style
    public static String bold(Object msg){
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __BOLD);

        return __BOLD + msg + RESET;
    }
    public static String italic(Object msg){
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __ITALIC);

        return __ITALIC + msg + RESET;
    }
    public static String underline(Object msg){
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __UNDERLINE);

        return __UNDERLINE + msg + RESET;
    }
    public static String reversed(Object msg){
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __REVERSE);

        return __REVERSE + msg + RESET;
    }
    public static String strikethrough(Object msg){
        if (msg.toString().contains(RESET))
            msg = msg.toString().replace(RESET, RESET + __STRIKETHROUGH);

        return __STRIKETHROUGH + msg + RESET;
    }

}

