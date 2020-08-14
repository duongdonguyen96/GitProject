import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManage {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Customer> customerlist = new ArrayList<>();

    public static int index;

    public static void main(String[] args) {
        int yourChoice = 1;
        showMenu();
        while (yourChoice != 0) {
            System.err.println("Nhap lua chon cua ban: ");
            yourChoice = Integer.parseInt(scanner.nextLine());
            switch (yourChoice) {
                case 1:
                    System.out.println("Nhap khach hang: ");
                    inputInformation();
                    break;
                case 2:
                    findCustomer();
                    break;
                case 3:
                    findCustomer();
                    break;
                case 4:
                    System.out.println("Thong tin tat ca khach hang: ");
                    showAllCustomers();
                    break;
                case 5:
                    buyGoods();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("Nhap sai cu phap");
            }
        }
    }

    public static void findCustomer() {
        System.out.println("Nhap so dien thoai khach hang:");
        String phone = scanner.nextLine();
        if (checkPhone(phone)) {
            customerlist.get(index).displayInformation();
        } else {
            System.out.println("Khong ton tai khach hang");
        }
    }

    public static boolean checkPhone(String paraPhone) {
        boolean checkPhone = false;
        for (int i = 0; i < customerlist.size(); i++) {
            if (customerlist.get(i).getPhone().equals(paraPhone)) {
                checkPhone = true;
                index = i;
                break;
            } else {
                checkPhone = false;
            }
        }
        return checkPhone;
    }

    public static void showAllCustomers() {
        for (int i = 0; i < customerlist.size(); i++) {
            System.out.println(i + 1);
            customerlist.get(i).displayInformation();
            System.out.println("=====================");
        }
    }

    public static void buyGoods() {
        System.out.println("Nhap so dien thoai khach hang");
        String phone = scanner.nextLine();
        System.out.println("So don hang muon mua");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Thong tin sau khi mua " + amount + " don hang:");
        if (checkPhone(phone)) {
            customerlist.get(index).setOrder(customerlist.get(index).getOrder() + amount);
            customerlist.get(index).displayInformation();
        } else {
            System.out.println("Khong ton tai khach hang....Chon menu de thuc hien tiep..");
        }
    }

    public static void exit() {
        System.out.println("Cho xin them it bai tap cuoi tuan luyen them a eiiiiii :))))");
        System.exit(0);
    }

    public static void inputInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten:");
        String name = scanner.nextLine();
        System.out.println("Nhap dia chi:");
        String address = scanner.nextLine();
        System.out.println("Nhap email:");
        String email = scanner.nextLine();
        System.out.println("Nhap so dien thoai:");
        String phone = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String gender = scanner.nextLine();
//        System.out.println("");
        System.out.println("Nhap khach hang: ");
        Customer customer = new Customer(name, address, phone, email, gender);

        if (checkEmailAndPhone(phone, email)) {
            customerlist.add(customer);
            System.out.println("Ban vua them khach hang " + name + " thanh cong");

        } else {
            System.out.println(" Tai khoan da ton tai... He thong da update....Chon Menu");
            customerlist.get(index).setName(name);
        }
    }

    public static boolean checkEmailAndPhone(String phone, String email) {
        boolean checkPhoneAndEmail = true;
        for (int i = 0; i < customerlist.size(); i++) {
            if (phone.equals(customerlist.get(i).getPhone())
                    && email.equals(customerlist.get(i).getEmail())) {
                index = i;
                checkPhoneAndEmail = false;
                break;
            } else {
                checkPhoneAndEmail = true;
            }
        }
        return checkPhoneAndEmail;
    }

    public static void showMenu() {
        System.out.println("Bam 1 de nhap khach hang");
        System.out.println("Bam 2 de tim kiem khach hang");
        System.out.println("Bam 3 de in thong tin khach hang");
        System.out.println("Bam 4 de in toan bo danh sach khach hang");
        System.out.println("Bam 5 de tang so don hang cho khach");
        System.out.println("Bam 0 de thoat");
        System.out.println("_________________________________");
    }
}

