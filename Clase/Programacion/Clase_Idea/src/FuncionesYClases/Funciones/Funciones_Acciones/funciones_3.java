package FuncionesYClases.Funciones.Funciones_Acciones;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class funciones_3 {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    private static final Scanner IN = new Scanner(System.in);

    private static final double PI = 3.1416;

    public static void main(String[] args) {

        System.out.print("Introduce una figura (1-Circulo | 2-Triangle | 3-Quadrat): ");
        int opcion = IN.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.print("Introuce el radio del circulo: ");
                double radio = IN.nextDouble();

                circulo(radio);
            }
            case 2 -> {
                System.out.print("Introduce la base del triangulo: ");
                double base = IN.nextDouble();

                System.out.print("Introduce la altura del triangulo: ");
                double altura = IN.nextDouble();

                triangulo(base, altura);
            }
            case 3 -> {
                System.out.print("Introduce el lado del cuadrado: ");
                double lado = IN.nextDouble();

                cuadrado(lado);
            }
        }

    }

    public static void circulo(double num) {
        System.out.println("Radio: " + String.format("%.2f", PI * Math.pow(num, 2)));
    }

    public static void triangulo(double base, double altura) {
        System.out.println("Area: " + String.format("%.2f", (base*altura) / 2));
    }

    public static void cuadrado(double lado) {
        System.out.println("Area: " + String.format("%.2f", (lado * lado)));
    }

}
