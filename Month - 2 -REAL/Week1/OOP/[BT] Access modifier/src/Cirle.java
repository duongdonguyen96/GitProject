public class Cirle {
    private double radius = 1.0;
    private String color = "red";
    public final float PI = 3.14f;

    public Cirle() {

    }
    
    public Cirle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return this.radius;
    }

    protected double getArea() {
        return this.getRadius() * this.getRadius() * PI;
    }

}
