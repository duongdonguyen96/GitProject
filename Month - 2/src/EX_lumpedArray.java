import java.util.Arrays;
import java.util.Scanner;

public class EX_lumpedArray {
    public static void main(String[] args) {
        int i;
        Scanner scanner= new Scanner(System.in);
        int [] array1 = new int [2];
        int [] array2 = new int [3];
        int [] array3=new int[5];
        System.out.println("Nhap gia tri cho array1");
        for (i=0;i< array1.length;i++) {
            array1[i]= scanner.nextInt();
        }
        System.out.println("Nhap gia tri cho array2");
        for (i=0;i< array2.length;i++) {
            array2[i]= scanner.nextInt();
        }
        for (i=0;i< array1.length;i++) {
            array3[i] =array1[i];
        }
        for (i=0;i< array2.length;i++) {
            array3[array1.length+i]=array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));




    }
}
