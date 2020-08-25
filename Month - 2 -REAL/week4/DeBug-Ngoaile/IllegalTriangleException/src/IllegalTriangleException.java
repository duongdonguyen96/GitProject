import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            try {
                System.out.println("Nhap side 1:");
                int side1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap side 2:");
                int side2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap side 3:");
                int side3 = Integer.parseInt(scanner.nextLine());

                if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                    throw new ArithmeticException("Do dai canh la 1 so nguyen duong");
                } else if (side1 >= side2 + side3 || side2 >= side1 + side3 || side3 >= side1 + side2) {
                    throw new ArithmeticException("Do dai 2 canh phai lon hon canh con lai");
                } else {
                    System.out.println("side1,side2,side3 la 3 canh cua 1 tam giac");
                    System.out.println("side1 " + side1);
                    System.out.println("side2 " + side2);
                    System.out.println("side3 " + side3);
                    check = true;
                }

            } catch (ArithmeticException e) {
                System.err.println("!Warning: " + e.getMessage());
            }
        }
    }

}
