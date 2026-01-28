import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero();
        IA ia = new IA();

        System.out.println("3 EN RAYA - IA MINIMAX");
        tablero.mostrar();

        while (true) {

            // Turno humano
            int fila, col;
            do {
                System.out.print("Fila (0-2): ");
                fila = sc.nextInt();
                System.out.print("Columna (0-2): ");
                col = sc.nextInt();
            } while (!tablero.colocar(fila, col, 'O'));

            tablero.mostrar();

            if (tablero.hayVictoria('O')) {
                System.out.println("¡Has ganado!");
                break;
            }
            if (!tablero.hayMovimientos()) {
                System.out.println("Empate.");
                break;
            }

            // Turno IA
            int[] mov = ia.mejorMovimiento(tablero);
            tablero.colocar(mov[0], mov[1], 'X');

            System.out.println("La IA juega:");
            tablero.mostrar();

            if (tablero.hayVictoria('X')) {
                System.out.println("La IA gana.");
                break;
            }
            if (!tablero.hayMovimientos()) {
                System.out.println("Empate.");
                break;
            }
        }
        sc.close();
    }
}
