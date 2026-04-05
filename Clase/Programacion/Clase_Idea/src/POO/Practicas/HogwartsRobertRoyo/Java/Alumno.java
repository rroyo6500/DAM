package POO.Practicas.HogwartsRobertRoyo.Java;

public class Alumno {

    private String nombre;
    private String apellidos;
    private int edad;
    private String varitaMagica;
    private String tipoPatronus;

    public Alumno(String nombre, String apellidos, int edad, String varitaMagica, String tipoPatronus) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.varitaMagica = varitaMagica;
        this.tipoPatronus = tipoPatronus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getVaritaMagica() {
        return varitaMagica;
    }

    public void setVaritaMagica(String varitaMagica) {
        this.varitaMagica = varitaMagica;
    }

    public String getTipoPatronus() {
        return tipoPatronus;
    }

    public void setTipoPatronus(String tipoPatronus) {
        this.tipoPatronus = tipoPatronus;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
}
