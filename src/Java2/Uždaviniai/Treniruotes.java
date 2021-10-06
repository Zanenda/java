package Java2.Uždaviniai;

import java.util.Scanner;

public class Treniruotes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kokios trukmes treniruote pirmadieni?");
        double  trukmeValandomis = reader.nextDouble();
        System.out.println("Kokios trukmes treniruote antradieni?");
        trukmeValandomis += reader.nextDouble();
        System.out.println("Kokios trukmes treniruote treciadieni?");
        trukmeValandomis += reader.nextDouble();
        System.out.println("Kokios trukmes treniruote ketvirtadieni?");
        trukmeValandomis += reader.nextDouble();
        System.out.println("Kokios trukmes treniruote penktadieni?");
        trukmeValandomis += reader.nextDouble();
        reader.close();

        double trukmeMinutemis = trukmeValandomis * 60;
        System.out.println("Per savaite Andrius treniruojasi = " + String.format("%.0f",trukmeMinutemis) + " minuciu");

    }
}
