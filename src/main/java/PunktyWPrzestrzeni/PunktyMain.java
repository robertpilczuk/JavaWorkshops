package PunktyWPrzestrzeni;

public class PunktyMain {
    public static void main(String[] args) {

        Punkt2d jakisPunkt1 = new Punkt2d(1,3);
        Punkt2d jakisPunkt2 = new Punkt2d(2,3);
        OdlegloscXY pierwszaOdl = new OdlegloscXY(jakisPunkt1,jakisPunkt2);

        System.out.println(pierwszaOdl.odlegloscWPrzestrzeni());


        Punkt3d jakisPunkt3 = new Punkt3d(2.4,3.2,4.5);
        Punkt3d jakisPunkt4 = new Punkt3d(1.4,2.2,3.5);
        OdlegloscXYZ odlegloscXYZ = new OdlegloscXYZ(jakisPunkt3,jakisPunkt4);

        System.out.println(odlegloscXYZ.odlegloscWPrzestrzeni3d());
    }
}
