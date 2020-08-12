

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2);
        System.out.println("S is: " + rectangle.getArea());
        double numberRandom = Math.random() * 99 + 1;
        rectangle.resize(numberRandom);
        System.out.println("S new is :" + rectangle.getArea() + " increase " + numberRandom + "%");

    }
}
