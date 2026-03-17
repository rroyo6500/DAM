package POO.Practicas.PR1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    
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

    public static Estudiant[] estudiants = {
            new Estudiant("12345678Z", "Carles", "Rodríguez Pérez", "19/02/2004", "Administració i Finances", 2, 515),
            new Estudiant("87654321A", "Noel", "Espinosa Alonso", "02/05/2005", "Educació infantil", 2, 432),
            new Estudiant("12312312H", "Nerea", "López Ruiz", "21/12/2008", "Sistemes microinformàtics i xarxes", 1, 123)
    };

    public static Cotxe[] cotxes = {
            new Cotxe("Seat", "Leon", "1234DZS", 146000, 2004, 80, "47950877V"),
            new Cotxe("Audi", "A6", "5678FSD", 97432, 2008, 90, "91280461Q"),
            new Cotxe("BMW", "Serie 3", "1357KJD", 30000, 2023, 120, "37428154R")
    };

    public static Animal[] animals = {
            new Animal("Papallona", "Monarca", "Danaus plexippus", "Mèxic", "Herbívor", 5000),
            new Animal("Tauró", "Balena", "Rhincodon typus", "Australia", "Placton ", 10000),
            new Animal("Ratpenat", "Insectivor", "Amorphochilus schnablii", "Estats Units", "Insectivor", 2000000)
    };

    public static void main(String[] args) {

        // Jugadors
        System.out.println("\nJugadors");

        for (Jugadora jugadora : jugadors) {
            System.out.println("----------------");
            infoJugadores(jugadora);
        }
        System.out.println("----------------");
        for (Jugadora jugador : jugadors) {
            jugadoresExcomunitaries(jugador);
        }

        // Estudiants
        System.out.println("\nEstudiants");

        for (Estudiant estudiant : estudiants) {
            infoEstudiant(estudiant);
        }

        // Cotxes
        System.out.println("\nCotxes");

        for (Cotxe cotxe : cotxes) {
            infoCotxe(cotxe);
        }

        // Animals
        System.out.println("\nAnimals");

        animals[0].emigrar("Canadà");
        animals[1].emigrar("Polinesia");
        animals[2].emigrar("Mèxic");

        for (Animal animal : animals) {
            infoAnimal(animal);
        }

    }


    // Jugador

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

    // Estudiant
    public static void infoEstudiant (Estudiant estudiant) {
        if (estudiant == null) return;
        System.out.println("----------------");

        if (estudiant.esMajordEdat())
            System.out.println("La família de " + estudiant.getNom() + " " + estudiant.getCognoms() +
                    " de " + estudiant.consultarGrup() + " no ha de signar cap documentació.");
        else System.out.println("La família de " + estudiant.getNom() + " " + estudiant.getCognoms() +
                " de " + estudiant.consultarGrup() + " ha de signar la documentació");

        System.out.println("Hores restants d'FTP: " + estudiant.horesRestantsFCT());
    }

    public static void infoCotxe(Cotxe cotxe) {
        if (cotxe == null) return;

        System.out.println("----------------");

        if (cotxe.ITV())
            System.out.println("El " + cotxe.getMarca() + " " + cotxe.getModel() + " ha de passar la ITV");
        else System.out.println("El " + cotxe.getMarca() + " " + cotxe.getModel() + " no ha de passar la ITV");
        System.out.println("Li falten " + cotxe.ProximaRevisio() + " km per passar la ITV");
    }

    // Animal
    public static void infoAnimal(Animal animal) {
        if (animal == null) return;

        System.out.println("----------------");

        if (animal.volar())
            System.out.println(animal.getEspecie() + " " + animal.getRaza() + " ha emigrat cap a " + animal.getHabitat() + " volant.");
        else System.out.println(animal.getEspecie() + " " + animal.getRaza() + " ha emigrat cap a " + animal.getHabitat() + " nadant.");

        System.out.println(animal.EstaEnPerill());

    }
    
}
