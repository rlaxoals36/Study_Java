package com.in28minutes.javacoding4;

public class BiNumber {
    private final int number1;
    private final int number2;

    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1(){
        return number1;
    }
    public int getNumber2(){
        return number2;
    }

    public int calculateLCM() {
        if (getNumber1() < 0 || getNumber2() < 0)
            return -1;
        if (getNumber1() == 0 || getNumber2() == 0)
            return 0;

        int max = 0;    // int max = Math.max(number1, number2);
        if (getNumber1() >= getNumber2())
            max = getNumber1();
        else max = getNumber2();

        int lcm = 0;
        int i = 2;
        int initialmax = max;
        while (lcm!=max) {
            if((max % getNumber1()) == 0 && (max % getNumber2()) == 0)
                lcm = max;
            else { // 10 -> 20 -> 30 -> 40
                max =initialmax * i;
                i++;
            }
        }
        return lcm;
    }

    public int calculateGCD() {
        if (number1 < 0 || number2 < 0)
            return 1;
        if (number1 == 0 || number2 == 0)
            return 0;
        if (number1 == number2)
            return number1;

        int min = Math.min(number1, number2);
        for (int i = min; i > 0; i--) {
            boolean gcd = number1%i==0 && number2%i==0;
            if (gcd) {
                return i;
            }
        }
        return -1;
    }
}
