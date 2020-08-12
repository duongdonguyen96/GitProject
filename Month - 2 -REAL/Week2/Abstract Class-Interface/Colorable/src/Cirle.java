

public class Cirle extends Shape {
    public double radius = 1.0;
    public final float PI = 3.14f;

    public Cirle() {
    }

    public Cirle(double radius) {
        this.radius = radius;
    }

    public Cirle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = this.getRadius() * this.getRadius() * PI;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * PI * this.getRadius();
        return perimeter;
    }

    @Override
    public String toString() {
        String textCirle = "A Circle with radius = " + this.getRadius() + ", which is a subclass of " + super.toString();


        return textCirle;
    }

}

