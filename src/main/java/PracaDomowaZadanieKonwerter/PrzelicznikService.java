package PracaDomowaZadanieKonwerter;

public interface PrzelicznikService {
    void przeliczStopnie(double temp);

    int przykladowyInt = 0;

    double PrzeliczCelc(double temp);

    double PrzeliczFarr(double temp);

    double PrzeliczKelv(double temp);

    double PrzeliczRank(double temp);

    String PodajNazwePrzelicznika();

    default void test() {
        System.out.println(PodajNazwePrzelicznika());
    }


}
