package com.codegym.cacdoituonghinhhoc;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());
        Shape shape2 = new Shape("red", false);
        System.out.println(shape2.toString());
    }
}
