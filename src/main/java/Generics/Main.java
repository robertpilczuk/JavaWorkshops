package Generics;

public class Main {
    public static void main(String[] args) {

        Generyczna g= new Generyczna(1,"nietoperz");
        g.wypiszAiB();
        Przykladowa p= new Przykladowa("hiszpańska", "inkwizycja");
        Generyczna g1= new Generyczna(p, "jakiś tekst");
        g1.wypiszAiB();
    }
}
