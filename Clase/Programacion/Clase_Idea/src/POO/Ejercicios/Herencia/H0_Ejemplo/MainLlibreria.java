package POO.Ejercicios.Herencia.H0_Ejemplo;

import java.util.List;

public class MainLlibreria {

    public static void main(String[] args) {
        Llibre llibre1 = new Llibre("Tirant lo Blanc", "Joanot Martorell", "978-84-297-6960-4");
        Llibre llibre2 = new Llibre("Mecanoscrit del segon origen", "Manuel de Pedrolo", "978-84-151-9253-1");
        Llibre llibre3 = new Llibre("Solitud", "Víctor Català", "978-84-664-0775-9");

        LlibreElectronic ebook1 = new LlibreElectronic("La plaça del Diamant", "Mercè Rodoreda", "978-84-7329-211-5", "EPUB");
        LlibreElectronic ebook2 = new LlibreElectronic("El quadern gris", "Josep Pla", "978-84-233-5120-7", "PDF");
        LlibreElectronic ebook3 = new LlibreElectronic("Incerta glòria", "Joan Sales", "978-84-7329-223-8", "MOBI");

        Revista revista1 = new Revista("Sàpiens", "Grup Som", "977-16-952-0100-3", 250);
        Revista revista2 = new Revista("El Temps", "Edicions del País Valencià", "977-11-334-0000-1", 2000);
        Revista revista3 = new Revista("Enderrock", "Grup Enderrock", "977-11-367-0000-8", 325);

        List<Llibre> llibres = List.of(llibre1, llibre2, llibre3, ebook1, ebook2, ebook3, revista1, revista2, revista3);

    }

}
