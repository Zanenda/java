package Java2.Uždaviniai;

//• Patikrinti ar įvestas skaičius teigiamas ar neigiamas

import java.util.Scanner;

public class TeigiamasArNeigiamas {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        double skaicius = reader.nextDouble();
        reader.close();

        if (skaicius > 0) {
            System.out.println("Skaicius teigiamas");
        } else if (skaicius < 0){
            System.out.println("Skaicius neigiamas");
        } else if (skaicius == 0){
            System.out.println("Skaicius yra nulis");
        } else {
            System.out.println("Netinkama reikšmė");
        }

    }
}
