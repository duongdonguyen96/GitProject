package DAO;

import Entity.File_IO_Entity.FileIO;
import Entity.Student.Student;
import UI.Main;

import java.util.*;
import java.util.regex.Pattern;

public class Student_Implement extends Student implements DAO {
    public static final String NHAP_ID_HOC_VIEN = "Nhap ID hoc vien:";
    public static final String ID_KHONG_TON_TAI = "ID khong ton tai";
    static final String ID_KHONG_TON_TAI1 = "ID khong ton tai";
    static final String VUI_LONG_NHAP_DUNG_DIEM_SO = "Vui long nhap dung diem so";
    public static HashMap<String, Student> studentHashMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public HashMap<Integer, Student> getAllStudent() {
        return null;
    }

    public Student_Implement() {

    }

    @Override
    public void edit() {
        studentHashMap = FileIO.readFile();
        System.out.println(NHAP_ID_HOC_VIEN);
        String id = scanner.nextLine();
        if (isID(id)) {
            System.out.println("Nhap ten moi:");
            String name = scanner.nextLine();
            studentHashMap.get(id).setName(name);
            System.out.println("Sua thong tin thanh cong");
            FileIO.writeFile(studentHashMap);
        } else {
            System.out.println(ID_KHONG_TON_TAI);
        }
    }

    @Override
    public void delete() {
        studentHashMap = FileIO.readFile();
        System.out.println(NHAP_ID_HOC_VIEN);
        String id = scanner.nextLine();
        if (isID(id)) {
            studentHashMap.remove(id);
            System.out.println("Xoa hoc vien thanh cong");
            FileIO.writeFile(studentHashMap);
        } else {
            System.out.println(ID_KHONG_TON_TAI);
        }
    }

    @Override
    public void showInformation() {
        studentHashMap = FileIO.readFile();
        System.out.println(NHAP_ID_HOC_VIEN);
        String id = scanner.nextLine();
        if (isID(id)) {
            System.out.println(studentHashMap.get(id).toString());
        } else {
            System.out.println(ID_KHONG_TON_TAI1);
        }
    }

    @Override
    public void showAll() {
        studentHashMap = FileIO.readFile();
        if (studentHashMap.size() == 0) {
            System.out.println("Khong co hoc vien nao");
        } else {
            for (Map.Entry<String, Student> item : studentHashMap.entrySet()) {
                System.out.println(item.toString());
            }
        }
    }

    @Override
    public void add() {
        studentHashMap = FileIO.readFile();
        Student student = new Student_Implement();
        System.out.println(NHAP_ID_HOC_VIEN);
        String id = scanner.nextLine();
        if (isID(id)) {
            System.out.println("ID da ton tai...");
        } else {
            student.setId(id);
            System.out.println("Nhap ten hoc vien");
            student.setName(scanner.nextLine());
            studentHashMap.put(id, student);
            FileIO.writeFile(studentHashMap);
        }


    }

    @Override
    public void enterMark1() {
        try {
            studentHashMap = FileIO.readFile();
            System.out.println(NHAP_ID_HOC_VIEN);
            String id = scanner.nextLine();
            float mark1;
            if (isID(id)) {
                while (true) {
                    System.out.println("Lan 1: nhap diem he so 1:");
                    mark1 = Float.parseFloat(scanner.nextLine());
                    if (isMark(mark1)) {
                        studentHashMap.get(id).setMark1(mark1);
                        studentHashMap.get(id).setAvgMarks();
                        FileIO.writeFile(studentHashMap);
                        break;
                    } else {
                        System.out.println(VUI_LONG_NHAP_DUNG_DIEM_SO);
                    }
                }
            } else {
                System.out.println(ID_KHONG_TON_TAI);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void enterMark2() {
        try {
            studentHashMap = FileIO.readFile();
            System.out.println(NHAP_ID_HOC_VIEN);
            String id = scanner.nextLine();
            if (isID(id)) {
                while (true) {
                    System.out.println("Lan 2: nhap diem he so 1:");
                    float mark2 = Float.parseFloat(scanner.nextLine());
                    if (isMark(mark2)) {
                        studentHashMap.get(id).setMark2(mark2);
                        studentHashMap.get(id).setAvgMarks();
                        FileIO.writeFile(studentHashMap);
                        break;
                    } else {
                        System.out.println(VUI_LONG_NHAP_DUNG_DIEM_SO);
                    }
                }
            } else {
                System.out.println(ID_KHONG_TON_TAI);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void enterMark3() {
        try {
            studentHashMap = FileIO.readFile();
            System.out.println(NHAP_ID_HOC_VIEN);
            String id = scanner.nextLine();
            if (isID(id)) {
                while (true) {
                    System.out.println("Lan 3: nhap diem he so 2:");
                    float mark3 = Float.parseFloat(scanner.nextLine());
                    if (isMark(mark3)) {
                        studentHashMap.get(id).setMark3(mark3);
                        studentHashMap.get(id).setAvgMarks();
                        FileIO.writeFile(studentHashMap);
                        break;
                    } else {
                        System.out.println(VUI_LONG_NHAP_DUNG_DIEM_SO);
                    }
                }
            } else {
                System.out.println(ID_KHONG_TON_TAI);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void enterMark4() {
        try {
            studentHashMap = FileIO.readFile();
            System.out.println(NHAP_ID_HOC_VIEN);
            String id = scanner.nextLine();
            if (isID(id)) {
                while (true) {
                    System.out.println("Lan 4: nhap diem he so 3:");
                    float mark4 = Float.parseFloat(scanner.nextLine());
                    if (isMark(mark4)) {
                        studentHashMap.get(id).setMark4(mark4);
                        studentHashMap.get(id).setAvgMarks();
                        FileIO.writeFile(studentHashMap);
                        break;
                    } else {
                        System.out.println(VUI_LONG_NHAP_DUNG_DIEM_SO);
                    }
                }
            } else {
                System.out.println(ID_KHONG_TON_TAI);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void sort() {
        studentHashMap = FileIO.readFile();
        List<Student> mapValues = new ArrayList<>(studentHashMap.values());
        Collections.sort(mapValues);
        Collections.reverse(mapValues);
        for (Student student : mapValues) {
            System.out.println(student.toString());
        }

    }

    @Override
    public void display() {
        studentHashMap = FileIO.readFile();
        final String HEADER_CHARACTER =

                "+--------+-------------------------------+--------+--------+--------+--------+----------+\n" +
                        "|ID      |NAME                           |Mark1   |Mark2   | Mark3  | Mark4  |AvrMark   |\n" +
                        "+--------+-------------------------------+--------+--------+--------+--------+----------+";
        final String FOOTER = "+--------+-------------------------------+--------+--------+--------+--------+----------+";
        final String CHARACTER = "|";
        System.out.println("Student Information:");
        System.out.println(HEADER_CHARACTER);

        List<Student> mapValues = new ArrayList<>(studentHashMap.values());
        Collections.sort(mapValues);
        Collections.reverse(mapValues);

        for (Student item : mapValues) {
            System.out.format("| %-7s", item.getId());
            System.out.format("| %-30s", item.getName());
            System.out.format("| %-7s", item.getMark1());
            System.out.format("| %-7s", item.getMark2());
            System.out.format("| %-7s", item.getMark3());
            System.out.format("| %-7s", item.getMark4());
            item.setAvgMarks();
            System.out.format("| %-9s", item.getAvgMarks());
            System.out.println(CHARACTER);
            System.out.println(FOOTER);
        }
    }


    public static boolean isID(String id) {

        String idNumber = String.valueOf(id);
        String regex = "^[0-9]+$";
        Pattern patternID = Pattern.compile(regex);
        while (true) {
            if (patternID.matcher(idNumber).find()) {
                return studentHashMap.containsKey(id);
            } else {
                System.out.println("Khong dung dinh dang");
                Main.showMenu();
            }
            return false;
        }
    }


    public boolean isMark(float mark) {
        return mark >= 0 && mark <= 10;
    }

}



