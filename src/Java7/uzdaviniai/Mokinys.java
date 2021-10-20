package Java7.uzdaviniai;

public class Mokinys {
    private String vardas;
    private String pavarde;
    private String klase;
    private int[] pazymiuMasyvas;

    public Mokinys() {

    }

    public Mokinys(String vardas, String pavarde, String klase, int[]pazymiuMasyvas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.pazymiuMasyvas = pazymiuMasyvas;
    }

    // GET SET VARDAS

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    ///////////////////
    // GET SET PAVARDE

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    ///////////////////
    // GET SET KLASE

    public String getKlase() {
        return klase;
    }

    public void setKlase(String klase) {
        this.klase = klase;
    }

    ///////////////////
    // GET SET PAZYMIUMASYVAS

    public int[] getPazymiuMasyvas() {
        return pazymiuMasyvas;
    }

    public void setPazymiuMasyvas(int[] pazymiuMasyvas) {
        this.pazymiuMasyvas = pazymiuMasyvas;
    }

    public String toString() {
        return "Vardas: " + vardas + " Pavarde: " + pavarde + " Klase: " + klase
                + " Pazymiu masyvas: " + pazymiuMasyvas; // 4 6 10 8
    }

    private String pazymiuEilute() {
        String tekstas = "";
        for(int i = 0; i < pazymiuMasyvas.length; i++) {
            tekstas = tekstas + pazymiuMasyvas[i] + " ";
        }
        return tekstas;
    }



}
