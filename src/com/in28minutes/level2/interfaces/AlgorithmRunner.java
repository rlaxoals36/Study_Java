package com.in28minutes.level2.interfaces;

public class AlgorithmRunner {
    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new RealAlgorithm();
        System.out.println(algorithm.complexAlgorithm(3, 3));
    }
}
