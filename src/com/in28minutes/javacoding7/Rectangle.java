package com.in28minutes.javacoding7;

public class Rectangle extends Shape{

    private final double length;
    private final double width;


    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}
