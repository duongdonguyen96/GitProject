import java.util.Scanner;

public class PR_convertCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        System.out.println("Enter your choice");
        int yourchoice = scanner.nextInt();
        switch (yourchoice) {
            case 0:
                System.exit(0);
            case 1:
                System.out.println("write fahrenheit");
                double fahrenheit = scanner.nextDouble();
                System.out.print("Celsius is:");
                System.out.println(fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.println("write celsius");
                double celsius = scanner.nextDouble();
                System.out.print("Fahrenheit is:");
                System.out.println(celsiusToFahrenheit(celsius));
                break;


        }


    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius *(9/5 + 32));

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
