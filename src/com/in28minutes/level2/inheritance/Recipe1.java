package com.in28minutes.level2.inheritance;

public class Recipe1 extends AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("ready");
    }

    @Override
    void doTheDish() {
        System.out.println("doTheDish");
    }

    @Override
    void cleanup() {
        System.out.println("clean");
    }
}
