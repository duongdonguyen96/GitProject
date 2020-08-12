
public class TestAll {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Square(10.0);
        shape[1] = new Cirle(10.0);
        shape[2] = new Rectangle(10.0, 5.0);

        for (Shape shapehihi : shape) {
            if (shapehihi instanceof Square) {
                ((Square) shapehihi).howtoColor();
                System.out.println("S square: " + ((Square) shapehihi).getArea());
            } else if (shapehihi instanceof Cirle) {
                System.out.println("S Cirle: " + ((Cirle) shapehihi).getArea());
            } else if (shapehihi instanceof Rectangle) {
                System.out.println("S Reactangle: " + ((Rectangle) shapehihi).getArea());
            }
        }
    }
}

