package POO.Practicas.VehiclesRobertRoyo.Clases.ClasesHija;

import POO.Practicas.VehiclesRobertRoyo.Clases.ClasesPadre.VehiculosAMotor;

public class Moto extends VehiculosAMotor {

    private int cilindrada;

    public Moto(String marca, String modelo, String color, String matricula, int cilindrada) {
        super(marca, modelo, color, matricula);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return String.format("%s %d cc", super.toString(), cilindrada);
    }
}
