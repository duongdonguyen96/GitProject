public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    public ComparableRectangle() {
    }

    public ComparableRectangle(double width, double length) {
        super(width, length);
    }

    public ComparableRectangle(String color, Boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        }
        if ((this.getArea() < o.getArea())) {
            return -1;
        } else {
            return 0;
        }
    }
}
