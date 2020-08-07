
import java.util.Scanner;

public class Array2way {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        int n;
        int sum = 0;

        while (true) {
            try {
                System.out.println("Nhap kich co ma tran(n x n): ");
                n = Integer.parseInt(scanner.nextLine());
                if (n > 0) {
                    break;
                } else {
                    System.out.println("nhap lai so to hon");
                }
            } catch (Exception e) {
                System.out.println("Nhap so di ban");
            }
        }
        int[][] array2way = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                array2way[i][j] = ((int) (Math.random() * (90 - 10) + 10));
            }
        }
        System.out.println("mang la: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array2way[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("1. Tính tổng các số chẵn trong ma trận");
        System.out.println("2. Tính tổng các giá trị trên đường chéo chính");
        System.out.println("3. Tính tổng các giá trị trên đường chéo phụ");
        System.out.println("4. Tính tổng các giá trị trên đường biên");
        System.out.println("5. Hiển trị ma trận tam giác dưới");
        System.out.println("6. Hiển thị ma trân tam giác trên");
        System.out.println("7.lucky menu");
        System.out.println("0.Exit");
        System.out.println("Your choice");
        int yourChoice = scanner.nextInt();
        switch (yourChoice) {
            case 1:
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        if (array2way[i][j] % 2 == 0) {
                            sum = sum + array2way[i][j];
                        }
                    }
                }
                System.out.println("Tong la :" + sum);
                break;
            case 2:
                for (i = 0; i < n; i++) {
                    sum = sum + array2way[i][i];
                }
                System.out.println("Tong cac gia tri tren duong cheo chinh: " + sum);
                break;
            case 4:
                //hang1
                int sum1 = 0;
                for (j = 0; j < n; j++) {
                    sum1 = sum1 + array2way[0][j];
                }
                //hang cuoi
                int sum2 = 0;
                for (j = 0; j < n; j++) {
                    sum2 = sum2 + array2way[n - 1][j];
                }
                //cot1
                int sum3 = 0;
                for (i = 0; i < n; i++) {
                    sum3 = sum3 + array2way[i][0];
                }
                //cot cuoi
                int sum4 = 0;
                for (i = 0; i < n; i++) {
                    sum4 = sum4 + array2way[i][n - 1];
                }
                sum = sum1 + sum2 + sum3 + sum4 - array2way[0][0] - array2way[0][n - 1] - array2way[n - 1][n - 1] - array2way[n - 1][0];
                System.out.println("tong duong bien: " + sum);
                break;
            case 3:
                for (i = 0; i < n; i++) {
                    sum = sum + array2way[i][n - i - 1];
                }
                System.out.println("tong duong cheo phu: " + sum);
            case 5:
                for (i = 0; i < n; i++) {
                    for (j = 0; j <= i; j++) {
                        System.out.print(array2way[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 6:
                for (i = 0; i < n; i++) {
                    for (j = 0; j <= n - i - 1; j++) {
                        System.out.print(array2way[i][j] + " ");
                    }

                    System.out.println();
                }
                break;
            case 7:
                System.err.println("I love youuuuu, I love youuuu soooooooo ầu ầu aauuuu... Khoanh khac cho a nhan ra..... I loveeee youuuuuu soooooo auuuuu auuuua auuu auuu");

        }
    }
}
