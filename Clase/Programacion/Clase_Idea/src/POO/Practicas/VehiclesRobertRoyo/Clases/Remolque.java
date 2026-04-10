package POO.Practicas.VehiclesRobertRoyo.Clases;

public class Remolque {

    private double peso;

    public Remolque(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Remolque{" +
                "peso=" + peso +
                '}';
    }
}
