package PracaDomowaZadanieKonwerterAbstract;

public class PrzelicznikZRank extends PrzelicznikService {

//    @Override
//    public void przeliczStopnie(double tempR){
//        System.out.println("Podana wartość R : " + tempR);
//        System.out.println(" " + zRnaC(tempR) + " C");
//        System.out.println(" " + zRnaF(tempR) + " F");
//        System.out.println(" " + zRnaK(tempR) + " K");
//    }

    @Override
    public double PrzeliczCelc(double tempR) {
        return ((tempR * 1.8) - 273.15);
    }

    @Override
    public double PrzeliczFarr(double tempR) {
        return (tempR - 459.67);
    }

    @Override
    public double PrzeliczKelv(double tempR) {
        return (tempR * 5 / 9);
    }

    @Override
    public double PrzeliczRank(double temp) {
        return temp;
    }

    @Override
    public String PodajNazwePrzelicznika() {
        return "Podano temp w Rankin";
    }

    static double zRnaC(double tempR){
        return ((tempR * 1.8) - 273.15);
    }
    static double zRnaF(double tempR){
        return (tempR - 459.67);
    }
    static double zRnaK(double tempR){
        return (tempR * 5 / 9);
    }


}
