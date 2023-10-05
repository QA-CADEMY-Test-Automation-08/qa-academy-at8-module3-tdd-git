package com.qaacademy.module3.tddgit.aldo.unitesttdd;

import org.junit.jupiter.api.*;

import java.util.List;

@DisplayName("Calculator")
@Tag("UnitTest")
public final class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void setupAll() {
        System.out.println("BeforeAll - setup");
    }

    @BeforeEach
    public void setup() {
        System.out.println("BeforeEach - setup");
        calculator = new Calculator();
    }

    @AfterEach
    public void teardown() {
        System.out.println("AfterEach - teardown");
    }

    @AfterAll
    public static void teardownAll() {
        System.out.println("AfterAll - teardown");
    }

    @Test
    @DisplayName("Example HelloWord")
    public void exampleHelloWord() {
        String wordExpected = "Hello Word";
        String wordActual = "Hello Word";

        System.out.println("Example HelloWord");
        Assertions.assertEquals(wordExpected, wordActual, "they are not equals.");
    }

    @Test
    @DisplayName("Sum of two integers")
    public void sumOfTwoIntegers() {
        // Given
        int numberA = 5;
        int numberB = 8;
        int expectedResult = 13;

        // When
        int actualResult = calculator.sum(numberA, numberB);

        // Then
        System.out.println("expectedResult : " + expectedResult);
        System.out.println("actualResult : " + actualResult);
        Assertions.assertEquals(expectedResult, actualResult, "The sum of two integers is not correct.");
    }


    @Test
    @DisplayName("Multiply two numbers integers")
    public void multiplyTwoNumberIntegers() {
        // Given
        int numberA = 3;
        int numberB = 5;
        int expectedResult = 15;

        // When
        int actualResult = calculator.multiply(numberA, numberB);

        // Then
        System.out.println("expectedResult : " + expectedResult);
        System.out.println("actualResult : " + actualResult);
        Assertions.assertEquals(expectedResult, actualResult, "Multiply two integers is not correct");
    }

    @Test
    @DisplayName("Sum of than two integers")
    public void sumOfThanTwoIntegers() {
        // Given
        List<Integer> numbers = List.of(5, 6, 4, 7, 1);
        int expectedResult = 23;

        // When
        int actualResult = calculator.sum(numbers);

        // Then
        System.out.println("expectedResult : " + expectedResult);
        System.out.println("actualResult : " + actualResult);
        Assertions.assertEquals(expectedResult, actualResult, "The sum of more than two integers in not correct.");

    }

    @Test
    @DisplayName("multiply more than two numbers integers")
    public void multiplyMoreThanTwoNumbersIntegers() {
        // Given
        List<Integer> numbers = List.of(3, 4, 2, 2, 1);
        int expectedResult = 48;

        // When
        int actualResult = calculator.multiply(numbers);

        // Then
        System.out.println("expectedResult : " + expectedResult);
        System.out.println("actualResult : " + actualResult);
        Assertions.assertEquals(expectedResult, actualResult, "The multiply of more than two integers in not correct.");
    }
}
