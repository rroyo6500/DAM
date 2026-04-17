package POO.Practicas.FlotaRobertIzan;

public abstract class Tripulante {

    protected String nombre;
    protected String apellidos;
    protected String transmisor; // Email
    protected int ciclesOrbitals;

    public Tripulante(String nombre, String apellidos, String transmisor, int ciclesOrbitals) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.transmisor = transmisor;
        this.ciclesOrbitals = ciclesOrbitals;
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

    public String getTransmisor() {
        return transmisor;
    }

    public void setTransmisor(String transmisor) {
        this.transmisor = transmisor;
    }

    public int getCiclesOrbitals() {
        return ciclesOrbitals;
    }

    public void setCiclesOrbitals(int ciclesOrbitals) {
        this.ciclesOrbitals = ciclesOrbitals;
    }

    public abstract void mostrarOficialComplet();

    public abstract void mostrarOficialClassificat();

    @Override
    public String toString() {
        if (transmisor != null) return String.format("%s %s [%s] -> CiclosOrbitales: %d",
                nombre, apellidos, transmisor, ciclesOrbitals);
        else return String.format("%s %s -> CiclosOrbitales: %d", nombre, apellidos, ciclesOrbitals);
    }
}
