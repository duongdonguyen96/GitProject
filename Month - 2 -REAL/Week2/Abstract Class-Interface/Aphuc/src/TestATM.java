import java.util.ArrayList;
import java.util.Scanner;

public class TestATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yourChoice = null;
        int inputMoney = 0;
        ATM pepple1 = new ATM();
        System.out.println("Ngan hang ABC xin kinh chao quy khach:");
        System.out.println("1.Nhan phim A de kiem tra tai khoan");
        System.out.println("2.Nhan phim D de nap tien");
        System.out.println("3.Nhan phim W de rut tien");
        System.out.println("4.Nhan phim H de xem lich su 3 lan rut tien");
        System.out.println("5.Nhan phim X de thoat");
        System.out.println("==============================");
        while (yourChoice != "X") {
            System.out.println("Lua chon cua ban");
            yourChoice = scanner.nextLine();
            switch (yourChoice) {
                case "A":
                    pepple1.checkMoney();
                    break;
                case "D":
                    System.out.println("Giao dich nap tien");
                    System.out.println("Vui long nhap so tien");
                    int tiennop = (int) checkMoney(inputMoney);
                    pepple1.increaseMoney(tiennop);
                    break;
                case "W":
                    System.out.println("Giao dich rut tien:");
                    System.out.println("Vui long nhap so tien");
                    int tienrut = (int) checkMoney(inputMoney);

                    if (tienrut > pepple1.getMoney()) {
                        System.out.println("Giao dich khong thanh cong");
                        System.out.println("So du tai khoan cua khach hang la" + pepple1.getMoney());
                        System.out.println("Ban khong the rut so tien lon hon so du tai khoan");
                    } else {
                        pepple1.decreaseMoney(tienrut);
                    }
                    break;
                case "H":
                    pepple1.historyExchange();
                    break;
                case "X":
                    pepple1.exit();
                    break;
                default:
                    System.out.println("Sai du lieu");
                    break;
            }
        }

    }

    public static double checkMoney(int money) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                money = Integer.parseInt(scanner.nextLine());
                if (money > 0) {
                    break;
                } else {
                    System.err.println("sai roi, nhap lai so tien");
                }

            } catch (Exception e) {
                System.err.println("Vui long nhap so tien");
            }
        }
        return money;
    }
}

