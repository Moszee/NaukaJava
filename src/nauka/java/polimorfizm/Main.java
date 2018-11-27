package nauka.java.polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FabrykaPojazdow> fabryki = new ArrayList<>();

        FabrykaMotocykli fabrykaMotocykli = new FabrykaMotocykli();
        Pojazd pojazd = fabrykaMotocykli.zrobPojazd();

        Motocykl motocykl = (Motocykl)pojazd;
        System.out.println("Motocykl ma kola w liczbie: " + motocykl.getLiczbaKol());

        FabrykaSamochodow fabrykaSamochodow = new FabrykaSamochodow();
        Samochod samochod = fabrykaSamochodow.zrobPojazd();

        String przyspieszenie = samochod.getPrzyspieszenie();
        System.out.println("Samochod ma przyspieszenie: " + przyspieszenie);

        fabryki.add(fabrykaSamochodow);
        fabryki.add(fabrykaMotocykli);

        for(FabrykaPojazdow fp : fabryki) {
            Pojazd pojazdZFabryki = fp.zrobPojazd();
            pojazdZFabryki.jedz();
        }


    }

}
