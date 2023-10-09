package com.qaacademy.module3.tddgit.roger.katas;

import java.util.Arrays;

public class PhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        String result = "(xxx) xxx-xxxx";
        for(int i = 0; i<numbers.length; i++){
                result = result.replaceFirst("x", numbers[i]+"");
        }
        return result;
    }
}
