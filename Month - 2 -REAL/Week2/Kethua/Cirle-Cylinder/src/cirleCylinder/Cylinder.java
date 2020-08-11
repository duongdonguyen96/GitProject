package cirleCylinder;

public class Cylinder extends Circle {
    public double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        double volume = this.getArea() * this.getHeight();
        return volume;
    }

    @Override
    public String toString() {
        String textCylinder = "height: " + this.getHeight()+" " + super.toString();
        return textCylinder;
    }
}

