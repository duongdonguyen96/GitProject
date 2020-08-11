import java.util.Scanner;


public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = 1.0;
        double side2 = 1.0;
        double side3 = 1.0;
        String color;
        while (true) {
            System.out.println("Side1:");
            side1 = CheckSide(side1);
            System.out.println("Side2:");
            side2 = CheckSide(side2);
            System.out.println("Side3:");
            side3 = CheckSide(side3);
            System.out.println("Nhap mau");
            color = scanner.nextLine();
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                Triangle triangle = new Triangle(color, side1, side2, side3);
                System.out.println(triangle);
                break;
            } else {
                System.out.println("sai roi... Nhap lai");
            }
        }
    }

    public static double CheckSide(double side) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                side = Double.parseDouble(scanner.nextLine());
                if (side > 0) {
                    break;
                } else {
                    System.err.println("sai roi, nhap lai");
                }

            } catch (Exception e) {
                System.err.println("Vui long nhap so");
            }
        }
        return side;
    }
}
