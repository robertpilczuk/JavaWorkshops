package PracaDomowaZadanieKonwerter;

public class PrzelicznikZCelc implements PrzelicznikService {

    @Override
    public void przeliczStopnie(double tempC) {
        System.out.println("Podana wartość C : " + tempC);
        System.out.println(" " + zCnaF(tempC) + " F");
        System.out.println(" " + zCnaK(tempC) + " K");
        System.out.println(" " + zCnaR(tempC) + " R");

    }

    @Override
    public double PrzeliczCelc(double temp) {
        return temp;
    }

    @Override
    public double PrzeliczFarr(double tempC) {
        return ((2 * (tempC - (0.1 * tempC)) + 32));
    }

    @Override
    public double PrzeliczKelv(double tempC) {
        return (tempC + 273.15);
    }

    @Override
    public double PrzeliczRank(double tempC) {
        return ((tempC + 273.15) * 1.8);
    }

    @Override
    public String PodajNazwePrzelicznika() {
        return "JAkiś tekst";
    }

    static double zCnaF(double tempC) {
        return ((2 * (tempC - (0.1 * tempC)) + 32));
    }

    static double zCnaK(double tempC) {

        return (tempC + 273.15);
    }

    static double zCnaR(double tempC) {
        return ((tempC + 273.15) * 1.8);
    }
}
