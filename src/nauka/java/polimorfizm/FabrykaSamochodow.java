package nauka.java.polimorfizm;

public class FabrykaSamochodow extends FabrykaPojazdow {

    @Override
    public Samochod zrobPojazd() {
        return new Samochod("marka", "kolor", "duże");
    }
}
