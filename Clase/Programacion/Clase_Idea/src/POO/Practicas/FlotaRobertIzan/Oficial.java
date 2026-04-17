package POO.Practicas.FlotaRobertIzan;

public class Oficial extends Tripulante{

    private int ID;
    private String division;
    private double creditosGalacticos;

    public Oficial(String nombre, String apellidos, String transmisor, int ciclesOrbitals, int ID, String division, double creditosGalacticos) {
        super(nombre, apellidos, transmisor, ciclesOrbitals);
        this.ID = ID;
        this.division = division;
        this.creditosGalacticos = creditosGalacticos;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public double getCreditosGalacticos() {
        return creditosGalacticos;
    }

    public void setCreditosGalacticos(double creditosGalacticos) {
        this.creditosGalacticos = creditosGalacticos;
    }

    @Override
    public void mostrarOficialComplet() {
        System.out.println(String.format("%s.\n\t%d / %s / Creditos: %.2f ¢",
                super.toString(), ID, division, creditosGalacticos));
    }

    @Override
    public void mostrarOficialClassificat() {

    }

}
