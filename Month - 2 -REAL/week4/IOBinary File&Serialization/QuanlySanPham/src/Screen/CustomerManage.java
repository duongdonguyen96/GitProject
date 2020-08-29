package Screen;

import Common.FuntionFileTxt;
import Model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManage {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> productList = new ArrayList<>();


    public static void main(String[] args) {

        showMenu();

    }

    public static void showMenu() {
        System.out.println("Please choose");
        System.out.println("1.Them san pham");
        System.out.println("2.Hien thi tat ca san pham");
        System.out.println("3.Xoa san pham");
        System.out.println("4.Chinh sua san pham");
        System.out.println("5.Thoat");

        String yourChoice = scanner.nextLine();
        switch (yourChoice) {
            case "1":
                addNewProduct();
                break;
            case "2":
                showAllInformationProduct();
                break;
            case "3":
                break;
            case "4":
                break;
            case "0":
                exit();
                break;
            default:
                System.out.println("Error....! Please choice again");
                System.out.println("Enter to continue.....");
                scanner.nextLine();
                showMenu();

        }

    }


    private static void addNewProduct() {
        productList = FuntionFileTxt.sendFileToListStudent();
        Product product = new Product();
        System.out.println("Enter ID:");
        product.setId(scanner.nextLine());
        System.out.println("Enter name:");
        product.setName(scanner.nextLine());
        System.out.println("Enter Producer:");
        product.setProducer(scanner.nextLine());
        System.out.println("Enter price:");
        product.setPrice(scanner.nextLine());
        System.out.println("Enter other description");
        product.setOtherDescription(scanner.nextLine());
        productList.add(product);
        FuntionFileTxt.writeProductToFileText(productList);


        System.out.println("Add new Product complete ...Enter to continue.....");
        scanner.nextLine();
        showMenu();


    }

    private static void showAllInformationProduct() {
        productList = FuntionFileTxt.sendFileToListStudent();
        for (Product product : productList) {
            System.out.println("________________________");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Producer: " + product.getProducer());
            System.out.println("Price: " + product.getPrice());
            System.out.println("OtherDescription: " + product.getOtherDescription());
            System.out.println("________________________");


        }


        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showMenu();
    }

    private static void getInformatinProduct() {
        for (int i = 0; i < productList.size(); i++)
            System.out.println("ID" + productList.get(i));
    }

    private static void exit() {
        System.out.println("Good byeeeeeee....! See you soon");
        System.exit(1);
    }
}
