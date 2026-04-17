package POO.Practicas.FlotaRobertIzan;

import java.util.ArrayList;
import java.util.Collections;

public class FlotaMain {

    public static void main(String[] args) {

        ArrayList<Oficial> llistaOficials = new ArrayList<>();

        llistaOficials.add(new Oficial("Tiberius", "Drax", "t.drax@flota.gal", 20, 1001, "Comandament", 55000.0));
        llistaOficials.add(new Oficial("Elara", "Zane", "e.zane@flota.gal", 16, 1002, "Enginyeria", 42000.0));

        llistaOficials.add(new Oficial("Jace", "Corin", "j.corin@flota.gal", 12, 1003, "Navegació", 38000.0));
        llistaOficials.add(new Oficial("Kaelen", "Voss", "k.voss@flota.gal", 10, 1004, "Navegació", 35000.0));

        llistaOficials.add(new Oficial("Rael", "Vex", "r.vex@flota.gal", 18, 1005, "Ciència", 41000.0));
        llistaOficials.add(new Oficial("Kira", "Rey", "k.rey@flota.gal", 11, 1006, "Seguretat", 33000.0));

        llistaOficials.add(new Oficial("Lyra", "Nova", "l.nova@flota.gal", 5, 1007, "Ciència", 31000.0));
        llistaOficials.add(new Oficial("Sylas", "Tarn", "s.tarn@flota.gal", 8, 1008, "Enginyeria", 29000.0));
        llistaOficials.add(new Oficial("Anya", "Sol", "a.sol@flota.gal", 7, 1009, "Medicina", 45000.0));
        llistaOficials.add(new Oficial("Jax", "Orion", "j.orion@flota.gal", 2, 1010, "Comandament", 30000.0));

        llistaOficials.add(new Oficial("Xan", "Kryze", 19, 9901, 60000.0));
        llistaOficials.add(new Oficial("Cara", "Dune", 15, 9902, 45000.0));
        llistaOficials.add(new Oficial("Vorin", "Thal", 12, 9903, 40000.0));
        llistaOficials.add(new Oficial("Din", "Djarin", 10, 9904, 37000.0));

        llistaOficials.add(new Oficial("Boba", "Fett", 5, 9905, 52000.0));
        llistaOficials.add(new Oficial("Gideon", "Hask", 3, 9906, 31000.0));

        Collections.shuffle(llistaOficials);

    }

}
