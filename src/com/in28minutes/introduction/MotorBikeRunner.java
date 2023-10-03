package com.in28minutes.introduction;

public class MotorBikeRunner {

    public static void main(String[] args) {

        MotorBike ducati = new MotorBike(200);

        MotorBike honda = new MotorBike(100);

        MotorBike somethingElse = new MotorBike();

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        ducati.start();
        honda.start();

        //ducati.setSpeed(100);

        int ducatiSpeed = ducati.getSpeed();
        ducatiSpeed += 100;
        ducati.setSpeed(ducatiSpeed);

        honda.increaseSpeed(100);
        honda.decreaseSpeed(80);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

    }

}
