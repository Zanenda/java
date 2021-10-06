package Java2.Uždaviniai;

//Parašyti programa kuri suskaičiuotų: Kai kraštinės ilgis įvedamas į konsolę:
//• Apskritimo plotą

import java.util.Scanner;

public class PlotasApskritimo {
    public static void main(String[] args) { //psvm
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite spinduli r");
        double r = reader.nextDouble();
        reader.close();

        // 2 * pi * r
        double perimetras = 3 * Math.PI * r;

        // pi * r * r
        // double plotas = Math.PI * r * r;
        double plotas = Math.PI * Math.pow(r, 2); // pakelti kvadratu Math.pow(r, 3) pakelti kubu

        System.out.println("Perimetras = " + String.format("%.2f",perimetras));
        System.out.println("Plotas = " + String.format("%.2f",plotas));
    }
}
