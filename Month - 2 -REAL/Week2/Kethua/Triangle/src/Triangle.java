public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        double perimeter = this.getSide1() + this.getSide2() + this.getSide3();
        return perimeter;
    }

    public double getArea() {
        double area = Math.sqrt(this.getPerimeter() / 2 * (this.getPerimeter() / 2 - this.getSide3()) * (this.getPerimeter() / 2 - this.getSide2()) * (this.getPerimeter() / 2 - this.getSide1()));
        return area;
    }

    @Override
    public String toString() {
        String textTriangle = "side1:" + this.getSide1() + " side2:" + this.getSide2() + " side3:" + this.getSide3() + " perimeter:" + this.getPerimeter()
                + " area:" + this.getArea() + super.toString();
        return textTriangle;
    }
}
