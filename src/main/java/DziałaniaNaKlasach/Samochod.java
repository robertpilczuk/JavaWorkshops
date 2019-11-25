package DziałaniaNaKlasach;

public class Samochod {
    private String kolor;
    private String marka;
    private String rodzajPaliwa;
    private int liczbaDrzwi;
    private double pojemnoscSilnika;
    private double cenaAuta;

    @Override
    public String toString() {
        return "Samochod{" +
                "kolor = '" + kolor + '\'' +
                ", marka = '" + marka + '\'' +
                ", rodzajPaliwa = '" + rodzajPaliwa + '\'' +
                ", liczbaDrzwi = " + liczbaDrzwi +
                ", pojemnoscSilnika = " + pojemnoscSilnika +
                ", cenaAuta = " + cenaAuta +
                '}';
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getRodzajPaliwa() {
        return rodzajPaliwa;
    }

    public void setRodzajPaliwa(String rodzajPaliwa) {
        this.rodzajPaliwa = rodzajPaliwa;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public void setLiczbaDrzwi(int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public double getCenaAuta() {
        return cenaAuta;
    }

    public void setCenaAuta(double cenaAuta) {
        this.cenaAuta = cenaAuta;
    }

    public Samochod(String kolor, String marka, String rodzajPaliwa, int liczbaDrzwi, double pojemnoscSilnika, double cenaAuta) {
        this.kolor = kolor;
        this.marka = marka;
        this.rodzajPaliwa = rodzajPaliwa;
        this.liczbaDrzwi = liczbaDrzwi;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.cenaAuta = cenaAuta;
    }

    public Samochod(String marka, String rodzajPaliwa, int liczbaDrzwi, double pojemnoscSilnika, double cenaAuta) {
        this.kolor = "czerwony";
        this.marka = marka;
        this.rodzajPaliwa = rodzajPaliwa;
        this.liczbaDrzwi = liczbaDrzwi;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.cenaAuta = cenaAuta;
    }

    public Samochod() {

    }
}
