package uvg.edu.gt;

import java.util.Vector;

import uvg.edu.gt.Components.Calcu;
import uvg.edu.gt.Components.Lector;
import uvg.edu.gt.Components.POSFIXCalc;

/**
 * MAIN CLASS
 *
 */
public class App {
    /**
     * @param args
     *             Implementacion de clases Lector y Calcu
     */
    public static void main(String[] args) {
        POSFIXCalc calcu = new Calcu();
        Lector leer = new Lector("src/test/resources/datosTest.txt");
        System.out.println("Bienvenido a  La Mejor PosFix Calculator!");

        try {
            Vector<String> strVector = leer.readAndFilterTXTFile();
            for (String elemento : strVector) {
                System.out.println("Array a evaluar: " + elemento);
                System.out.println(calcu.calc(elemento));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
