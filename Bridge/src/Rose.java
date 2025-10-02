public class Rose extends Flowers{
    public Rose(Color color) {
        super(color);
    }

    @Override
    public void makeFlowers() {
        System.out.println("Make a Rose");
        color.toGiveColor();
    }
}
