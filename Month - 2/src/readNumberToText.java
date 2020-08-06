import java.util.Scanner;

public class readNumberToText {
    public static void main(String[] args) {
        System.out.println("Please write the Number that You want to convert to Text");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <10 && number >=0) {
            switch (number) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 0:
                    System.out.println("zero");
                    break;
            }

        }
        if (number <20 && number >=10) {
            int ones = number%10;
            switch (ones) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eightteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;

            }


        }
        if (number <100 && number >=20) {
            int donvi = number%10;
            int hangchuc = number/10;
            switch (hangchuc) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("fourty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eightty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;

            }
            switch (donvi) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("-one");
                    break;
                case 2:
                    System.out.println("-two");
                    break;
                case 3:
                    System.out.println("-three");
                    break;
                case 4:
                    System.out.println("-four");
                    break;
                case 5:
                    System.out.println("-five");
                    break;
                case 6:
                    System.out.println("-six");
                    break;
                case 7:
                    System.out.println("-seven");
                    break;
                case 8:
                    System.out.println("-eight");
                    break;
                case 9:
                    System.out.println("-nine");
                    break;

            }


        }
        if (number >=100 && number <1000) {
            int hangtram = number/100;
            int socohaichuso = number%100;
            int hangchuc = socohaichuso/10;
            int donvi = socohaichuso%10;
            switch (hangtram) {
                case 1:
                    System.out.print("One hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
                case 0:
                    System.out.print("");
            }
            switch (hangchuc) {
                case 2:
                    System.out.print("-twenty");
                    break;
                case 3:
                    System.out.print("-thirty");
                    break;
                case 4:
                    System.out.print("-fourty");
                    break;
                case 5:
                    System.out.print("-fifty");
                    break;
                case 6:
                    System.out.print("-sixty");
                    break;
                case 7:
                    System.out.print("-seventy");
                    break;
                case 8:
                    System.out.print("-eightty");
                    break;
                case 9:
                    System.out.print("-ninety");
                    break;
                case 1:
                    System.out.print("-ten");

            }

            switch (donvi) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("-one");
                    break;
                case 2:
                    System.out.print("-two");
                    break;
                case 3:
                    System.out.print("-three");
                    break;
                case 4:
                    System.out.print("-four");
                    break;
                case 5:
                    System.out.print("-five");
                    break;
                case 6:
                    System.out.print("-six");
                    break;
                case 7:
                    System.out.print("-seven");
                    break;
                case 8:
                    System.out.print("-eight");
                    break;
                case 9:
                    System.out.print("-nine");
                    break;

            }
        }
        if (number <0 || number >999) {
            System.out.println("out of ability");
        }


    }
}
