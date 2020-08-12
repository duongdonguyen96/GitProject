

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square(10.0);
        System.out.println("S is: " + square.getArea());
        double numberRandom = Math.random() * 99 + 1;
        square.resize(numberRandom);
        System.out.println("S new is :" + square.getArea() + " increase " + numberRandom + "%");

    }
}
