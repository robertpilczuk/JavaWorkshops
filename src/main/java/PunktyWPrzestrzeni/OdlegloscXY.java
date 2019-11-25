package PunktyWPrzestrzeni;

public class OdlegloscXY {
    Punkt2d punkt1;
    Punkt2d punkt2;

    public OdlegloscXY(Punkt2d punkt1, Punkt2d punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
    }
    public double odlegloscWPrzestrzeni(){
        return Math.sqrt(Math.pow((punkt1.getX() - punkt2.getX()),2) + Math.pow((punkt1.getY() - punkt2.getY()),2));

    }
}
