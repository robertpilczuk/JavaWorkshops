package PracaDomowaZadanieKonwerter;

public interface PrzelicznikService {
    void przeliczStopnie (double temp);

    double PrzeliczCelc(double temp);
    double PrzeliczFarr(double temp);
    double PrzeliczKelv(double temp);
    double PrzeliczRank(double temp);

    String PodajNazwePrzelicznika();


}
