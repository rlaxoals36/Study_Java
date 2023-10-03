package com.in28minutes.oops.level2;

public class Fan {

    // state
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    //creation
    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public void SwitchOn() {
        this.isOn = true;
        setSpeed((byte)3);
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte)0);
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }
}
