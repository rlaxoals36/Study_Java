package com.in28minutes.selfstudy;

public class MenuStudy {

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    private int number1;
    private int number2;
    public MenuStudy(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void add() {
        System.out.println(number1 + number2);
    }

    public void subtract() {
        System.out.println(number1 - number2);
    }

    public void divide() {
        System.out.println(number1 / number2);
    }

    public void multiply() {
        System.out.println(number1 * number2);
    }
}
