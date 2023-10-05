package com.qaacademy.module3.tddgit.aldo.unitesttdd;

import java.util.List;

public class Calculator {
    public int sum(int numberA, int numberB) {
        return numberA + numberB;
    }

    public int multiply(int numberA, int numberB) {
        return numberA * numberB;
    }

    public int sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public int multiply(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).reduce(1, (a, b) -> a * b);
    }
}
