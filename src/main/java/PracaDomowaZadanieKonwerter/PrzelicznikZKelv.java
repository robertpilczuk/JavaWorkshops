package PracaDomowaZadanieKonwerter;

public class PrzelicznikZKelv implements PrzelicznikService {

    @Override
    public void przeliczStopnie(double tempK){
        System.out.println("Podana wartość K : " + tempK);
        System.out.println(" " + zKnaC(tempK) + " C");
        System.out.println(" " + zKnaF(tempK) + " F");
        System.out.println(" " + zKnaR(tempK) + " R");
    }

    @Override
    public double PrzeliczCelc(double tempK) {
        return (tempK - 273.15);
    }

    @Override
    public double PrzeliczFarr(double tempK) {
        return ((tempK * 1.8) - 459.67);
    }

    @Override
    public double PrzeliczKelv(double temp) {
        return temp;
    }

    @Override
    public double PrzeliczRank(double tempK) {
        return (tempK * 9 / 5);
    }

    @Override
    public String PodajNazwePrzelicznika() {
        return null;
    }

    static double zKnaC(double tempK){
        return (tempK - 273.15);
    }
    static double zKnaF(double tempK){
        return ((tempK * 1.8) - 459.67);
    }
    static double zKnaR(double tempK){
        return (tempK * 9 / 5);
    }

}
