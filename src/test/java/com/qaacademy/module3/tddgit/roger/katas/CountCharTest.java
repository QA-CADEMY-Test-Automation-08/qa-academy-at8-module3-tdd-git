package com.qaacademy.module3.tddgit.roger.katas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCharTest {
    @Test
    public void countChartest(){
        assertEquals(8, CountChar.countChar("fizzbuzz FIZZBUZZ", 'Z'));
    }

}
