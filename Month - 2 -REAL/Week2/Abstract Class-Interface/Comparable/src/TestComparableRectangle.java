import java.util.ArrayList;
import java.util.Collections;

public class TestComparableRectangle {
    public static void main(String[] args) {
        ArrayList<ComparableRectangle> list = new ArrayList<>();
        list.add(new ComparableRectangle(25.0, 50.));
        list.add(new ComparableRectangle(15.0, 30.0));
        list.add(new ComparableRectangle(100.0, 200.0));
        list.add(new ComparableRectangle(5.0, 10.0));
        System.out.println("Mang ban dau:");
        for (ComparableRectangle x : list
        ) {
            System.out.println(x.getArea());

        }
        Collections.sort(list);
        System.out.println("Mang sau:");
        for (ComparableRectangle x : list
        ) {
            System.out.println(x.getArea());

        }

    }
}
