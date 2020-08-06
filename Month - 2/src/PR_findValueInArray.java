import java.util.Scanner;

public class PR_findValueInArray {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        String [] array_class = {"Long","Tin","Hiep","Phuc","Huong","Nguyen"};
        System.out.println("Nhập tên học sinh cần tìm");
        String name = scanner.next();
       boolean check = false;
        for (i=0;i< array_class.length;i++) {
            if (array_class[i].equals(name)) {
                System.out.println("Vi tri thu " +(i+1));
              check=true;
            }
        }
       if (!check) {
           System.out.println("Nghi hoc roi");
       }
    }
}
