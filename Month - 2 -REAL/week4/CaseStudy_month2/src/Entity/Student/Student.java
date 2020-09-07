package Entity.Student;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private float mark1;
    private float mark2;
    private float mark3;
    private float mark4;
    private float avgMarks;

    public Student() {

    }

    public Student(String id, String name, float mark1, float mark2, float mark3, float mark4, float avgMarks) {
        this.id = id;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.avgMarks = avgMarks;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark1() {
        return mark1;
    }

    public void setMark1(float mark1) {
        this.mark1 = mark1;
    }

    public float getMark2() {
        return mark2;
    }

    public void setMark2(float mark2) {
        this.mark2 = mark2;
    }

    public float getMark3() {
        return mark3;
    }

    public void setMark3(float mark3) {
        this.mark3 = mark3;
    }

    public float getMark4() {
        return mark4;
    }

    public void setMark4(float mark4) {
        this.mark4 = mark4;
    }

    public float getAvgMarks() {
        return avgMarks;
    }

    public void setAvgMarks() {
        this.avgMarks = (this.mark1 + this.mark2 + this.mark3 * 2 + this.mark4 * 3) / 7;
    }

    @Override
    public String toString() {
        return
                "id=" + id + ", name=" + name  + ", " +
                        "mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", " +
                        "mark4=" + mark4 + ", avgMarks=" + avgMarks;
    }



    @Override
    public int compareTo(Student o) {
        if (this.getAvgMarks() == o.getAvgMarks()) {
            return 0;
        } else if (this.getAvgMarks() > o.getAvgMarks()) {
            return 1;
        } else {
            return -1;
        }
    }
}
