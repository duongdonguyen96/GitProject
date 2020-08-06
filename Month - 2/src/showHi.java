import java.util.Scanner;

public class showHi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please wirte your Name");
        String name = scanner.nextLine();
        System.out.println("Hello: "+name);
    }
}
