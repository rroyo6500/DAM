public class IA {

    private static final char IA = 'X';
    private static final char HUMANO = 'O';

    public int[] mejorMovimiento(Tablero tablero) {
        int mejorValor = Integer.MIN_VALUE;
        int[] movimiento = new int[2];

        char[][] t = tablero.getCeldas();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j] == ' ') {
                    t[i][j] = IA;
                    int valor = minimax(tablero, 0, false,
                            Integer.MIN_VALUE, Integer.MAX_VALUE);
                    t[i][j] = ' ';

                    if (valor > mejorValor) {
                        mejorValor = valor;
                        movimiento[0] = i;
                        movimiento[1] = j;
                    }
                }
            }
        }
        return movimiento;
    }

    private int minimax(Tablero tablero, int profundidad,
                        boolean esMax, int alpha, int beta) {

        if (tablero.hayVictoria(IA))
            return 10 - profundidad;
        if (tablero.hayVictoria(HUMANO))
            return profundidad - 10;
        if (!tablero.hayMovimientos())
            return 0;

        char[][] t = tablero.getCeldas();

        if (esMax) {
            int mejor = Integer.MIN_VALUE;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (t[i][j] == ' ') {
                        t[i][j] = IA;
                        mejor = Math.max(mejor,
                                minimax(tablero, profundidad + 1,
                                        false, alpha, beta));
                        t[i][j] = ' ';

                        alpha = Math.max(alpha, mejor);
                        if (beta <= alpha)
                            return mejor;
                    }
                }
            }
            return mejor;
        } else {
            int mejor = Integer.MAX_VALUE;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (t[i][j] == ' ') {
                        t[i][j] = HUMANO;
                        mejor = Math.min(mejor,
                                minimax(tablero, profundidad + 1,
                                        true, alpha, beta));
                        t[i][j] = ' ';

                        beta = Math.min(beta, mejor);
                        if (beta <= alpha)
                            return mejor;
                    }
                }
            }
            return mejor;
        }
    }
}
