import java.util.Arrays;
import java.util.Scanner;

public class BonusElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthArray;
        int i;
        int newNumber;
        int indexNumber;
        while (true) {
            try {
                System.out.println("Nhap do dai mang: ");
                lengthArray = Integer.parseInt(scanner.nextLine());
                if (lengthArray < 0) {
                    System.out.println("Nhap so to hon");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Vui long nhap so nguyen");
            }
        }
        int[] array = new int[lengthArray];
        System.out.println("nhap gia tri cua mang");
        for (i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("array is: " + Arrays.toString(array));
        System.out.println("Nhap gia tri so can them vao mang:");
        newNumber = scanner.nextByte();
        System.out.println("Nhap vi tri can chen:");
        indexNumber = scanner.nextByte();
        int[] arrayNew = new int[lengthArray + 1];
        for (i = 0; i < indexNumber; i++) {
            arrayNew[i] = array[i];
        }
        arrayNew[indexNumber] = newNumber;
        for (i = indexNumber + 1; i < array.length + 1; i++) {
            arrayNew[i] = array[i - 1];
        }
        System.out.print("Mang moi la: " + Arrays.toString(arrayNew));
    }
}
