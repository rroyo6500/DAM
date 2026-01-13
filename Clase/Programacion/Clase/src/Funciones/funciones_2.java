package Funciones;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class funciones_2 {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    private static final Scanner IN = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un numero: ");
        int num = IN.nextInt();

        System.out.println(esParell(num));

    }

    public static String esParell(int num) {
        return num % 2 == 0 ? "Es parell" : "Es imparell";
    }

}
