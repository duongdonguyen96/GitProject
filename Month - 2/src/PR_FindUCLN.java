import java.util.Scanner;

public class PR_FindUCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0 &&b==0) {
            System.out.println("Do not have UCLN");
        }
        if (a==0&&b!=0) {
            System.out.println("UCLN is " +b);
        }
        if (a!=0 &&b==0) {
            System.out.println("UCLN is "+a);
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);

    }
}
