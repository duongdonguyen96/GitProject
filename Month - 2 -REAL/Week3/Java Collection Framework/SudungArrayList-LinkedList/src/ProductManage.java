import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManage {
    public static final int ADD_PRODUCT_BY_1 = 1;
    public static final int EDIT_INFORMATION_OF_PRODUCT_BY_2 = 2;
    public static final int DELETE_PRODUCT_BY_3 = 3;
    public static final int SHOW_ALL_PRODUCT_BY_4 = 4;
    public static final int FIND_PRODUCT_BY_5 = 5;
    public static final int SORT_INCREASE_BY_6 = 6;
    public static final int SORT_DECREASE_BY_7 = 7;
    public static final int EXIT_BY_0 = 0;
    public static boolean checkID = false;
    public static boolean checkName = false;
    public static int index;
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> productsList = new ArrayList<>();


    public static void main(String[] args) {
        int yourChoice = 10;
        while (yourChoice != 0) {
            showMenu();
            System.out.println("Nhap lua chon");
            yourChoice = Integer.parseInt(scanner.nextLine());
            switch (yourChoice) {
                case ADD_PRODUCT_BY_1:
                    inputInformation();
                    break;
                case EDIT_INFORMATION_OF_PRODUCT_BY_2:
                    editInforProduct();
                    break;
                case DELETE_PRODUCT_BY_3:
                    deleteProduct();
                    break;
                case SHOW_ALL_PRODUCT_BY_4:
                    showAllProduct();
                    break;
                case FIND_PRODUCT_BY_5:
                    findProductWithName();
                    break;
                case SORT_INCREASE_BY_6:
                    sortIncrease();
                    break;
                case SORT_DECREASE_BY_7:
                    sortDecrease();
                    break;
                case EXIT_BY_0:
                    exit();
                    break;
                default:
                    System.out.println("Vui long nhap dung thong tin");
            }

        }


    }

    public static void showMenu() {
        System.out.println("1.Them san pham");
        System.out.println("2.Sua thong tin san pham theo ID");
        System.out.println("3.Xoa san pham theo ID");
        System.out.println("4.Hien thi danh sach san pham");
        System.out.println("5.Tim kiem san pham theo ten");
        System.out.println("6.Sap xep san pham tang dan");
        System.out.println("7.Sap xep san pham giam dan");
        System.out.println("0.Thoat khoi chuong trinh");
        System.out.println("==================================");
    }

    public static void inputInformation() {
        System.out.println("Them san pham:");
        System.out.println("Nhap ten san pham:");
        String name = scanner.nextLine();
        System.out.println("Nhap ID san pham:");
        int ID = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gia san pham:");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(name, ID, price);
        productsList.add(product);
        System.out.println("Them san pham " + name + " thanh cong");

    }

    public static boolean isID(int id) {
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId() == id) {
                index = i;
                checkID = true;
                break;
            } else {
                checkID = false;
            }
        }
        return checkID;
    }

    public static void editInforProduct() {
        System.out.println("Nhap ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (isID(id)) {
            System.out.println("Sua Ten san pham:");
            productsList.get(index).setName(scanner.nextLine());
            System.out.println("Sua gia tien san pham:");
            productsList.get(index).setPrice(Integer.parseInt(scanner.nextLine()));
            System.out.println("Sua thong tin san pham thanh cong");
        } else {
            System.out.println(" ID khong ton tai");
        }
    }

    public static void deleteProduct() {
        System.out.println("Xoa san pham:");
        System.out.println("Nhap ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (isID(id)) {
            productsList.remove(index);
            System.out.println("Xoa san pham thanh cong");
        } else {
            System.out.println("ID khong ton tai");
        }

    }

    public static void showAllProduct() {
        for (Product product : productsList) {
            System.out.println(product.toString());
        }
    }

    public static void findProductWithName() {
        System.out.println("Tim kiem san pham:");
        System.out.println("Nhap ten:");
        String name = scanner.nextLine();
        if (isName(name)) {
            System.out.println(productsList.get(index));
        } else {
            System.out.println("khong co trong danh sach");
        }

    }

    public static boolean isName(String name) {
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getName().equals(name)) {
                index = i;
                checkName = true;
                break;
            } else {
                checkName = false;
            }
        }
        return checkName;

    }

    public static void sortIncrease() {
        System.out.println("Sap xep theo gia tang dan: ");
        Collections.sort(productsList);
        System.out.println(productsList);
    }

    public static void sortDecrease() {
        System.out.println("Sap xep giam dan");
        Collections.sort(productsList);
        Collections.reverse(productsList);
        System.out.println(productsList);
    }

    public static void exit() {
        System.out.println("Chao tam biet");
        System.exit(0);
    }
}
