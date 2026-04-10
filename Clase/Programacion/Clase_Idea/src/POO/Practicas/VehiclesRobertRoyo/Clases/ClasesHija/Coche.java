package POO.Practicas.VehiclesRobertRoyo.Clases.ClasesHija;

import POO.Practicas.VehiclesRobertRoyo.Clases.ClasesPadre.VehiculosAMotor;

public class Coche extends VehiculosAMotor {

    private final int numeroPuertas;

    public Coche(String marca, String modelo, String color, String matricula, int numeroPuertas) {
        super(marca, modelo, color, matricula);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        return String.format("%s de %d puerta", super.toString(), numeroPuertas) + (numeroPuertas > 1 ? "s" : "");
    }
}
