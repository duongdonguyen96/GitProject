package cirleCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "black";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double area = this.getRadius() * this.getRadius() * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        String text = "color: " + this.getColor() + " radius: " + this.getRadius() + " area: " + this.getArea();
        return text;
    }
}
