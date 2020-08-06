import java.util.Scanner;

public class EX_sumColumn {
    public static void main(String[] args) {
        int height;
        int width;
        int i;
        int j;
        float sum = 0.0f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu cao mang");
        height = scanner.nextInt();
        System.out.println("Nhap chieu rong mang");
        width = scanner.nextInt();
        float[][] array2way = new float[height][width];
        for (i = 0; i < height; i++) {
            for (j = 0; j < width; j++) {
                array2way[i][j] = (float) (Math.random() * 100);
            }

        }
        System.out.println("mang 2 chieu la: ");
        for (i = 0; i < height; i++) {
            for (j = 0; j < width; j++) {
                System.out.print(array2way[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Nhap cot muon tinh tong");
        int column = scanner.nextInt();
        for (i = 0; i < height; i++) {
                sum = (sum + array2way[i][column]);
        }
        System.out.println("Tong cua cot thu"+column +"la: "+sum);
    }
}
