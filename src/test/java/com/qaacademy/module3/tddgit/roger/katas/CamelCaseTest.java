package com.qaacademy.module3.tddgit.roger.katas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CamelCaseTest {
    @Test
    public void camelCaseTest(){
        assertEquals("Case",CamelCase.camelCase("  case"));
    }
}
