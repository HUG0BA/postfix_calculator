package uvg.edu.gt;

import uvg.edu.gt.Components.Calcu;

/**
 * MAIN CLASS
 *
 */
public class App {
    /**
     * @param args
     *             basically the UI haha
     *             think it works with float and negative numbers
     */
    public static void main(String[] args) {
        String strArray = "1 2 + 4 * 3 +";
        //2 3 1 * + 9 -
        Calcu calcu = new Calcu();
        System.out.println(calcu.calc(strArray));
    }
}
