package com.qaacademy.module3.tddgit.roger.katas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SumMultiplesOfNumbersTest {
    @Test
    public void sumMultiplesOfNumbersTest(){
        assertEquals(23, SumMultiplesOfNumbers.sumMultiplesOfNumbers(10));
    }
}
