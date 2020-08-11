import java.util.Arrays;

class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D1 = new Point2D();
        System.out.println(point2D1);
        Point2D point2D2 = new Point2D(5.6f, 5.7f);
        System.out.println(point2D2);
        point2D2.setXY(2.4f,6.4f);
        System.out.println(Arrays.toString(point2D2.getXY()));
    }
}
