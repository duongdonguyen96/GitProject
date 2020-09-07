package DAO;

import Entity.Student.Student;

import java.util.HashMap;

public interface DAO {
    HashMap<Integer, Student> getAllStudent();

    void edit();

    void delete();

    void showInformation();

    void showAll();

    void add();

    void enterMark1();

    void enterMark2();

    void enterMark3();

    void enterMark4();

    void sort();
    void display();
}

