package com.codegym.cacdoituonghinhhoc;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle("red", true, 5.5, 7.4);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(5.4, 5.5);
        System.out.println(rectangle3);
        System.err.println("dien tich hinh chu nhat 3: "+rectangle3.getArea());

    }
}
