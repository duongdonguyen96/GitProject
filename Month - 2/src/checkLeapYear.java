import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The year you want to check is:");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("This year is Leap year");
                } else {
                    System.out.println("This year is not Leap year");
                }
            } else {
                System.out.println("This year is Leap year");
            }
        } else {
            System.out.println("This year is not Leap year");
        }


    }
}
