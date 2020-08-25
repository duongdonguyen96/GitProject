
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Vui long nhap x");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Vui long nhap y");
        int y = Integer.parseInt(scanner.nextLine());
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int tong = x + y;
            int tich = x * y;
            int hieu = x - y;
            int thuong = x / y;
            System.out.println("Tong   :" + tong);
            System.out.println("Tich   :" + tich);
            System.out.println("Hieu   :" + hieu);
            System.out.println("Thuong :" + thuong);

        } catch (Exception e) {
            System.out.println(" Xay ra ngoai le roi");
        }
    }
}
