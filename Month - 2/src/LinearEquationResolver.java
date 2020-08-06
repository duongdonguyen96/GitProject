import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float x;
        Scanner scanner = new Scanner(System.in);
//        ax+b=0
        System.out.println("Enter a");
        float a = scanner.nextFloat();
        System.out.println("Enter b");
        float b = scanner.nextFloat();
        if (a==0) {
            if(b==0) {
                System.out.println("have countless x");
            }else {
                System.out.println("do not righ");
            }
        } else {
            x=-b/a;
            System.out.println("x is:"+x);

        }
    }
}
