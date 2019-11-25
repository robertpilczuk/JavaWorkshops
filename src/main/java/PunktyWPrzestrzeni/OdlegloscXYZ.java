package PunktyWPrzestrzeni;

public class OdlegloscXYZ {
    Punkt3d punkt1;
    Punkt3d punkt2;

    public OdlegloscXYZ(Punkt3d punkt1, Punkt3d punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
    }
    public double odlegloscWPrzestrzeni3d(){
        return Math.sqrt(Math.pow((punkt1.getX() - punkt2.getX()),2) + Math.pow((punkt1.getY() - punkt2.getY()),2)
                + Math.pow((punkt1.getZ() - punkt2.getZ()),2));
    }
}
