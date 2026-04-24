/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RA7_ExamenPOO_RobertRoyo;

/**
 *
 * @author r.royo
 */
public class Serie extends FilmoMetraje{

    private int temporadas;
    
    public Serie(String titulo, String director, boolean isFromNetflix, int temporadas) {
        super(titulo, director, isFromNetflix);
        this.temporadas = temporadas;
    }

    @Override
    public void reproducir() {
        System.out.println("Se esta reproduciendo la serie " + titulo);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" [%d temporadas]", temporadas);
    }
    
}
