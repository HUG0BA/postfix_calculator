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

    public Vector<String> readTXTFile() throws FileNotFoundException{

        Scanner scan = new Scanner(file);
        Vector<String> content = new Vector<String>();

        while(scan.hasNextLine()){
            content.add(scan.nextLine().toString());
        }

        scan.close();

        return content;
    }

    public Vector<String> readAndFilterTXTFile() throws FileNotFoundException{

        Scanner scan = new Scanner(file);
        Vector<String> content = new Vector<String>();

        while(scan.hasNextLine()){
            String line = scan.nextLine().toString();
            if(line.matches("^[0123456789/\\\\+-/* ]+$")){
                content.add(line);
            }else{
                scan.close();
                return null;
            }
            
        }

        scan.close();

        return content;
    }
}
