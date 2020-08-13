import java.util.ArrayList;
import java.util.Collections;

public class TestComparableCirle {
    public static void main(String[] args) {
        ArrayList<ComparableCircle> list = new ArrayList<>();
        list.add(new ComparableCircle(25.0));
        list.add(new ComparableCircle(15.0));
        list.add(new ComparableCircle(100.0));
        list.add(new ComparableCircle(5.0));
        System.out.println("Mang ban dau:");
        for (ComparableCircle x : list
        ) {
            System.out.println(x.getRadius());

        }
        Collections.sort(list);
        System.out.println("Mang sau:");
        for (ComparableCircle x : list
        ) {
            System.out.println(x.getRadius());

        }

    }
}
