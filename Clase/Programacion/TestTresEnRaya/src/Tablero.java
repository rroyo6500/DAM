public class Tablero {

    private char[][] celdas;

    public Tablero() {
        celdas = new char[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                celdas[i][j] = ' ';
    }

    public boolean colocar(int fila, int col, char jugador) {
        if (celdas[fila][col] == ' ') {
            celdas[fila][col] = jugador;
            return true;
        }
        return false;
    }

    public void quitar(int fila, int col) {
        celdas[fila][col] = ' ';
    }

    public boolean hayMovimientos() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (celdas[i][j] == ' ')
                    return true;
        return false;
    }

    public boolean hayVictoria(char jugador) {
        for (int i = 0; i < 3; i++)
            if (celdas[i][0] == jugador &&
                    celdas[i][1] == jugador &&
                    celdas[i][2] == jugador)
                return true;

        for (int j = 0; j < 3; j++)
            if (celdas[0][j] == jugador &&
                    celdas[1][j] == jugador &&
                    celdas[2][j] == jugador)
                return true;

        return (celdas[0][0] == jugador &&
                celdas[1][1] == jugador &&
                celdas[2][2] == jugador) ||
                (celdas[0][2] == jugador &&
                        celdas[1][1] == jugador &&
                        celdas[2][0] == jugador);
    }

    public char[][] getCeldas() {
        return celdas;
    }

    public void mostrar() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + celdas[i][0] + " | " + celdas[i][1] + " | " + celdas[i][2]);
            if (i < 2) System.out.println("---+---+---");
        }
        System.out.println();
    }
}
