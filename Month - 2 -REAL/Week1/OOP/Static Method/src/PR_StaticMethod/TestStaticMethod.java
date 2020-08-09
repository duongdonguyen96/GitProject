package PR_StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyen");
        Student student2 = new Student(2, "Duong");
        Student student3 = new Student(3, "Do");
        Student.change();
        student1.display();
        student2.display();
        student3.display();
    }
}

