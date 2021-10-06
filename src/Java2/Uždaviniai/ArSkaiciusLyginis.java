package Java2.Uždaviniai;

//• Parašytų ar įvestas skaičius yra lyginis

import java.util.Scanner;

public class ArSkaiciusLyginis {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        double skaicius = reader.nextDouble();
        reader.close();

        if (skaicius % 2 == 0) {
            System.out.println("Skaicius yra lyginis");
        } else {
            System.out.println("Skaicius yra nelyginis");
        }

    }
}
