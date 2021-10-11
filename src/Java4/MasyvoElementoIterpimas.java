package Java4;

public class MasyvoElementoIterpimas {
    public static void main(String[] args) {
        int[] a = {1,2,6};
        a = iterptiElementa(a,3,2);
        System.out.println();
    }

    static int[] iterptiElementa(int[] masyvas, int reiksme, int vieta) {
        int[] laikinas = new int [masyvas.length + 1];
        int pridejimoVieta = 0;

        for(int i = 0; i < masyvas.length; i++) {
            if(i == vieta) {
                laikinas[pridejimoVieta++] = reiksme;
            }

            laikinas[pridejimoVieta] = masyvas[1];
            pridejimoVieta = pridejimoVieta + 1;
        }
        return laikinas;
    }
}
