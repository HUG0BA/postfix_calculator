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
        String strArray = "2 3 1 * + 9 - ";
        Calcu.postfix(strArray);
    }
}
