package PracaDomowaZadanieKonwerterAbstract;

public class PrzelicznikZFarren extends PrzelicznikService {

//    @Override
//    public void przeliczStopnie(double tempF) {
//        System.out.println("Podana wartość F: " + tempF);
//        System.out.println(" " + zFnaC(tempF) + " C");
//        System.out.println(" " + zFnaK(tempF) + " K");
//        System.out.println(" " + zFnaR(tempF) + " R");
//    }

    @Override
    public double PrzeliczCelc(double tempF) {
        return ((tempF - 32) / 1.8);
    }

    @Override
    public double PrzeliczFarr(double temp) {
        return temp;
    }

    @Override
    public double PrzeliczKelv(double tempF) {
        return ((tempF + 459.67) * 5 / 9);
    }

    @Override
    public double PrzeliczRank(double tempF) {
        return (tempF + 459.67);
    }

    @Override
    public String PodajNazwePrzelicznika() {
        return "Podano temp w Farren";
    }

    static double zFnaC(double tempF) {
        return ((tempF - 32) / 1.8);
    }

    static double zFnaK(double tempF) {
        return ((tempF + 459.67) * 5 / 9);
    }

    static double zFnaR(double tempF) {
        return (tempF + 459.67);
    }
}
