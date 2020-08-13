import java.util.Comparator;

public class ComparatorCircle implements Comparator<Cirle> {
    public ComparatorCircle() {
    }


    @Override
    public int compare(Cirle o1, Cirle o2) {
        if (o1.getRadius() > o2.getRadius()) {
            return 1;
        } else if (o1.getRadius() < o2.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}

