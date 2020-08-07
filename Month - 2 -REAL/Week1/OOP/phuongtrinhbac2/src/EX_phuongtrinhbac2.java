import java.util.Scanner;

public class EX_phuongtrinhbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        while (true) {
            try {
                System.out.println("Enter a :");
                a = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhap so di ban");
            }
        }
        while (true) {
            try {
                System.out.println("Enter b :");
                b = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhap so di ban");
            }
        }
        while (true) {
            try {
                System.out.println("Enter c :");
                c = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhap so di ban");
            }
        }
        Phuongtrinhbac2 example1 = new Phuongtrinhbac2(a, b, c);
        if (example1.getDiscriminant() == 0) {
            System.err.println("phuong trinh co nghiem kep r1 = r2: " + example1.getRoot1());
        }
        if (example1.getDiscriminant() > 0) {
            System.err.println("phuong trinh co 2 nghiem: " + "r1 = " + example1.getRoot1() + "va r2 = " + example1.getRoot2());
        }
        if (example1.getDiscriminant() < 0) {
            System.err.println("The equation has no roots");
        }

    }
}







