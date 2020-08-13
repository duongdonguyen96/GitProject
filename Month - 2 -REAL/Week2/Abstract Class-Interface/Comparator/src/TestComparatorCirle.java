
import java.util.Arrays;
import java.util.Comparator;

public class TestComparatorCirle {
    public static void main(String[] args) {
        Cirle[] cirles = new Cirle[4];
        cirles[0] = new Cirle(10.0);
        cirles[1] = new Cirle(25.0);
        cirles[2] = new Cirle(16.0);
        cirles[3] = new Cirle(17.0);
        System.out.println("Mang ban dau:");
        for (Cirle x : cirles
        ) {
            System.out.println(x.getRadius());

        }
        Comparator circleComparator = new ComparatorCircle();
        Arrays.sort(cirles, circleComparator);
        System.out.println("Mang sau:");
        for (Cirle x : cirles
        ) {
            System.out.println(x.getRadius());

        }

    }
}
