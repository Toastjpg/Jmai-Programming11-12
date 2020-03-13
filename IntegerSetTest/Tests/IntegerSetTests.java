import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class IntegerSetTests {
    IntegerSet testSet;

    @Before
    public void setup(){
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere() {
        //check number not already in the set
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(3));
        //insert a number
        testSet.insert(3);
        //check the number is in the set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
    }

    @Test
    public void testInsertAlreadyThere(){
        //insert a number
        testSet.insert(3);
        //test if the number is there
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
        //test that it doesn't add a duplicate number
        testSet.insert(3);
        assertEquals(testSet.size(), 1);
    }


}
