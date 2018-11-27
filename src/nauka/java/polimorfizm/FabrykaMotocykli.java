package nauka.java.polimorfizm;

public class FabrykaMotocykli extends FabrykaPojazdow {

    @Override
    public Pojazd zrobPojazd() {
        return new Motocykl("marka motocykla", "kolor motocykla");
    }

}
