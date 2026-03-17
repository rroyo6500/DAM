package POO.Practicas.PR1;

public class Triangle {

    private double base, altura;
    private double area;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    private void calcularArea() {
        area = (base * altura) / 2;
    }

    public void mostrarInfo() {
        System.out.println("L’àrea del triangle de base: " + base + " i altura: " + altura + " es " + area);
    }

    public double getArea() {
        return area;
    }

    public void setBase(double base) {
        this.base = base;
        calcularArea();
    }

    public void setAltura(double altura) {
        this.altura = altura;
        calcularArea();
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "(" + base + " x " + altura + ") / 2 = " + area;
    }
}
