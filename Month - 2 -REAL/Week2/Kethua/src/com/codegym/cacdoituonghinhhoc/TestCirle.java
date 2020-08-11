package com.codegym.cacdoituonghinhhoc;

public class TestCirle {
    public static void main(String[] args) {
        Cirle cirle1 = new Cirle();
        System.out.println(cirle1);
        Cirle cirle2 = new Cirle(5.5);
        System.out.println(cirle2);
        Cirle cirle3 = new Cirle("vinh", false, 5.5);
        System.out.println(cirle3);
    }
}
