import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();
        System.out.println(" nhap chi so cua x");
        int x = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println("index :" + x + " co gia tri: " + array[x]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Loi");

        } catch (Exception e) {
            System.out.println("Loi qua troi nang");

        } finally {
            System.out.println("Ket thuc");
        }


    }


    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

}


