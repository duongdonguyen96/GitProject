import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your USD");
        float USD = scanner.nextFloat();
        float VND = USD*23060;
        System.out.println("VND is:" +VND);
    }
}
