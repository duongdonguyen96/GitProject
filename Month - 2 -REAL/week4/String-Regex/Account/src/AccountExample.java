import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountExample {

    public static void main(String[] args) {
        checkAccount();
    }


    public static void checkAccount() {
        int count = 0;
        String regex = "^[_a-z0-9]{6,}$";

        Scanner scanner = new Scanner(System.in);

        while (count <= 5) {
            System.out.println("Nhap account vao de kiem tra:");
            String email = scanner.nextLine();
            Pattern patternEmail = Pattern.compile(regex);
            if (patternEmail.matcher(email).find()) {
                System.out.println("Account dung dinh dang");
            } else {
                System.out.println("Account sai dinh dang");
            }
            count++;
        }

    }
}

