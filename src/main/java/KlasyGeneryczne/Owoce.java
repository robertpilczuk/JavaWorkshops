package KlasyGeneryczne;

public class Owoce {
    public class Apple{

    }
    public class AppleBox{
        private Apple apple;

        public AppleBox(Apple apple) {
            this.apple = apple;
        }

        public Apple getApple() {
            return apple;
        }
    }
    public static class Orange{

    }
    public class OrangeBox{
        private Orange orange;

        public OrangeBox(Orange orange) {
            this.orange = orange;
        }

        public Orange getOrange() {
            return orange;
        }
    }
    public static void main(String[] args) {
        FruitBox fruitBox = new FruitBox(new Orange());
        Orange fruit1 = (Orange) fruitBox.getFruit();
        FruitBox fruitBox1 = new FruitBox(new Appple());
        Apple fruit2 = (Apple) fruitBox.getFruit();
    }
}
