package nauka.java.polimorfizm;

public class Samochod extends Pojazd {

    private final String przyspieszenie;

    protected Samochod(String marka, String kolor, String przyspieszenie) {
        super(marka, kolor);
        this.przyspieszenie = przyspieszenie;
    }

    public String getPrzyspieszenie() {
        return przyspieszenie;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "przyspieszenie='" + przyspieszenie + '\'' +
                ", marka='" + marka + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
