package com.in28minutes.level2.interfaces;

public class ChessGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Chess Up!");
    }

    @Override
    public void down() {
        System.out.println("Chess Down!");
    }

    @Override
    public void left() {
        System.out.println("Chess Left!");
    }

    @Override
    public void right() {
        System.out.println("Chess Right!");
    }
}
