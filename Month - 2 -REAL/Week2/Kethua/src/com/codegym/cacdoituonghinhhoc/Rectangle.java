package com.codegym.cacdoituonghinhhoc;

public class Rectangle extends Shape {
    public double width = 1.0;
    public double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = this.getLength() * this.getWidth();
        return area;
    }

    public double getPerimeter() {
        double perimeter = (this.getLength() + this.getWidth()) * 2;
        return perimeter;
    }

    @Override
    public String toString() {
        String textRectangle = "A Rectangle with width = " + this.getWidth() + " and length = " + this.getLength() + " which is a subclass of " + super.toString();
        return textRectangle;
    }
}
