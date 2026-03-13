/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Practicas.PR1;

/**
 *
 * @author Laura
 */
public class Jugadora {

    private String nom;
    private String equip;
    private String posicio;
    private int targetes;
    private int gols;
    private int partits;
    private boolean extraComunitari;

    public Jugadora(String nom, String equip, String posicio, int targetes, int gols, int partits, boolean extraComunitari) {
        this.nom = nom;
        this.equip = equip;
        this.posicio = posicio;
        this.targetes = targetes;
        this.gols = gols;
        this.partits = partits;
        this.extraComunitari = extraComunitari;
    }

    public double mitjanaGols() {
        return (double) this.gols / (double) this.partits;
    }

    public double mitjanaTargetes() {
        return (double) this.targetes / (double) this.partits;
    }

    public boolean esPortera() {
        return this.posicio.equalsIgnoreCase("portera");
    }

    @Override
    public String toString() {
        return "Jugadora{" +
                "nom='" + nom + '\'' +
                ", equip='" + equip + '\'' +
                ", posicio='" + posicio + '\'' +
                ", targetes=" + targetes +
                ", gols=" + gols +
                ", partits=" + partits +
                ", extraComunitari=" + extraComunitari +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    public String getPosicio() {
        return posicio;
    }

    public void setPosicio(String posicio) {
        this.posicio = posicio;
    }

    public int getTargetes() {
        return targetes;
    }

    public void setTargetes(int targetes) {
        this.targetes = targetes;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getPartits() {
        return partits;
    }

    public void setPartits(int partits) {
        this.partits = partits;
    }

    public boolean isExtraComunitari() {
        return extraComunitari;
    }

    public void setExtraComunitari(boolean extraComunitari) {
        this.extraComunitari = extraComunitari;
    }
}
