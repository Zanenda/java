package Java2;

public class Veiksmai {

    public static void main (String[] args) {
        int ats = 7 / 4;
        System.out.println(ats);
        int pirmasSkaicius = 7;
        int antrasSkaicius = 4;
        double ats2 = pirmasSkaicius / (antrasSkaicius * 1.0);
        System.out.println(ats2);

        int didinam = 1;
        System.out.println(--didinam); //decreases the number and stores in the memory 0
        System.out.println(didinam++); //displays the result then increases the number by one and stores it in memory 0
        System.out.println(didinam); //displays the result from memory 1

        String tekstas = "Labas";
//        tekstas = tekstas + " vakaras";
//        System.out.println(tekstas);
        tekstas += " vakaras";
        System.out.println(tekstas);

    }
}
