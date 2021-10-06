package Java2.Uždaviniai;

//Parašyti programa kuri suskaičiuotų: Kai kraštinės ilgis įvedamas į konsolę:
//• Stačiojo trikampio plotą

import java.util.Scanner;

public class PlotasStaciojoTrikampio {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite krastine a");
        double a = reader.nextDouble();
        System.out.println("Iveskite krastine b");
        double b = reader.nextDouble();
        System.out.println("Iveskite krastine c");
        double c = reader.nextDouble();
        reader.close();

        double perimetras = a + b + c;
        double plotas = a * b / 2;
        System.out.println("Perimetras = " + perimetras);
        System.out.println("Plotas = " + plotas);
    }
}
