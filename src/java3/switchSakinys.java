package java3;

public class switchSakinys {

    public static void main(String[] args) {
        int skaicius = 3;

        switch (skaicius) {
            case 1:
                System.out.println("vienetas");
                break;
            case 2:
                System.out.println("dvejetas");
                break;
            case 3:
                System.out.println("trejetas");
                break;
            case 4:
                System.out.println("ketvertas");
                break;
            default:
                System.out.println("Nera tokio skaiciaus");
        }
    }
}
