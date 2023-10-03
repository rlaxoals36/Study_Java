package com.in28minutes.javacoding7;

import java.util.ArrayList;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {

        Operation addoperation = new Add();
        System.out.println(addoperation.perform(3,4));
        Operation suboperation = new Subtract();
        System.out.println(suboperation.perform(4,5));
        Operation divoperation = new Divide();
        System.out.println(divoperation.perform(5,5));

        Shape circle = new Circle("Circle",5);
        circle.displayInfo();
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle("Rectangle", 4, 5);
        rectangle.displayInfo();
        System.out.println(rectangle.calculateArea());

        List<Integer> list = List.of(101,102,103,104,105);
        List<Integer> newlist = new ArrayList<>(list);
        newlist.indexOf(101);
        System.out.println(newlist);
        newlist.remove(Integer.valueOf(101));
        System.out.println(newlist);



    }
}
