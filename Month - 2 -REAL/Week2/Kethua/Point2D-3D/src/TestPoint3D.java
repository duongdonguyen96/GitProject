import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D1 = new Point3D();
        System.out.println(Arrays.toString(point3D1.getXYZ()));
        Point3D point3D2 = new Point3D(10.1f, 10.2f, 10.3f);
        System.out.println(point3D2);
        Point3D point3D3 = new Point3D(10.5f);
        System.out.println(point3D3);
        point3D3.setXYZ(10.9f, 10.4f, 10.5f);
        System.out.println(point3D3);
    }


}
