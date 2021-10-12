package Java4.Uzdaviniai;

import java.io.*;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int[] array = new int[0];

        try {
            reader = new BufferedReader(new FileReader("src/Java4/Uzdaviniai/duomenys.txt"));
            String line = reader.readLine();
            while(line != null) {
                int number = Integer.parseInt(line);
                array = addElement(array, number);

                line = reader.readLine();
            }

            System.out.println("before reverse = " + Arrays.toString(array));

            for(int i = 0; i < array.length / 2; i++){
                int temp = array[i];
                array[i] = array[array.length -i -1];
                array[array.length -i -1] = temp;
            }

            System.out.println("after reverse = " + Arrays.toString(array));

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println();
        } catch (IOException e) {
            System.out.println();
        }



//        try {
//            bw = BufferedReader(new FileWriter("src/java4/uzduotys/atsakymai.txt"));
//            bw.write("Nuskaityti duomenys:");
//            bw.newLine();
//
//           for(int i = 0; i < array.length; i++) {
//                bw.write(array[1]);
//            }
//        }

    }

    static int [] addElement(int[] array, int value) {
        array = Arrays.copyOf(array, array.length +1);
        array[array.length - 1] = value;
        return array;
    }
}
