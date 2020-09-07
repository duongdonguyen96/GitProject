package UI;
import DAO.Student_Implement;
import java.util.Scanner;

public class Main {
    static final String ADD_STUDENT_BY_1 = "1";
    static final String SHOW_INFORMATION_BY_2 = "2";
    static final String SHOW_ALL_INFORMATION_BY_3 = "3";
    static final String EDIT_INFORMATION_OF_STUDENT_BY_4 = "4";
    static final String DELETE_STUDENT_BY_5 = "5";
    static final String EDIT_MARK_OF_STUDENT_BY_6 = "6";
    static final String SORT_LIST_STUDENT_BY_7 = "7";
    static final String EXIT_PROGRAM_BY_0 = "0";
    public static Student_Implement student = new Student_Implement();

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();

    }

    public static void showMenu() {
        System.out.println("Chao ban den voi truong hoc N:");
        System.out.println("1.Them hoc vien");
        System.out.println("2.Xem thong tin hoc vien");
        System.out.println("3.Xem danh sach hoc vien");
        System.out.println("4.Sua thong tin hoc vien");
        System.out.println("5.Xoa hoc vien");
        System.out.println("6.Nhap - Sua diem hoc vien");
        System.out.println("7.Xep loai hoc vien");
        System.out.println("0.Thoat");

        String yourChoice;
        while (true) {
            System.out.println("Vui long nhap lua chon :");
            yourChoice = scanner.nextLine();

            switch (yourChoice) {
                case ADD_STUDENT_BY_1:
                    student.add();
                    break;
                case SHOW_INFORMATION_BY_2:
                    student.showInformation();
                    break;
                case SHOW_ALL_INFORMATION_BY_3:
                    student.showAll();
                    break;
                case EDIT_INFORMATION_OF_STUDENT_BY_4:
                    student.edit();

                    break;
                case DELETE_STUDENT_BY_5:
                    student.delete();
                    break;
                case EDIT_MARK_OF_STUDENT_BY_6:
                    enterMarkOfStudent();
                    break;
                case SORT_LIST_STUDENT_BY_7:
//                    student.sort();
                    student.display();
                    break;
                case EXIT_PROGRAM_BY_0:
                    exitProgram();
                    break;
                default:
                    System.out.println("Vui long nhap dung thong tin");
            }

        }

    }

    private static void exitProgram() {
        System.out.println("Tam biet quy khach....");
        System.exit(0);
    }

    private static void enterMarkOfStudent() {
        System.out.println("1.Nhap diem hoc vien lan 1");
        System.out.println("2.Nhap diem hoc vien lan 2");
        System.out.println("3.Nhap diem hoc vien lan 3");
        System.out.println("4.Nhap diem hoc vien lan 4");
        System.out.println("0.Quay lai Menu");

        String choice;
        while (true) {
            System.out.println("Nhap lua chon:");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    student.enterMark1();
                    break;
                case "2":
                    student.enterMark2();
                    break;
                case "3":
                    student.enterMark3();
                    break;
                case "4":
                    student.enterMark4();
                    break;
                case "0":
                    showMenu();
                    break;
                default:
                    System.out.println("Vui long nhap dung thong tin");
            }
            enterMarkOfStudent();

        }

    }
}
