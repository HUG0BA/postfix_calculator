package uvg.edu.gt.Components;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Lector {
    File file;

    public Lector(String fileName){
        file = new File(fileName);
    }

    public Lector(File file){
        this.file = file;
    }

    
    /** 
     * @return Vector<String>
     * @throws FileNotFoundException
     * @description Leer cada línea del archivo de texto
     */
    public Vector<String> readTXTFile() throws FileNotFoundException{

        Scanner scan = new Scanner(file);
        Vector<String> content = new Vector<String>();

        while(scan.hasNextLine()){
            content.add(scan.nextLine().toString());
        }

        scan.close();

        return content;
    }

    
    /** 
     * @return Vector<String>
     * @throws FileNotFoundException
     * @description IMPORTANTE: método que además de leer el archivo, elimina las líneas que contengan valores no numéricos o dentro de los signos aceptados (+, -, / ,*)
     */
    public Vector<String> readAndFilterTXTFile() throws FileNotFoundException{

        Scanner scan = new Scanner(file);
        Vector<String> content = new Vector<String>();

        while(scan.hasNextLine()){
            String line = scan.nextLine().toString();
            if(line.matches("^[0123456789/\\\\+-/* ]+$")){
                content.add(line);
            }
        }

        scan.close();

        return content;
    }
}
