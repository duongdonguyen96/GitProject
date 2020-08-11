package com.codegym.cacdoituonghinhhoc;

public class TestSquare {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(5.6);
        System.out.println(square2);
        Square square3 = new Square("white", false, 10.1);
        System.out.println(square3);
    }
}
