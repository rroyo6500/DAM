package POO.Practicas.VehiclesRobertRoyo.Clases.ClasesPadre;

public class VehiculosAMotor extends Vehiculo {

    protected String matricula;

    public VehiculosAMotor(String marca, String modelo, String color, String matricula) {
        super(marca, modelo, color);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]", super.toString(), matricula);
    }
}
