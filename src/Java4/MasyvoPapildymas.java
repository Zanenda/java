package Java4;

import java.util.Arrays;

public class MasyvoPapildymas {
    public static void main(String[] args) {
        int[] a = new int[0];
        addElement(a, 10);

    }

    static int[] addElement(int[] masyvas, int reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }


}
