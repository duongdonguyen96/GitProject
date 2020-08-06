import java.util.Arrays;
import java.util.Scanner;

public class EX_deleteElementInArray {
    public static void main(String[] args) {
        int i;
        int j;

        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 100,100, 30, 30, 9};
        System.out.println("Nhap delete number: ");
        int deleteNumber = scanner.nextInt();
        for (i = 0; i < array.length; i++) {
            if (array[i] == deleteNumber) {
                System.out.println("index_delete la :" + i);
                for (j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[j] = 0;
                i--;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
