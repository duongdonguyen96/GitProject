import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiTangDan_LienTiep_DaiNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> maxList = new LinkedList<>();
        System.out.println("Nhap vao chuoi :");
        String string = scanner.nextLine();


        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int k = i + 1; k < string.length(); k++) {
                if (string.charAt(k) > list.getLast()) {
                    list.add(string.charAt(k));
                } else {
                    break;
                }
            }
            if (list.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(list);
            }
            list.clear();
        }
        System.out.println("Chuoi tang dan");
        System.out.println(maxList);

    }
}
