import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student0 = new Student("Kien", 30, "Hue");
        Student student1 = new Student("Nam", 6, "Hue");
        Student student2 = new Student("Anh", 38, "Hue");
        Student student3 = new Student("Tung", 8, "Hue");
        List<Student> lists = new ArrayList<>();
        lists.add(student0);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student student : lists) {
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student student : lists) {
            System.out.println(student.toString());
        }
    }

}

