import java.util.Scanner;

public class PR_student {
    public static void main(String[] args) {
        int size;
        float[] arrayStudent;
        int i;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size khong qua 30");
        } while (size > 30);
        arrayStudent = new float[size];
        for (i = 0; i < arrayStudent.length; i++) {
            System.out.println("Nhap diem cua hoc sinh:" + (i + 1));
            arrayStudent[i] = scanner.nextFloat();
        }
        for (i = 0; i < arrayStudent.length; i++) {
            if (arrayStudent[i] >= 5 && arrayStudent[i] <= 10) {
                count++;
            }
        }
        System.out.println("so hoc sinh thi do la: "+count);

    }

}
