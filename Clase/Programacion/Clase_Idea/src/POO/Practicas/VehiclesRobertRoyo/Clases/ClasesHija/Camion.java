package POO.Practicas.VehiclesRobertRoyo.Clases.ClasesHija;

import POO.Practicas.VehiclesRobertRoyo.Clases.ClasesPadre.VehiculosAMotor;
import POO.Practicas.VehiclesRobertRoyo.Clases.Remolque;

public class Camion extends VehiculosAMotor {

    private Remolque remolque;

    public Camion(String marca, String modelo, String color, String matricula) {
        super(marca, modelo, color, matricula);
    }

    public void ponerRemolque(Remolque remolque) {
        setRemolque(remolque);
    }

    public void quitarRemolque() {
        this.remolque = null;
    }

    public Remolque getRemolque() {
        return remolque;
    }

    public void setRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    @Override
    public String toString() {
        if (remolque != null)
            return String.format("%s remolque de %.2f kg", super.toString(), remolque.getPeso());
        return super.toString();
    }
}
