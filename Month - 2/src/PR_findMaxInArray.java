import java.util.Scanner;

public class PR_findMaxInArray {
    public static void main(String[] args) {
        int n;
        int j;
        int max ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang");
        n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap cac gia tri cua mang");
            array[i] = scanner.nextInt();
        }
        max = array[0];
        for (j=0;j<n;j++) {

            if (max<array[j]) {
                max=array[j];
            }
        }

        System.out.println("Gia tri lon nhat cua mang :"+max);
    }
}

