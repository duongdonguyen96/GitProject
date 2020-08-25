import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailExample {
    public static void main(String[] args) {
        checkEmail();
    }


    public static void checkEmail() {

        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap email vao de kiem tra:");
            String email = scanner.nextLine();
            Pattern patternEmail = Pattern.compile(regex);
            if (patternEmail.matcher(email).find()) {
                System.out.println("Email dung dinh dang");
                break;
            } else {
                System.out.println("Email sai dinh dang");
            }
        }

    }
}
