package Optimizacion;

import java.util.Scanner;

class Alumne {
    private String dni;
    private String nom;
    private String cognom;
    private int edat;

    public Alumne(String dni, String nom, String cognom, int edat) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    @Override
    public String toString() {
        return String.format("Alumne: %s %s [%d] (%d)", nom, cognom, dni, edat);
    }
}

public class DadesAlumne {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Alumne[] alumnes = new Alumne[2];

        for (int i = 0; i < alumnes.length; i++) {
            System.out.println("Alumne " + (i + 1));

            System.out.print("DNI: ");
            String dni = lector.nextLine();

            System.out.print("Nom: ");
            String nom = lector.nextLine();

            System.out.print("Cognom: ");
            String cognom = lector.nextLine();

            System.out.print("Edat: ");
            int edat = Integer.parseInt(lector.nextLine());

            alumnes[i] = new Alumne(dni, nom, cognom, edat);
        }

        System.out.println("\n--- DADES ALUMNES ---");

        for (Alumne a : alumnes) {
            System.out.println(a);
        }

        lector.close();
    }
}
