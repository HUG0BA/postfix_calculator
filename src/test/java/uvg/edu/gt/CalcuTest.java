package uvg.edu.gt;

import static org.junit.Assert.*;
import org.junit.Test;

import uvg.edu.gt.Components.Calcu;
import uvg.edu.gt.Components.POSFIXCalc;

public class CalcuTest {
    
    @Test
    public void testCalcu(){
        POSFIXCalc calcu = new Calcu();

        assertEquals(15, calcu.calc("1 2 + 4 * 3 +"));
        assertEquals(30, calcu.calc("6 2 3 + *"));
        assertEquals(7, calcu.calc("8 4 * 4 / 5 + 6 -"));
        assertEquals(12, calcu.calc("5 4 + 3 / 9 * 6 - 3 + 2 /"));
    }

    @Test
    public void test(){
        POSFIXCalc calcu = new Calcu();

        assertEquals(7, calcu.calc("8 4 * 4 / 5 + 6 -"));

    }
}
