import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class NoteBookManage {
    public static int index;
    public static ArrayList<NoteBook> noteBooksList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static boolean checkTitle = false;
//    public static Date timeCreat;
//    public static Date timeEdit;

    public static final String CREATE_NOTEBOOK_BY_C = "C";
    public static final String EDIT_NOTEBOOK_BY_U = "U";
    public static final String DELETE_NOTEBOOK_BY_D = "D";
    public static final String SHOW_ALL_NOTEBOOKS_BY_L = "L";
    public static final String SHOW_NOTEBOOK_BY_F = "F";
    public static final String EXIT_BY_E = "E";

    public static void main(String[] args) {
        String yourChoice = null;
        while (yourChoice != "E") {
            showMenu();
            show3Notebook();
            System.out.println("Nhap lua chon cua ban:");
            yourChoice = scanner.nextLine();
            switch (yourChoice) {
                case CREATE_NOTEBOOK_BY_C:
                    inputNotebook();
                    break;
                case EDIT_NOTEBOOK_BY_U:
                    editNotebook();
                    break;
                case DELETE_NOTEBOOK_BY_D:
                    deleteNotebook();
                    break;
                case SHOW_ALL_NOTEBOOKS_BY_L:
                    showAllNotebooks();
                    break;
                case SHOW_NOTEBOOK_BY_F:
                    showNotebook();
                    break;
                case EXIT_BY_E:
                    exit();
                    break;
                default:
                    System.out.println("Nhap lai cho dung");
            }
        }
    }

    public static void showMenu() {
        System.out.println("C. Tao ghi chu");
        System.out.println("U. Sua ghi chu");
        System.out.println("D. Xoa ghi chu");
        System.out.println("L. Xem danh sach ghi chu");
        System.out.println("F. Xem ghi chu");
        System.out.println("E. Thoat");
    }

    public static void exit() {
        System.out.println("Hen gap lai...");
        System.exit(0);
    }

    public static void inputNotebook() {
        if (noteBooksList.size() <= 4) {
            System.out.println("Tao moi ghi chu:");
            System.out.println("Nhap tieu de: ");
            String title = scanner.nextLine();
            System.out.println("Nhap noi dung: ");
            String content = scanner.nextLine();
            String taskList = "";
            System.out.println("Nhap so task can lam: ");
//            String timeCreat, timeEdit;
            Date timeCreat = new Date();
            Date timeEdit = new Date();
            int sizeOfTaskList = Integer.parseInt(scanner.nextLine());
            if (sizeOfTaskList <= 10) {
                for (int i = 0; i < sizeOfTaskList; i++) {
                    System.out.println("Nhap task " + (i + 1) + " :");
                    String task = scanner.nextLine();
                    taskList = taskList + task + ", ";
                }
                NoteBook noteBook = new NoteBook(title, content, taskList, timeCreat, timeEdit);
                noteBooksList.add(noteBook);
                System.out.println("Ban da ghi nhap " + noteBook.getTitle() + " thanh cong....");
            } else {
                System.out.println("Warrning!_So task khong duoc qua 10");
            }
        } else {
            System.out.println("Bo nho da het...");
        }
    }

    public static void showAllNotebooks() {
        for (NoteBook notebook : noteBooksList) {
            notebook.displayInformation();
            System.out.println("____________________________________________");
        }
    }

    public static boolean isTitle(String title) {
        for (int i = 0; i < noteBooksList.size(); i++) {
            if (noteBooksList.get(i).getTitle().equals(title)) {
                index = i;
                checkTitle = true;
                break;
            } else {
                checkTitle = false;
            }
        }

        return checkTitle;
    }

    public static void editNotebook() {
        System.out.println("Nhap tieu de ghi chu can sua:");
        String title = scanner.nextLine();
        if (isTitle(title)) {
            System.out.println("Ban sua noi dung thanh:");
            String content = scanner.nextLine();
            System.out.println("Nhap so task can lam: ");
            int sizeOfTaskList = Integer.parseInt(scanner.nextLine());
            if (sizeOfTaskList <= 10) {
                String taskList = "";
                for (int i = 0; i < sizeOfTaskList; i++) {
                    System.out.println("Nhap task " + (i + 1) + " :");
                    String task = scanner.nextLine();
                    taskList = taskList + task + ", ";
                }
                noteBooksList.get(index).setContent(content);
                noteBooksList.get(index).setTaskList(taskList);
                System.out.println("Ban vua chinh sua ghi chu " + noteBooksList.get(index).getTitle() + " thanh cong");
                Date timeEdit = new Date();
                noteBooksList.get(index).setTimeOfEdit(timeEdit);
            } else {
                System.out.println("Warrning!_So task khong duoc qua 10");
            }
        } else {
            System.out.println("Khong co trong danh sach");

        }
    }

    public static void deleteNotebook() {
        System.out.println("Nhap tieu de ghi chu can xoa:");
        String title = scanner.nextLine();
        if (isTitle(title)) {
            System.out.println("ban vua xoa ghi chu : " + noteBooksList.get(index).getTitle() + " thanh cong");
            noteBooksList.remove(noteBooksList.get(index));
        } else {
            System.out.println("Khong co trong danh sach");
        }
    }

    public static void showNotebook() {
        System.out.println("Nhap tieu de ghi chu can xem:");
        String title = scanner.nextLine();
        if (isTitle(title)) {
            noteBooksList.get(index).displayInformation();
        } else {
            System.out.println("Khong co trong danh sach");
        }
    }

    public static void show3Notebook() {
        int length = noteBooksList.size();
        System.out.println("=============================");
        if (length == 0) {
            System.out.println("___ Hay them noi dung ghi chu___");
        } else if (length < 3) {
            for (int i = 0; i < length; i++) {
                System.out.println((i + 1) + ". " + noteBooksList.get(i).getTitle());
            }
        } else {
            for (int i = length - 1; i > length - 4; i--) {
                System.out.println((length - i) + ". " + noteBooksList.get(i).getTitle());
            }
        }

    }
}

