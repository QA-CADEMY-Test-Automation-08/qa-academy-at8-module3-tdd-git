package com.qaacademy.module3.tddgit.aldo.unitesttdd;

import org.junit.jupiter.api.*;

@DisplayName("Calculator")
@Tag("UnitTest")
public final class CalculatorTest {

    @BeforeAll
    public static void setupAll() {
        System.out.println("BeforeAll - setup");
    }

    @BeforeEach
    public void setup() {
        System.out.println("BeforeEach - setup");
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
        Calculator calculator = new Calculator();
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
}
