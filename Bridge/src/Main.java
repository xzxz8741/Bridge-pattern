public class Main  {
	public static void main(String[] args) {
    Flowers flowers = new Rose(new White());
    Flowers flowers1 = new Tulip(new Red());
    flowers.makeFlowers();
    flowers1.makeFlowers();
    }
}