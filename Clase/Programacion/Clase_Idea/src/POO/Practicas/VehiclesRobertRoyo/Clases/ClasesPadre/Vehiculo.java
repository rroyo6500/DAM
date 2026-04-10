package POO.Practicas.VehiclesRobertRoyo.Clases.ClasesPadre;

public class Vehiculo {

    protected final String marca;
    protected final String modelo;
    protected String color;
    protected int velocidad = 0;

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d km/h", marca, modelo, color, velocidad);
    }
}
