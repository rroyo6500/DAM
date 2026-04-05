package POO.Practicas.HogwartsRobertRoyo.Java.Ventanas;

import POO.Practicas.HogwartsRobertRoyo.Java.Alumno;
import POO.Practicas.HogwartsRobertRoyo.Java.Casa;
import POO.Practicas.HogwartsRobertRoyo.Java.JF.Enums.MainAxisAlignment;
import POO.Practicas.HogwartsRobertRoyo.Java.JF.JFComponents.SimpleComponents.*;
import POO.Practicas.HogwartsRobertRoyo.Utils.CustomFonts;

import javax.swing.*;
import java.awt.*;

public class InformacionCasas extends JFWindow {

    private static JFImage banner;
    private static JFImage escudo;

    public InformacionCasas(int width, int height, Casa casa, Alumno alumno) {
        super(width, height, "House Information", JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        switch (casa.getCasa()) {
            case Gryffindor -> {
                banner = new JFImage("src/POO/Practicas/HogwartsRobertRoyo/resources/banners/bannerGryffindor.png");
                escudo = new JFImage("src/POO/Practicas/HogwartsRobertRoyo/resources/escuts/Gryffindor.png");
            }
            case Hufflepuff -> {
                banner = new JFImage("src/POO/Practicas/HogwartsRobertRoyo/resources/banners/bannerHufflepuff.png");
                escudo = new JFImage("src/POO/Practicas/HogwartsRobertRoyo/resources/escuts/Hufflepuff.png");
            }
            case Ravenclaw -> {
                banner = new JFImage("src/POO/Practicas/HogwartsRobertRoyo/resources/banners/bannerRavenclaw.png");
                escudo = new JFImage("src/POO/Practicas/HogwartsRobertRoyo/resources/escuts/Ravenclaw.png");
            }
            case Slytherin -> {
                banner = new JFImage("src/POO/Practicas/HogwartsRobertRoyo/resources/banners/bannerSlytherin.png");
                escudo = new JFImage("src/POO/Practicas/HogwartsRobertRoyo/resources/escuts/Slytherin.png");
            }
        }
        Color mainColor = casa.getColorsCasa()[0];
        Color textColor = casa.getColorsCasa()[1];
        setColor(mainColor);
        addChild(
                new JFCenter(
                        new JFColumn(
                                banner,
                                new JFSizedBox(1, 15),
                                new JFRow(
                                        escudo,
                                        new JFColumn(
                                                new JFText(casa.getFundadorCasa())
                                                        .setColor(textColor)
                                                        .setFont(CustomFonts.getFont("HP", 24f)),
                                                new JFText(casa.getAnimal())
                                                        .setColor(textColor)
                                                        .setFont(CustomFonts.getFont("HP", 24f))
                                        ).mainAxisAlignment(MainAxisAlignment.SPACE_EVENLY)
                                ).mainAxisAlignment(MainAxisAlignment.SPACE_EVENLY)
                        ).mainAxisAlignment(MainAxisAlignment.START)
                )
        );

    }
}
