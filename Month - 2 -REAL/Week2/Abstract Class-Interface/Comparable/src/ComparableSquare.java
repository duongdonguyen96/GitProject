public class ComparableSquare extends Square implements Comparable<ComparableSquare> {
    public ComparableSquare() {
    }

    public ComparableSquare(double side) {
        super(side);
    }

    public ComparableSquare(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public int compareTo(ComparableSquare o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }

    }
}

