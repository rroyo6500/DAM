package POO.Practicas.HogwartsRobertRoyo.Java;

import POO.Practicas.HogwartsRobertRoyo.Java.Ventanas.MainWindow;
import POO.Practicas.HogwartsRobertRoyo.Utils.CustomFonts;

public class Main {

    public static final Alumno[][] alumnosCasas = {
            {
                    new Alumno("Harry", "Potter", 16, "Oak", "Stag"),
                    new Alumno("Ron", "Weasley", 16, "Willow", "Jack Russell Terrier"),
                    new Alumno("Hermione", "Granger", 16, "Walnut", "Otter")
            },
            {
                    new Alumno("Draco", "Malfoy", 16, "Hawthorn", "Ferret"),
                    new Alumno("Tom", "Riddle", 71, "Yew", "Unknow")
            },
            {
                    new Alumno("Cedric", "Diggory", 18, "Ash", "Unknow")
            },
            {
                    new Alumno("Cho", "Chang", 15, "Unknow", "Swan"),
                    new Alumno("Luna", "Lovegood", 14, "Unknow", "Hare")
            }
    };

    public static final Casa[] casas = {
            new Casa(Casas.Gryffindor, "#740001", "#eeba30", "Godric Griffyndor", "Lion")
                    .addAlumnos(alumnosCasas[0]),
            new Casa(Casas.Slytherin, "#1a472a", "#aaaaaa", "Salazar Slytherin", "Serpent")
                    .addAlumnos(alumnosCasas[1]),
            new Casa(Casas.Hufflepuff, "#ecb939", "#372e29", "Helga Hufflepuff", "Badger")
                    .addAlumnos(alumnosCasas[2]),
            new Casa(Casas.Ravenclaw, "#0e1a40", "#bebebe", "Rowena Ravenclaw", "Eagle")
                    .addAlumnos(alumnosCasas[3])
    };

    public static MainWindow mainWindow;

    public static void main(String[] args) {

        CustomFonts.addFont("HP", "src/POO/Practicas/HogwartsRobertRoyo/resources/fonts/HARRYP.TTF", 44);

        mainWindow = new MainWindow(400, 250).setVisible(true);

        for (Alumno[] alumnosCasa : alumnosCasas) {
            for (Alumno alumno : alumnosCasa) {
                mainWindow.getComboBox().addOption(alumno.toString());
            }
        }


    }

}
