package Pokemon_RobertRoyo;

import Pokemon_RobertRoyo.Ventanas.MainWindow;
import Utils.CustomFonts;

public class Main {

    public static void main(String[] args) {

        CustomFonts.addFont("pk1", "src/main/resources/Fonts/Pokemon.ttf", 14);
        CustomFonts.addFont("pk2", "src/main/resources/Fonts/Pokemon2.ttf", 14);

        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);

    }

}
