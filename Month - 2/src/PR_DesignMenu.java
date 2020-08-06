import java.util.Scanner;

public class PR_DesignMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int yourchoice;
        System.out.println("Menu");
        System.out.println("1.Draw the triangle");
        System.out.println("2.Draw the square");
        System.out.println("3.Draw the rectangle");
        System.out.println("0.Exit");
        System.out.println("Enter your choice");


        while (true) {
            yourchoice = scanner.nextInt();
            switch (yourchoice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                default:
                    System.out.println("No choice!");
            }


        }
    }
}

