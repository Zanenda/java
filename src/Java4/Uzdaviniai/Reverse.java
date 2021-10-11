package Java4.Uzdaviniai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

    }

    static int [] addElement(int[] array, int value) {
        array = Arrays.copyOf(array, array.length +1);
        array[array.length - 1] = value;
        return array;
    }
}
