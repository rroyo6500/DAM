package POO.Ejercicios.Herencia.H3_H5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainH3 {

    public static void main(String[] args) {

        Persona rivers = new Entrenador(1, "Doc", "Rivers", 64, 28489);
        Persona cole = new Jugador(2, "Cole", "Anthony", 25, 50, "Base");
        Persona myles = new Jugador(3, "Myles", "Turner", 25, 33, "Pivot");

        List<Persona> equipo = new ArrayList<>(List.of(rivers, cole, myles));
        Collections.shuffle(equipo);

        for (Persona persona : equipo) {
            if (persona instanceof Entrenador entrenador) {
                entrenador.planificarEntrenamiento();
            }
        }

        for (Persona persona : equipo) {
            System.out.println(persona);
            persona.viajar();
            persona.partido();
            System.out.println("----------------");
        }

    }

}
