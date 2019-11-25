package EqualsHashCode;

import java.util.Objects;

public class Person {
    private String imie;
    private String nazwisko;
    private int kodPocztowy;
    private String miasto;
    private Pesel pesel;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(int kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public Pesel getPesel() {
        return pesel;
    }

    public void setPesel(Pesel pesel) {
        this.pesel = pesel;
    }

    public Person(String imie, String nazwisko, int kodPocztowy, String miasto, Pesel pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.pesel = pesel;
    }

    public Person(String imie, String nazwisko, int kodPocztowy, String miasto, long pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.pesel = new Pesel(pesel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return kodPocztowy == person.kodPocztowy &&
                Objects.equals(imie.toLowerCase(), person.imie.toLowerCase()) &&
                Objects.equals(nazwisko, person.nazwisko) &&
                Objects.equals(miasto, person.miasto) &&
                Objects.equals(pesel, person.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie.toLowerCase(), nazwisko, kodPocztowy, miasto, pesel);
    }
}
