import org.junit.Test;

import static org.junit.Assert.*;

/*
* Test a valid string
* Test a start int that is greater than or less than text length
* Test a start int at 0
* Test a start int at text length
* Test an even start int
* Test an odd start int
* */
public class reverseEndTest {
    @Test
    public void testValidTextLength(){
        assertEquals("a valid string", reverseEnd.reverseEnd(null,0));
    }

    @Test
    public void testValidStartInt(){
        assertEquals("Start int greater than text length", reverseEnd.reverseEnd("hello", 200));
        assertEquals("Start int less than 0", reverseEnd.reverseEnd("hello", -5));
    }

    @Test
    public void testAtZero(){
        assertEquals("olleh", reverseEnd.reverseEnd("hello", 0));
    }

    @Test
    public void testAtTextLength(){
        assertEquals("hello", reverseEnd.reverseEnd("hello", 5));
    }

    @Test
    public void testOddEvenStart() {
        assertEquals("apelp", reverseEnd.reverseEnd("apple", 2));
        assertEquals("appel", reverseEnd.reverseEnd("apple", 3));

    }

}