package Optimizacion;

public class FacturaPapereria {

    public static void main(String[] args) {
        System.out.println("""
                *********************
                *******FACTURA*******
                *********************
                """);

        Producte producte = new Producte("Boli", 2.45);

        System.out.println(producte);

        producte = new Producte("Llapis", 1.27);

        System.out.println(producte);

        producte = new Producte("Llibreta", 4.12);

        System.out.println(producte);

    }

}

class Producte {

    private final String nom;
    private double preuSenseIVA;
    private double IVA = 0.21;
    private double preuFinal;

    public Producte(String nom, double preuSenseIVA) {
        this.nom = nom;
        setPreuSenseIVA(preuSenseIVA);
    }

    public double getPreuSenseIVA() {
        return preuSenseIVA;
    }

    public void setPreuSenseIVA(double preuSenseIVA) {
        this.preuSenseIVA = preuSenseIVA;
        this.preuFinal = preuSenseIVA + (preuSenseIVA * IVA);
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getPreuFinal() {
        return preuFinal;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Producte: '" + nom + "' Valor: " + preuFinal;
    }
}

