package Utils;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Auxiliar {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    private static final Scanner IN = new Scanner(System.in);

    public static String inputString(String msg) {
        System.out.print(msg + ": ");
        String rt = IN.nextLine();
        return rt;
    }

    public static int inputInt(String msg) {
        System.out.print(msg + ": ");
        int rt = IN.nextInt();
        IN.nextLine();
        return rt;
    }

    public static double inputDouble(String msg) {
        System.out.print(msg + ": ");
        double rt = IN.nextDouble();
        IN.nextLine();
        return rt;
    }

    public static char inputChar(String msg) {
        System.out.print(msg + ": ");
        char rt = IN.next().charAt(0);
        IN.nextLine();
        return rt;
    }

}
