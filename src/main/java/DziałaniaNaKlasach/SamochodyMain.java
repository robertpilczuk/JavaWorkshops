package DziałaniaNaKlasach;

public class SamochodyMain {
    public static void main(String[] args) {
        Samochod auto1 = new Samochod("wiśniowy", "Skoda", "Benzyna", 5,
                1.8, 30000);
        Samochod auto2 = new Samochod("Peugeot", "Benzyna", 5,1.5,15000);
        Samochod auto3 = new Samochod();

        System.out.println(auto3.getCenaAuta());

        auto3.setCenaAuta(26500.0);
        System.out.println(auto3.getCenaAuta());
        auto3.setKolor("różowy");
        auto3.setLiczbaDrzwi(6);
        auto3.setMarka("Dodge");
        auto3.setPojemnoscSilnika(3.5);
        auto3.setRodzajPaliwa("Diesel");

        System.out.println(auto3.toString());
        System.out.println(auto2.toString());
        System.out.println(auto1.toString());
    }
}
