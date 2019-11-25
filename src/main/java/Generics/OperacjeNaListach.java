package Generics;

import java.util.ArrayList;
import java.util.List;

public class OperacjeNaListach {
    public static <V> void wydrukujListe(List<V> lista){
        for(V v: lista){
            System.out.println(v);
        }
    }
    public class ListaStringow {
        ArrayList<String> lista= new ArrayList<>();
//    lista.add("ala");
//    lista.add("ma");
//    lista.add("kota");
//        OperacjeNaListach.wydrukujListe(lista);

    }
}
