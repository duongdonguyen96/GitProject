
import java.util.Scanner;

public class EX_findElementBiggestInArray2way {

    public static void main(String[] args) {
        int height;
        int width;
        int i;
        int j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu cao mang");
        height = scanner.nextInt();
        System.out.println("Nhap chieu rong mang");
        width = scanner.nextInt();
        float[][] array2way = new float[height][width];
        for (i=0;i<height;i++) {
            for (j=0;j<width;j++) {
                array2way[i][j]= (float) (Math.random()*100);
            }

        }
        System.out.println("mang 2 chieu la: ");
        for (i=0;i< height;i++) {
            for (j=0;j< width;j++) {
                System.out.print(array2way[i][j] + " ");
            }
            System.out.println();
        }

        float max = array2way[0][0];
        for (i = 0; i < height; i++) {
            for (j = 0; j < width; j++) {
                if (array2way[i][j] > max) {
                    max = array2way[i][j];
                }
            }
        }
        System.out.println("song lon nhat la: " +max);
    }
}
