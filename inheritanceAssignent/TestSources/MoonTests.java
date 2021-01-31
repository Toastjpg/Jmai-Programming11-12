import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoonTests {
    Moon moon;
    Moon moon2;
    Moon moonFalse;

    @Before
    public void setUp(){
        moon = new Moon(new Planet(25,"earth"), 50, false, "moon");
        moon2 = new Moon(new Planet(25,"earth"), 50, false, "moon");
        moonFalse = new Moon(new Planet(35, "jupiter"), 60, false, "jupiter.moon");
    }
    @Test
    public void equalsMethodTestTrue(){
        assertTrue(moon.equals(moon2));
    }
    @Test
    public void equalsMethodTestFalse(){
        assertFalse(moonFalse.equals(moon));
    }
}
