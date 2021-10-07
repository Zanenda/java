package java3;

import javax.swing.text.Style;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class FailoSkaitymas {
    public static void main(String[] args) {
        URL url  = FailoSkaitymas.class.getResource("tekstas.txt");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(url.getPath()));

            String line = br.readLine();
            while(line != null && !line.isEmpty()) {
             System.out.println(line);
             line = br.readLine();
            }

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Netiketa klaida");
        }
    }
}
