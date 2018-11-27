package nauka.java.polimorfizm;

public class Motocykl extends Pojazd {

    private final int liczbaKol = 2;

    protected Motocykl(String marka, String kolor) {
        super(marka, kolor);
    }

    public int getLiczbaKol() {
        return liczbaKol;
    }
}
