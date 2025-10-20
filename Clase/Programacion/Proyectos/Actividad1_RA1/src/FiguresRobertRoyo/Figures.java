package FiguresRobertRoyo;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Figures {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);

    public static final double PI = 3.14159265;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("""
                         \u001b[37mOpcions:
                                1. Quadrat
                                2. Regrangle
                                3. Cercle
                                4. Poligon regular
                                5. Triangle
                         
                         Selecciona una de les opcions anterior:""");
        int opcio = IN.nextInt();
        IN.nextLine();

        double altura;
        double base;
        double resultat;
        String missatge;
        switch (opcio) {
            case 1 -> {
                System.out.print("\nIntrodueix el costat del quadrat: ");
                altura = IN.nextDouble();
                resultat = Math.pow(altura, 2);
                missatge = "\n" + ((altura < 1) 
                        ? "\033[31mERROR: No pots introduir numeros negatius"
                        : "L'area del quadrat es: \033[32m" + String.format("%.2f", resultat));
            }
            case 2 -> {
                System.out.print("Introdueix l'altura del regtangle: ");
                altura = IN.nextDouble();
                System.out.print("Introdueix la base del regtangle: ");
                base = IN.nextDouble();
                resultat = base * altura;
                missatge = "\n" + ((altura < 1 || base < 1) 
                        ? "\033[31mERROR: No pots introduir numeros negatius"
                        : "L'area del regtangle es: \033[32m" + String.format("%.2f", resultat));
            }
            case 3 -> {
                System.out.print("\nIntrodueix el radi del cercle: ");
                double radi = IN.nextDouble();
                resultat = PI * Math.pow(radi, 2);
                missatge = "\n" + ((radi < 1) 
                        ? "\033[31mERROR: No pots introduir numeros negatius"
                        : "L'area del regtangle es: \033[32m" + String.format("%.2f", resultat));
            }
            case 4 -> {
                System.out.print("Introdueix el numero de costats del poligon: ");
                int numeroCostats = IN.nextInt();
                System.out.print("Introdueix el perimetre del poligon: ");
                double perimetre = IN.nextDouble();
                System.out.print("Introdueix l'apotema del poligon: ");
                double apotema = IN.nextDouble();
                resultat = ((double) numeroCostats * perimetre * apotema) / 2;
                missatge = "\n" + ((numeroCostats < 1 || perimetre < 1 || apotema < 1) 
                        ? "\033[31mERROR: No pots introduir numeros negatius"
                        : "L'area del poligon regular es: \033[32m" + String.format("%.2f", resultat));
            }
            case 5 -> {
                System.out.print("\nIntrodueix l'altura del triangle: ");
                altura = IN.nextInt();
                System.out.print("Introdueix la base del triangle: ");
                base = IN.nextInt();
                resultat = (base * altura) / 2;
                missatge = "\n" + ((altura < 1 || base < 1) 
                        ? "\033[31mERROR: No pots introduir numeros negatius"
                        : "L'area del triangle es: \033[32m" + String.format("%.2f", resultat));
            }
            default ->
                missatge = "\033[31mERROR: Opcion no valida";
        }

        System.out.println(missatge);

        if (opcio == 5) {
            System.out.println("\n\033[37mAra introdueix les longituds dels 3 costats del triangle:");
            System.out.print("        - ");
            double c1 = IN.nextDouble();
            System.out.print("        - ");
            double c2 = IN.nextDouble();
            System.out.print("        - ");
            double c3 = IN.nextDouble();

            boolean posible = c1 < c2 + c3 && c2 < c1 + c3 && c3 < c1 + c2;
            if (posible) {
                System.out.println("El triangle es posible");
                if (c1 == c2 && c2 == c3) {
                    System.out.println("\033[37mEl triangle es \033[32mEquilater");
                } else if ((c1 == c2) || (c1 == c3) || (c2 == c3)) {
                    System.out.println("\033[37mEl triangle es \033[32mIsosceles");
                } else if (c1 != c2 && c2 != c3 && c3 != c1) {
                    System.out.println("\033[37mEl triangle es \033[32mEscale");
                }
            } else {
                System.err.println("\033[37mEl triangle no es posible");
            }
        }
    }
}
