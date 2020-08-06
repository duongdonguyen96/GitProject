import java.util.Scanner;

public class dayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese write your Month:");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month have 31days");
                break;
            case 2:
                System.out.println("This month have 28days or 29days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month have 30days");
            default:
                System.out.println("Please write your Month");

        }

    }
}
