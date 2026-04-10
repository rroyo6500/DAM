package POO.Practicas.VehiclesRobertRoyo.Clases.ClasesHija;

import POO.Practicas.VehiclesRobertRoyo.Clases.ClasesPadre.Vehiculo;

public class Bicicleta extends Vehiculo {

    public enum TipoBicicleta {
        CARRETERA, MONTANA
    }

    private final boolean plegable;
    private final TipoBicicleta tipo;

    public Bicicleta(String marca, String modelo, String color, boolean plegable, TipoBicicleta tipo) {
        super(marca, modelo, color);
        this.plegable = plegable;
        this.tipo = tipo;
    }

    public boolean isPlegable() {
        return plegable;
    }

    public TipoBicicleta getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return String.format("%s %s i de %s", super.toString(), (plegable ? "es plegable" : "no es plegable"), tipo);
    }
}
