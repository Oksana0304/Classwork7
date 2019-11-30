package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Charlnput {

    public void copy() {


        try (FileReader fr = new FileReader("fish");
             FileWriter fw = new FileWriter("fish_copy.txt")) {

            char[] charArray = new char[16];

            int readed = fr.read(charArray);

            while (readed != -1) {
                fw.write(charArray);
                readed = fr.read(charArray);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }


