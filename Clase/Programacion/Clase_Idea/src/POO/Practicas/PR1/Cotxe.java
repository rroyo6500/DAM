/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Practicas.PR1;

import java.util.Calendar;

/**
 *
 * @author Laura
 */
public class Cotxe {

    private String marca;
    private String model;
    private String matricula;
    private int quilometratge;
    private int anyMatriculacio;
    private int cavalls;
    private String dniPropietari;

    public Cotxe(String marca, String model, String matricula, int quilometratge, int anyMatriculacio, int cavalls, String dniPropietari) {
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
        this.quilometratge = quilometratge;
        this.anyMatriculacio = anyMatriculacio;
        this.cavalls = cavalls;
        this.dniPropietari = dniPropietari;
    }

    public boolean ITV() {
        Calendar cal = Calendar.getInstance();
        int edatCotxe = cal.get(Calendar.YEAR) - this.anyMatriculacio;
        return edatCotxe >= 4;
    }

    public double ProximaRevisio() {
        if (this.quilometratge < 40000) {
            return 40000 - this.quilometratge;
        } else {
            return this.quilometratge % 40000;
        }
    }

    public void vendreCotxe(String dniNuevoPropietario) {
        this.dniPropietari = dniNuevoPropietario;
        System.out.println("El " + this.marca + " " + this.model + " amb matricula " + this.matricula + " s'ha venut a " + dniNuevoPropietario);
    }

    @Override
    public String toString() {
        return "Cotxe{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", matricula='" + matricula + '\'' +
                ", quilometratge=" + quilometratge +
                ", anyMatriculacio=" + anyMatriculacio +
                ", cavalls=" + cavalls +
                ", dniPropietari='" + dniPropietari + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getQuilometratge() {
        return quilometratge;
    }

    public void setQuilometratge(int quilometratge) {
        this.quilometratge = quilometratge;
    }

    public int getAnyMatriculacio() {
        return anyMatriculacio;
    }

    public void setAnyMatriculacio(int anyMatriculacio) {
        this.anyMatriculacio = anyMatriculacio;
    }

    public int getCavalls() {
        return cavalls;
    }

    public void setCavalls(int cavalls) {
        this.cavalls = cavalls;
    }

    public String getDniPropietari() {
        return dniPropietari;
    }

    public void setDniPropietari(String dniPropietari) {
        this.dniPropietari = dniPropietari;
    }
}
