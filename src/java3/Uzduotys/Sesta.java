package java3.Uzduotys;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sesta {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("src/java3/uzduotys/sesta.txt"));

            String line = br.readLine();
            System.out.println(line);
            int ilgis = Integer.parseInt(line);

            for (int i = 0; i < ilgis; i++) {
                System.out.println(" i = " + i);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }
    }
}
