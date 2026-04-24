/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RA7_ExamenPOO_RobertRoyo;

/**
 *
 * @author r.royo
 */
public abstract class FilmoMetraje {
    
    protected String titulo;
    protected String director;
    protected boolean isFromNetflix;

    public FilmoMetraje(String titulo, String director, boolean isFromNetflix) {
        this.titulo = titulo;
        this.director = director;
        this.isFromNetflix = isFromNetflix;
    }
    
     public abstract void reproducir();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isIsFromNetflix() {
        return isFromNetflix;
    }

    public void setIsFromNetflix(boolean isFromNetflix) {
        this.isFromNetflix = isFromNetflix;
    }

    @Override
    public String toString() {
        return String.format("'%s', %s, %s de Netflix", titulo, director, ((isFromNetflix) ? "es" : "no es") );
    }    
    
}
