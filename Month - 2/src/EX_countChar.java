import java.util.Scanner;

public class EX_countChar {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        String str="duongdonguyen";
        System.out.println(str);
        char character = 'n';
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)==character) {
                count++;
            }

        }
        System.out.println("so lan xuat hien cua "+character +" is :"+count);


    }
}
