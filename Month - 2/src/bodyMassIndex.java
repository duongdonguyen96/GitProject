import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your weight");
        float weight = scanner.nextFloat();
        System.out.println("Please write your height");
        float height = scanner.nextFloat();
        float bmi=weight/(height*height);
        if ( bmi <18.5) {
            System.out.println("Underweight");
        }
        if (bmi >= 18.5 && bmi<25) {
            System.out.println("Normal");
        }
        if (25<=bmi && bmi<30) {
            System.out.println("Overweight");
        }
        if (30<bmi) {
            System.out.println("Obese");
        }

    }
}
