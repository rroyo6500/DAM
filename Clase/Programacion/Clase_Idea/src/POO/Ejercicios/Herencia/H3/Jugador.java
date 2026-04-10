package POO.Ejercicios.Herencia.H3;

public class Jugador extends Persona{

    private int dorsal;
    private String posicion;

    public Jugador(int idPersona, String nombre, String apellidos, int edad, int dorsal, String posicion) {
        super(idPersona, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public void viajar() {
        System.out.println("El jugador " + this.getNombre() + " ha viajado");
    }

    @Override
    public void partido() {
        System.out.println("El jugador " + this.getNombre() + " ha jugado en un partido");
    }

    @Override
    public String toString() {
        return "Jugador{" + super.toString() +
                ", dorsal=" + dorsal +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
