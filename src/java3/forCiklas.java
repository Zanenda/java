package java3;

public class forCiklas {
    public static void main(String[] args) {

        // ciklas prasideda standartiskai su kintamuoju i
        for(int i = 0; i < 10; i++) {
            System.out.println(i);

            // ciklas cikle antras standartiskai naudojamas j
            for(int j = 0; j < 10; j++) {
                System.out.println(j);

                // ciklas cikle trecias standartiskai naudojamas z
                for(int z = 0; z < 10; z++) {
                    System.out.println(z);
                }
            }
        }

        int skaicius = 2;
        int laipsnis = 5;
        int rezultatas = skaicius;
        for(int i = 0; i < laipsnis; i++) {
            rezultatas = rezultatas * skaicius;

        }
        System.out.println("Keltas skaicius = " + skaicius);
        System.out.println("Laipsnis = " + laipsnis);
        System.out.println("Rezultatas = " + rezultatas);

    }
}
