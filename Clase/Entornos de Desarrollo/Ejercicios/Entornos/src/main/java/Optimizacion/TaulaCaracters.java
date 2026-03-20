package Optimizacion;

import java.util.Random;

public class TaulaCaracters {

    private static final int FILES = 5;
    private static final int COLUMNES = 5;

    public static void main(String[] args) {

        char[][] taula = new char[FILES][COLUMNES];
        Random random = new Random();

        omplirTaula(taula, random);
        mostrarTaula(taula, "Taula en majúscules");

        convertirMinuscules(taula);
        mostrarTaula(taula, "Taula en minúscules");
    }

    private static void omplirTaula(char[][] taula, Random random) {
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taula[i][j] = (char) (random.nextInt(26) + 65);
            }
        }
    }

    private static void convertirMinuscules(char[][] taula) {
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taula[i][j] = Character.toLowerCase(taula[i][j]);
            }
        }
    }

    private static void mostrarTaula(char[][] taula, String missatge) {
        System.out.println(missatge);

        for (char[] fila : taula) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
