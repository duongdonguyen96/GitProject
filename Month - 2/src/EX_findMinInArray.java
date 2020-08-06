import java.util.Arrays;
import java.util.Scanner;

public class EX_findMinInArray {
    public static void main(String[] args) {
        int size;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size");
        size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("nhap phan tu cua mang");
        for (i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang la: " + Arrays.toString(array));
        System.out.print("Min la : ");
        System.out.println( findMin(array));

    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
