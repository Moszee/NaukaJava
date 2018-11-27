package nauka.java.polimorfizm;

public abstract class Pojazd {

    public final String marka;
    public final String kolor;

    protected Pojazd(String marka, String kolor) {
        this.marka = marka;
        this.kolor = kolor;
    }

    public void jedz() {
        System.out.println("Jedziemy w " + toString());
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "marka='" + marka + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
