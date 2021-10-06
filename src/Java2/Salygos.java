package Java2;

public class Salygos {
    public static void main(String[] args) {
        boolean x = 19 != 19;

        System.out.println(x);

        int a = 0;

        if (a > 0) {
            System.out.println("Skaicius yra teigiamas");

        } else if (a < 0){
            System.out.println("Skaičius yra neigimas");

        } else if (a == 0){
            System.out.println("Skaičius yra lygus nuliui");

        } else if (a != 0) {
            System.out.println("Ne 0, kažkokia kita reikšmė");
        }
    }
}
