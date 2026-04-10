package POO.Practicas.VehiclesRobertRoyo.Clases;

public class VehiculosAMotor extends Vehiculo{

    protected String matricula;

    public VehiculosAMotor(String marca, String modelo, String color, String matricula) {
        super(marca, modelo, color);
        this.matricula = matricula;
    }
}
