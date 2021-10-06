package Java2.Uždaviniai;

//• Įvesta skaičių nuo 1-7 grąžintų atitinkamą dienos pavadinimą

import java.util.Scanner;

public class IvestaSavaitesDiena {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu tarp 1 ir 7");
        int skaicius = reader.nextInt();
        reader.close();

        if (skaicius == 1) {
            System.out.println("Pirmadienis");
        } else if (skaicius == 2) {
            System.out.println("Antradienis");
        } else if (skaicius == 3) {
            System.out.println("Treciadienis");
        } else if (skaicius == 4) {
            System.out.println("Ketvirtadienis");
        } else if (skaicius == 5) {
            System.out.println("Penktadienis");
        } else if (skaicius == 6) {
            System.out.println("Sestadienis");
        } else if (skaicius == 7) {
            System.out.println("Sekmadienis");
        } else {
            System.out.println("Skaicius netinkamas");
        }
    }
}
