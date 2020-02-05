package PracaDomowaZadanieKonwerterAbstract;

public class PrzelicznikOptymalnejTempPiwa extends PrzelicznikService {
    @Override
    public void przeliczStopnie(double temp) {

    }

    @Override
    public double PrzeliczCelc(double temp) {
        return przykladowyInt;
    }

    @Override
    public double PrzeliczFarr(double temp) {
        return 0;
    }

    @Override
    public double PrzeliczKelv(double temp) {
        return 0;
    }

    @Override
    public double PrzeliczRank(double temp) {
        return 0;
    }

    @Override
    public String PodajNazwePrzelicznika() {
        return null;
    }
}
