public class Phuongtrinhbac2 {
    private double a;
    private double b;
    private double c;

    public Phuongtrinhbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta;
        delta = Math.pow(b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double r1;
        r1 = (-this.b + Math.pow(Math.pow(b, 2) - 4 * this.a * this.c, 0.5)) / 2 * a;
        return r1;
    }

    public double getRoot2() {
        double r2;
        r2 = (-this.b - Math.pow(Math.pow(b, 2) - 4 * this.a * this.c, 0.5)) / 2 * a;
        return r2;
    }


}
