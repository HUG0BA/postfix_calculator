package uvg.edu.gt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void mainTest()
    {
<<<<<<< Updated upstream
        App.main(null);
=======
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the App

        App.main(new String[0]);

        // Restore original System.out
        System.setOut(System.out);

        String expectedOutput = "Bienvenido a  La Mejor PosFix Calculator!\n" +
                                "Array a evaluar: \n" +
                                "\n" +
                                "Array a evaluar: \n" +
                                "\n";

        assertEquals(expectedOutput, outputStream.toString());
>>>>>>> Stashed changes
    }
}
