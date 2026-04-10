package POO.Practicas.VehiclesRobertRoyo;

import POO.Practicas.VehiclesRobertRoyo.Clases.ClasesHija.Bicicleta;
import POO.Practicas.VehiclesRobertRoyo.Clases.ClasesHija.Camion;
import POO.Practicas.VehiclesRobertRoyo.Clases.ClasesHija.Coche;
import POO.Practicas.VehiclesRobertRoyo.Clases.ClasesHija.Moto;
import POO.Practicas.VehiclesRobertRoyo.Clases.ClasesPadre.Vehiculo;
import POO.Practicas.VehiclesRobertRoyo.Clases.Remolque;
import POO.Practicas.VehiclesRobertRoyo.Utilidades.Auxiliar;
import POO.Practicas.VehiclesRobertRoyo.Utilidades.TStyle;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    private static final List<Vehiculo> vehiculos = new ArrayList<>(
            List.of(
                    // Camiones (Marca, Modelo, Color, Matrícula)
                    new Camion("Volvo", "FH16", "Blanco", "1234-ABC"),
                    new Camion("Scania", "R500", "Azul", "5678-DEF"),
                    new Camion("Mercedes-Benz", "Actros", "Rojo", "9012-GHI"),
                    new Camion("MAN", "TGX", "Gris", "3456-JKL"),

                    // Coches (Marca, Modelo, Color, Matrícula, NumeroPuertas)
                    new Coche("Toyota", "Corolla", "Negro", "1111-MMM", 5),
                    new Coche("Tesla", "Model 3", "Blanco", "2222-NNN", 4),
                    new Coche("Volkswagen", "Golf", "Rojo", "3333-PPP", 5),
                    new Coche("Hyundai", "i30", "Gris", "4444-QQQ", 5),

                    // Motos (Marca, Modelo, Color, Matrícula, Cilindros)
                    new Moto("Honda", "CBR600RR", "Rojo", "5555-RRR", 600),
                    new Moto("Yamaha", "MT-07", "Azul", "6666-SSS", 689),

                    // Bicicletas (Marca, Modelo, Color, Plegable, TipoBicicleta)
                    new Bicicleta("Specialized", "Tarmac SL7", "Negro", true, Bicicleta.TipoBicicleta.CARRETERA),
                    new Bicicleta("Trek", "Marlin 7", "Verde", false, Bicicleta.TipoBicicleta.MONTANA)
            )
    );

    public static void main(String[] args) {
        Collections.shuffle(vehiculos);

        // Camiones

        System.out.println("Marcas de camiones:");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion c)
                System.out.println("\t- " + TStyle.cyan(c.getMarca()));
        }

        String marcaSeleccionada = Auxiliar.inputString("Introduce la marca del camion a la que quieres añadir un remolque");
        double peso = Auxiliar.inputDouble("Introduce el peso que tendra el remolque");

        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion c) {
                if (c.getMarca().equalsIgnoreCase(marcaSeleccionada)) {
                    c.ponerRemolque(new Remolque(peso));
                    System.out.println("Se ha añadido un remolque");
                }
                c.setVelocidad(70);
            }
        }

        // Coches & Motos

        System.out.println();
        System.out.println("Modelos de coches:");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche c)
                System.out.println("\t- " + TStyle.cyan(c.getModelo()));
        }
        System.out.println("Modelos de motos:");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Moto m)
                System.out.println("\t- " + TStyle.cyan(m.getModelo()));
        }

        String modeloCocheSeleccionado = Auxiliar
                .inputString("Introduce uno de los modelos de coche");
        String modeloMotoSeleccionado = Auxiliar
                .inputString("Introduce uno de los modelos de moto");

        for (Vehiculo v : vehiculos) {
            if (v.getModelo().equalsIgnoreCase(modeloCocheSeleccionado) || v.getModelo().equalsIgnoreCase(modeloMotoSeleccionado))
                v.setVelocidad(80);
            else {
                if (v instanceof Coche c)
                    c.setVelocidad(100);
                else if (v instanceof Moto m)
                    m.setVelocidad(60);
            }
        }

        // Bicicletas

        for (Vehiculo v : vehiculos) {
            if (v instanceof Bicicleta b) {
                if (b.isPlegable()) b.setVelocidad(25);
                else b.setVelocidad(35);
            }
        }

        // ----------------

        Collections.sort(vehiculos, new Comparator() {
            @Override
            public int compare(Object v1, Object v2) {
                return((((Vehiculo)v1).getMarca().toLowerCase()).compareTo(((Vehiculo)v2).
                        getMarca().toLowerCase()));
            }
        });

        System.out.println();
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }

        System.out.println();
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion camion)
                if (camion.getRemolque() != null) {
                    camion.quitarRemolque();
                    System.out.println("Se ha quitado un remolque");
                }
        }
        System.out.println();

        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion c)
                System.out.println(c);
        }

    }

}
