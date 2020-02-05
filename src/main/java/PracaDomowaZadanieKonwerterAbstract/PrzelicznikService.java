package PracaDomowaZadanieKonwerterAbstract;

public abstract class PrzelicznikService {
    void przeliczStopnie(double temp) {
        System.out.println(PodajNazwePrzelicznika());
        przeliczanieStopni(temp);
    }

    int przykladowyInt = 0;

    private void przeliczanieStopni(double temp) {
        System.out.println("Stopnie przeliczone na C: " + PrzeliczCelc(temp));
        System.out.println("Stopnie przeliczone na F: " + PrzeliczFarr(temp));
        System.out.println("Stopnie przeliczone na R: " + PrzeliczRank(temp));
        System.out.println("Stopnie przeliczone na K: " + PrzeliczKelv(temp));
    }

    abstract double PrzeliczCelc(double temp);

    abstract double PrzeliczFarr(double temp);

    abstract double PrzeliczKelv(double temp);

    abstract double PrzeliczRank(double temp);

    abstract String PodajNazwePrzelicznika();


}
