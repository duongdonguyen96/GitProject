package cirleCylinder;

public class TestCylinder {
    public static void main(String[] args) {

        Cylinder cylinder1 = new Cylinder(10);
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder(20, "Red", 5);
        System.out.println(cylinder2);
        Cylinder cylinder3 = new Cylinder();
        System.out.println(cylinder3);
    }
}
