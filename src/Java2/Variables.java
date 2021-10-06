package Java2;

public class Variables {

    public static void main(String[] args) {
        // Variable type variableName = value;
        boolean buljonas = true;
        System.out.println("Output = " + buljonas);

        Boolean geresnisBuljonas = null;
        System.out.println("Other output = " + geresnisBuljonas);

        int sveikasSkaičius = 5;
        System.out.println(sveikasSkaičius);

        Integer geresnisSveikasSkaičius = null;
        System.out.println(geresnisSveikasSkaičius);

        double nesveikasSkaičius = 5d;
        System.out.println(nesveikasSkaičius);

        Double geresnisNesveikasSkaičius = 9.0;
        System.out.println(geresnisNesveikasSkaičius);

        String tekstas = "čia yra mūsų tekstas";
        String tekstas2 = "čia yra mūsų tekstas";
        String tarpas = " ";
        System.out.println(tekstas + tarpas + tekstas2 + nesveikasSkaičius + geresnisNesveikasSkaičius);
        System.out.println(tekstas + tarpas + tekstas2 + (nesveikasSkaičius + geresnisNesveikasSkaičius));
        System.out.println(nesveikasSkaičius + geresnisNesveikasSkaičius + tekstas + tarpas + tekstas2);

        Character simbolis = 'a';
        System.out.println(simbolis);
    }
}
