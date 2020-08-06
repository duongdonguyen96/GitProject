import java.util.Arrays;
import java.util.Scanner;

public class PR_convertArray {
    public static void main(String[] args) {
        int i, j;
        int temp;
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];

        for (i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu cua mang ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for (j = 0; j < array.length / 2; j++) {
            temp = array[j];
            array[j] = array[array.length-j-1];
            array[array.length-j-1] = temp;

        }
        System.out.println("Mang da dao :" + Arrays.toString(array));

    }
}
