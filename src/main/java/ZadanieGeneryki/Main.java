package ZadanieGeneryki;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Generics1<Integer,Integer[],Integer> gene = new Generics1<Integer, Integer[], Integer>();
        gene.addToT(34);
        gene.addToT(45);
        gene.addToT(45);
        gene.addToT(4120);
        System.out.println(gene.size());
        System.out.println(Arrays.toString(gene.getElements()));



//        Generics<Integer, Integer[], Integer> gene = new Generics<Integer, Integer[], Integer>();
//        Generics<String, String[], Integer> gene1 = new Generics<String, String[], Integer>();
//        Generics<String, String[], Double> gene2 = new Generics<String, String[], Double>();
//        gene2.addToT("sdfsd");
//        gene2.addToT("sdfsd");
//        gene2.addToT("sdfsd");
//        gene2.addToT("sdfsd");
//        System.out.println(gene2.size());
//        gene.addToT(54);
//        gene.addToT(543);
//        System.out.println(gene.size());
//        gene1.addToT("chuj dupa");
//        System.out.println(gene1.size());

    }
}
