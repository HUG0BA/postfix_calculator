package uvg.edu.gt;

import static org.junit.Assert.*;
import org.junit.Test;

import uvg.edu.gt.Components.Lector;

import java.io.FileNotFoundException;
import java.util.Vector;

public class LectorTest {
    
    @Test
    public void testNormalLector() throws FileNotFoundException{
        Lector lector = new Lector("src/test/resources/datosTest.txt");
        Vector<String> strings = lector.readTXTFile();

        Vector<String> expectedStrings = new Vector<String>();
        expectedStrings.add("1 2 + 4 * 3 +");
        expectedStrings.add("6 2 3 + *");
        expectedStrings.add("8 4 * 4 / 5 + 6 -");
        expectedStrings.add("5 4 + 3 / 9 * 6 - 3 + 2 /");
        
        for(int i = 0; i < strings.size(); i++){
            assertEquals(strings.elementAt(i), expectedStrings.elementAt(i));
        }

    }

    

}
