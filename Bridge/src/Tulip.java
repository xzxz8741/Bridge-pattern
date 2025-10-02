public class Tulip extends Flowers {
    public Tulip(Color color) {
        super(color);
    }

    @Override
    public void makeFlowers() {
        System.out.println("Make a Tulip");
        color.toGiveColor();
    }
}
