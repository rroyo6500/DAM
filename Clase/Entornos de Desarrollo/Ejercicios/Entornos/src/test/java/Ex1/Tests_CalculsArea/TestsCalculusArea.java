package Ex1.Tests_CalculsArea;

import Ex1.CalculsArea.Area;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestsCalculusArea {

    @Test
    void testAreaQuadrat() {
        assertEquals(25.0, Area.areaQuadrat(5));
    }

    @Test
    void testAreaRectangle() {
        assertEquals(10.0, Area.areaRectangle(5, 2));
    }

    @Test
    void testAreaCercle() {
        assertEquals(78.53981633974483, Area.areaCercle(5));
    }

    @Test
    void testAreaTriangle() {
        assertEquals(5.0, Area.areaTriangle(5, 2));
    }

    @Test
    void testAreaTrapezi() {
        assertEquals(10.5, Area.areaTrapezi(5, 2, 3));
    }

    @Test
    void testAreaEllipse() {
        assertEquals(31.41592653589793, Area.areaEllipse(5, 2));
    }

}
