import java.util.Scanner;
import java.util.regex.Pattern;

public class NameOfClass {

    public static void main(String[] args) {
        checkNameOfClass();
    }


    public static void checkNameOfClass() {
        int count = 0;
        String regex = "^[CAP]{1}[0-9]{4}[GHIKL]{1}$";

        Scanner scanner = new Scanner(System.in);

        while (count <= 5) {
            System.out.println("Nhap ten Class vao de kiem tra:");
            String Class = scanner.nextLine();
            Pattern patternEmail = Pattern.compile(regex);
            if (patternEmail.matcher(Class).find()) {
                System.out.println("Class dung dinh dang");
            } else {
                System.out.println("Class sai dinh dang");
            }
            count++;
        }

    }
}


