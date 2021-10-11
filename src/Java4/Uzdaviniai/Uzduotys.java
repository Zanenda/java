package Java4.Uzdaviniai;

import java.io.*;
import java.util.Arrays;

public class Uzduotys {
    public static void main(String[] args) {
        BufferedReader br = null;
        int[] masyvas = new int[0];

        try {
            br = new BufferedReader(new FileReader("src/Java4/Uzdaviniai/duomenys.txt"));
            String line = br.readLine();
            while(line != null) {
                int skaicius = Integer.parseInt(line);
                masyvas = pridetiElementa(masyvas, skaicius);

                line = br.readLine();
            }
            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Nerastas failas");
        }
        catch (IOException e) {
            System.out.println("Klaida");
        }
        for(int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
    }

    static int [] pridetiElementa(int[] masyvas, int reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length +1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }
}
