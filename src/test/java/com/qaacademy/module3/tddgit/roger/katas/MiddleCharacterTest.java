package com.qaacademy.module3.tddgit.roger.katas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleCharacterTest {
    @Test
    public void getMiddleTest(){
        assertEquals("t", MiddleCharacter.getMiddle("testing"));
    }
}
