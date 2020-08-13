import java.util.ArrayList;
import java.util.Collections;

public class TestComparableSquare {
    public static void main(String[] args) {
        ArrayList<ComparableSquare> list = new ArrayList<>();
        list.add(new ComparableSquare(25.0));
        list.add(new ComparableSquare(15.0));
        list.add(new ComparableSquare(100.0));
        list.add(new ComparableSquare(5.0));
        System.out.println("Mang ban dau:");
        for (ComparableSquare x : list
        ) {
            System.out.println(x.getArea());

        }
        Collections.sort(list);
        System.out.println("Mang sau:");
        for (ComparableSquare x : list
        ) {
            System.out.println(x.getArea());

        }
    }
}
