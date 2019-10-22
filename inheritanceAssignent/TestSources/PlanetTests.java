import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlanetTests {
    Planet planetTests;
    Planet planetTests2;
    Planet planetTestsFalse;

    @Before
    public void setUp(){
        planetTests = new Planet(25,"earth");
        planetTests2 = new Planet(25,"earth");
        planetTestsFalse = new Planet(35,"mars");
    }

    @Test
    public void testEqualsMethod(){
        assertTrue(planetTests.equals(planetTests2));
    }

    @Test
    public void testEqualsMethodFalse(){
        assertFalse(planetTestsFalse.equals(planetTests));
    }
}
