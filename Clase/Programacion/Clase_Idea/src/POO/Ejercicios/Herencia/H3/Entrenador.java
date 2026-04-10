package POO.Ejercicios.Herencia.H3;

public class Entrenador extends Persona{

    private final int codigoLicencia;

    public Entrenador(int idPersona, String nombre, String apellidos, int edad, int codigoLicencia) {
        super(idPersona, nombre, apellidos, edad);
        this.codigoLicencia = codigoLicencia;
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador ha planificado un entrenamiento");
    }

    public int getCodigoLicencia() {
        return codigoLicencia;
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador " + this.nombre + " ha viajado");
    }

    @Override
    public void partido() {
        System.out.println("El entrenador " + this.nombre + " ha asistido a un partido");
    }

    @Override
    public String toString() {
        return "Entrenador{" + super.toString() +
                ", codigoLicencia=" + codigoLicencia +
                '}';
    }
}
