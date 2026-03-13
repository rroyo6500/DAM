package POO.Practicas.PR1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class MainJugadors {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    public static Jugadora[] jugadors = {
            new Jugadora("Aitana Bonmatí", "FC Barcelona", "Migcampista", 4, 22, 26, false),
            new Jugadora("Cata Coll", "FC Barcelona", "Portera", 2, 0, 26, false),
            new Jugadora("Gio Garbellini", "Atlético de Madrid", "Davantera", 3, 26, 22, true),
            new Jugadora("Linda Caicedo", "Real Madrid", "Davantera", 8, 34, 23, true)
    };

    public static void main(String[] args) {

        for (int i = 0; i < jugadors.length; i++) {
            System.out.println("----------------");
            infoJugadores(jugadors[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < jugadors.length; i++) {
            jugadoresExcomunitaries(jugadors[i]);
        }

    }

    public static void infoJugadores(Jugadora jugadora) {

        if (jugadora.esPortera())
            System.out.printf("La jugadora %s és portera \n", jugadora.getNom());
        else
            System.out.printf("La jugadora %s porta una mitjana de %.2f gols per partit \n",
                    jugadora.getNom(), jugadora.mitjanaGols());

        System.out.printf("%s porta una mitjana de %.2f tarjetes per partit \n",
                jugadora.getNom(), jugadora.mitjanaTargetes());

    }

    public static void jugadoresExcomunitaries(Jugadora jugadora) {
        if (!jugadora.isExtraComunitari()) return;

        System.out.println("Jugadores extracomunitaries: " + jugadora.getNom());

    }

}
