

public class TestCirle {
    public static void main(String[] args) {

        Cirle cirle4 = new Cirle(1.1f);
        System.out.println("S is: " + cirle4.getArea());
        double numberRandom = Math.random() * 99 + 1;

        cirle4.resize(numberRandom);
        System.out.println("S new is :" + cirle4.getArea() + " increase " + numberRandom + "%");

    }
}
