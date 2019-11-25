package PracaDomowaZadanieKonwerter;

import java.util.InputMismatchException;
import java.util.Scanner;

class Converter {
    //    public void glownaMetoda() można zrobić na niestatycznych metodach
    private PrzelicznikZKelv przelicznikZKelv = new PrzelicznikZKelv();
    private PrzelicznikZFarren przelicznikZFarren = new PrzelicznikZFarren();
    private PrzelicznikZRank przelicznikZRank = new PrzelicznikZRank();
    private PrzelicznikZCelc przelicznikZCelc = new PrzelicznikZCelc();

    void glownaMetodaStatic() {
        double temperatura;
        boolean dobraLiczba = false;

        System.out.println("Witaj w konwentrerze temperatur.");
        System.out.println("Konwerter stopni z danej jednostki na inne jednostki:");
        System.out.println("Do wyboru c - Celsius  f - Farrenheit  k - Kelvin  r - Rankin");

        while (!dobraLiczba) {
            Scanner scannerConverter = new Scanner(System.in);
            try {
                temperatura = podajLiczbe();    //wiemy już żę jest liczba bo skaner ma zwórócić liczbę i dlaego jest dobraliczba = true
                dobraLiczba = true;
                przypadki(temperatura);
                System.out.println("Czy chcesz przeliczyć jeszcze coś? y/n ");
                String takNie = scannerConverter.next();
                if (takNie.equals("y")) {
                    dobraLiczba = false;
                } else {
                    System.out.println("Zakończytłeś program Converter");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tępy chujcu to nie jest liczba!!!");
            }
        }
    }

    private void przypadki(double temperaturaPobranaNaPrzypadki) {
        Scanner scannerConverter = new Scanner(System.in);
        boolean sprawdzenie = true;
        while (sprawdzenie) {
            System.out.println("Podaj jednostę temp : ");
            String jednostkaTemp = scannerConverter.next();
            switch (jednostkaTemp) {
                case "c":
                    przelicznikZCelc.przeliczStopnie(temperaturaPobranaNaPrzypadki);
                    sprawdzenie = false;
                    break;
                case "f":
                    przelicznikZFarren.przeliczStopnie(temperaturaPobranaNaPrzypadki);
                    sprawdzenie = false;
                    break;
                case "k":
                    przelicznikZKelv.przeliczStopnie(temperaturaPobranaNaPrzypadki);
                    sprawdzenie = false;
                    break;
                case "r":
                    przelicznikZRank.przeliczStopnie(temperaturaPobranaNaPrzypadki);
                    sprawdzenie = false;
                    break;
                default:
                    System.out.println("Tępy chuju zła jednostka");
            }
        }
    }

    private static double podajLiczbe() {
        Scanner scannerConverter = new Scanner(System.in);
        System.out.println("Podaj stopnie ");
        return scannerConverter.nextDouble();
    }
}


