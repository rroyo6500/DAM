package Ex1.CalculsArea;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    private static final Scanner IN = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultat = 0;

        System.out.println("De quina figura vols calcular l'àrea?");
        System.out.println("1. Triangle");
        System.out.println("2. Quadrat");
        System.out.println("3. Cercle");
        System.out.println("4. Rectangle / Paral·lelogram");
        System.out.println("5. Trapezi");
        System.out.println("6. El·lipse");

        int opcio = sc.nextInt();

        switch (opcio) {
            case 1:
                System.out.print("Introdueix la base: ");
                double baseT = sc.nextDouble();
                System.out.print("Introdueix l'altura: ");
                double alturaT = sc.nextDouble();
                resultat = Area.areaTriangle(baseT, alturaT);
                break;

            case 2:
                System.out.print("Introdueix el costat: ");
                double costat = sc.nextDouble();
                resultat = Area.areaQuadrat(costat);
                break;

            case 3:
                System.out.print("Introdueix el radi: ");
                double radi = sc.nextDouble();
                resultat = Area.areaCercle(radi);
                break;

            case 4:
                System.out.print("Introdueix la base: ");
                double baseR = sc.nextDouble();
                System.out.print("Introdueix l'altura: ");
                double alturaR = sc.nextDouble();
                resultat = Area.areaRectangle(baseR, alturaR);
                break;

            case 5:
                System.out.print("Introdueix el costat petit: ");
                double costatPetit = sc.nextDouble();
                System.out.print("Introdueix el costat gran: ");
                double costatGran = sc.nextDouble();
                System.out.print("Introdueix l'altura: ");
                double alturaTrap = sc.nextDouble();
                resultat = Area.areaTrapezi(costatPetit, costatGran, alturaTrap);
                break;

            case 6:
                System.out.print("Introdueix el diàmetre gran: ");
                double diametreGran = sc.nextDouble();
                System.out.print("Introdueix el diàmetre petit: ");
                double diametrePetit = sc.nextDouble();
                resultat = Area.areaEllipse(diametreGran, diametrePetit);
                break;

            default:
                System.out.println("Opció no vàlida");
                sc.close();
                return;
        }

        System.out.println("L'àrea és: " + resultat);
        sc.close();
    }

}
