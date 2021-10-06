package Java2;

import java.util.Scanner;

public class Skaitymas {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Įveskite skaičių:");
        int skaicius = reader.nextInt();

        System.out.println("Įveskite nesveiką skaičių:");
        double nesveikasSkaicius = reader.nextDouble();

        System.out.println("Įveskite tekstą:");
        String tekstas = reader.nextLine();

        reader.close();

        System.out.println("Mūsų nuskaitytas skaičius = " + skaicius);
        System.out.println("Mūsų nuskaitytas nesveikas skaičius = " + nesveikasSkaicius);
        System.out.println("Mūsų nuskaitytas tekstas = " + tekstas);
    }
}

