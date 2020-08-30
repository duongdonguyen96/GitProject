package Screen;

import Common.FuntionFileTxt;
import Model.Product;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerManage {
    public static int index;
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> productList = new ArrayList<>();


    public static void main(String[] args) {

        showMenu();

    }

    public static void showMenu() {
        System.out.println("1.Them san pham");
        System.out.println("2.Hien thi tat ca san pham");
        System.out.println("3.Xoa san pham");
        System.out.println("4.Chinh sua san pham");
        System.out.println("5.Xem thong tin san pham");
        System.out.println("0.Thoat");
        System.out.println("Please choose:");

        String yourChoice = scanner.nextLine();
        switch (yourChoice) {
            case "1":
                addNewProduct();
                break;
            case "2":
                showAllInformationProduct();
                break;
            case "3":
                deleteProduct();
                break;
            case "4":
                editInformationProduct();
                break;
            case "0":
                exit();
                break;
            case "5":
                showInformationProduct();
            default:
                System.out.println("! Please choice again");
                System.out.println("Enter to continue.....");
                scanner.nextLine();
                showMenu();

        }

    }

    private static void addNewProduct() {
        productList = FuntionFileTxt.sendFileToListStudent();
        Product product = new Product();
        //ID
        while (true) {
            System.out.println("Enter ID:");
            String id = scanner.nextLine();
            if (isValidateID(id)) {
                if (isID(id)) {
                    System.out.println("The id already exists");
                } else {
                    product.setId(id);
                    break;
                }
            } else {
                System.out.println("ID is Wrong format");
            }
        }
        //PRICE
        while (true) {
            System.out.println("Enter price:");
            String price = scanner.nextLine();
            if (isValidatePrice(price)) {
                product.setPrice(price);
                break;

            } else {
                System.out.println("Price is Wrong format");
            }
        }
        System.out.println("Enter name:");
        product.setName(scanner.nextLine());
        System.out.println("Enter Producer:");
        product.setProducer(scanner.nextLine());
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


    private static boolean isID(String id) {
        productList = FuntionFileTxt.sendFileToListStudent();
        for (int i = 0; i < productList.size(); i++) {
            if (id.equals(productList.get(i).getId())) {
                index = i;
                return true;
            }
        }
        return false;

    }


    private static void deleteProduct() {
        System.out.println("Enter ID:");
        String id = scanner.nextLine();
        if (isID(id)) {
            productList.remove(index);
            System.out.println("Delete Product succesfully");
            FuntionFileTxt.writeProductToFileText(productList);
        } else {
            System.out.println("Do not have ID in list ");
        }

        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showMenu();

    }


    private static void showInformationProduct() {
        System.out.println("Enter ID:");
        String id = scanner.nextLine();
        if (isID(id)) {
            System.out.println("________________________");
            System.out.println("ID: " + productList.get(index).getId());
            System.out.println("Name: " + productList.get(index).getName());
            System.out.println("Producer: " + productList.get(index).getProducer());
            System.out.println("Price: " + productList.get(index).getPrice());
            System.out.println("OtherDescription: " + productList.get(index).getOtherDescription());
            System.out.println("________________________");

        } else {
            System.out.println("Do not have ID in list ");
        }
    }

    private static void editInformationProduct() {
        System.out.println("Enter ID:");
        String id = scanner.nextLine();
        if (isID(id)) {
            System.out.println("1: ID = " + productList.get(index).getId());
            System.out.println("2: Name = " + productList.get(index).getName());
            System.out.println("3: Producer =" + productList.get(index).getProducer());
            System.out.println("4: Price = " + productList.get(index).getPrice());
            System.out.println("5: Description = " + productList.get(index).getOtherDescription());
            System.out.println("Enter Property you want to change");
            String choseProperty = scanner.nextLine();
            switch (choseProperty) {
                case "1":
                    while (true) {
                        System.out.println("Enter new id:");
                        String newId = scanner.nextLine();
                        if (isID(newId)) {
                            System.out.println("The id already exists");
                        } else {
                            productList.get(index).setId(newId);
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("Enter new name:");
                    String newName = scanner.nextLine();
                    productList.get(index).setName(newName);
                    break;
                case "3":
                    System.out.println("Enter new newProducer:");
                    String newProducer = scanner.nextLine();
                    productList.get(index).setProducer(newProducer);
                    break;
                case "4":
                    System.out.println("Enter new Price:");
                    String newPrice = scanner.nextLine();
                    productList.get(index).setPrice(newPrice);
                    break;
                case "5":
                    System.out.println("Enter new Discription:");
                    String newDescription = scanner.nextLine();
                    productList.get(index).setOtherDescription(newDescription);
                    break;
                default:
                    System.out.println("Please choose Property of Product");
            }

        } else {
            System.out.println("Do not have ID in list ");
        }
        FuntionFileTxt.writeProductToFileText(productList);
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showMenu();

    }


    private static void exit() {
        System.out.println("Good byeeeeeee....! See you soon");
        System.exit(1);
    }

    //    Validate Information Product
    private static boolean isValidateID(String id) {
        String regexID = "^[0-9]+$";
        while (true) {
            Pattern patternID = Pattern.compile(regexID);
            if (patternID.matcher(id).find()) {
                return true;
            } else {
                return false;
            }
        }

    }

    private static boolean isValidatePrice(String price) {
        String regexPrice = "^[0-9]+$";
        while (true) {
            Pattern patternID = Pattern.compile(regexPrice);
            if (patternID.matcher(price).find()) {
                return true;
            } else {
                return false;
            }
        }

    }

}
