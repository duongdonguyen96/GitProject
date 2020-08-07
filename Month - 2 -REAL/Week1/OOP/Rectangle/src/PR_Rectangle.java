import java.util.Scanner;

public class PR_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width;
        int height;
        int yourChoice;

        while (true) {
            try {
                System.out.println("nhap chieu rong:");
                height = Integer.parseInt(scanner.nextLine());
                if (height > 0) {
                    break;
                } else {
                    System.err.println("Nhap so duong");
                }

            } catch (Exception e) {
                System.out.println("Nhap so");

            }

        }
        while (true) {
            System.out.println("nhap chieu dai:");
            try {
                width = Integer.parseInt(scanner.nextLine());
                if (width > 0) {
                    break;
                } else {
                    System.err.println("Nhap so duong");
                }

            } catch (Exception e) {
                System.out.println("Nhap so");

            }

        }
        Rectangle rectangle1 = new Rectangle(width, height);
        System.out.println("1.Hien thi thong so");
        System.out.println("2.Dien tich");
        System.out.println("3.chu vi");
        ;
        System.out.println("Your Choice :");
        yourChoice = scanner.nextInt();
        switch (yourChoice) {
            case 1:
                System.out.println(rectangle1.display());
                break;
            case 2:
                System.out.println("Dien tich la: " + rectangle1.getArea());
                break;
            case 3:
                System.out.println("chu vi la :" + rectangle1.getPerimeter());
                break;

        }

    }
}
