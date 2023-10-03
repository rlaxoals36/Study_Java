package com.in28minutes.level2.interfaces;

public class GameRunner {
    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();

        GamingConsole chessGame = new ChessGame();
        chessGame.up();
        chessGame.down();
        chessGame.left();
        chessGame.right();
    }
}
