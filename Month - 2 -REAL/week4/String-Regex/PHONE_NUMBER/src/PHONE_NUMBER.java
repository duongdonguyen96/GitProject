import java.util.Scanner;
import java.util.regex.Pattern;

public class PHONE_NUMBER {
    public static void main(String[] args) {
        checkPhoneNumber();
    }


    public static void checkPhoneNumber() {
        int count = 0;
        String regex = "^[\\(][0-9]{2}[\\)][\\-][\\(][0]{1}[0-9]{9}[\\)]$";

        Scanner scanner = new Scanner(System.in);

        while (count <= 5) {
            System.out.println("Nhap Phone Number vao de kiem tra:");
            String Class = scanner.nextLine();
            Pattern patternPhoneNumber = Pattern.compile(regex);
            if (patternPhoneNumber.matcher(Class).find()) {
                System.out.println("Phone Number dung dinh dang");
            } else {
                System.out.println("Phone Number sai dinh dang");
            }
            count++;
        }

    }
}





