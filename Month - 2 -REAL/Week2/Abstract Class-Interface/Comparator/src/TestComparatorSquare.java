import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestComparatorSquare {
    public static void main(String[] args) {

        Square[] squares = new Square[4];
        squares[0] = new Square(10.0);
        squares[1] = new Square(25.0);
        squares[2] = new Square(16.0);
        squares[3] = new Square(17.0);
        System.out.println("Mang ban dau:");
        for (Rectangle x : squares
        ) {
            System.out.println(x.getArea());

        }
        Comparator squareComparator = new ComparatorSquare();
        Arrays.sort(squares, squareComparator);
        System.out.println("Mang sau:");
        for (Rectangle x : squares
        ) {
            System.out.println(x.getArea());
        }
    }
}

