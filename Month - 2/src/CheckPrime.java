import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese write your Number");
        int number = scanner.nextInt();

        boolean check = true;
        if (number < 2) {
           check=false;
        } else {
            for (int i = 2; i < number - 1; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }

        if (check) {
            System.out.println("This number is prime");
        } else {
            System.out.println("This number is not prime");
        }

    }
}
