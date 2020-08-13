
import java.util.Arrays;
import java.util.Comparator;

public class TestComparatorRectangle {
    public static void main(String[] args) {

        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle(10.0, 20);
        rectangles[1] = new Rectangle(25.0, 30);
        rectangles[2] = new Rectangle(16.0, 20);
        rectangles[3] = new Rectangle(17.0, 20);
        System.out.println("Mang ban dau:");
        for (Rectangle x : rectangles
        ) {
            System.out.println(x.getArea());

        }
        Comparator rectanglesComparator = new ComparatorRectangle();
        Arrays.sort(rectangles, rectanglesComparator);
        System.out.println("Mang sau:");
        for (Rectangle x : rectangles
        ) {
            System.out.println(x.getArea());
        }
    }
}
