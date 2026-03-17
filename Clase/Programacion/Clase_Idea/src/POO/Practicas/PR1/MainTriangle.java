package POO.Practicas.PR1;

import Utils.Auxiliar;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class MainTriangle {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    public static Triangle[] triangle = new Triangle[3];

    public static void main(String[] args) {

        for (int i = 0; i < triangle.length; i++) {
            double base, altura;

            base = Auxiliar.inputDouble("Introduce la base del triangulo nº" + (i+1));
            altura = Auxiliar.inputDouble("Introduce la altura del triangulo nº" + (i+1));

            triangle[i] = new Triangle(base, altura);
            triangle[i].mostrarInfo();

            System.out.println("----------------");
        }

    }

}
