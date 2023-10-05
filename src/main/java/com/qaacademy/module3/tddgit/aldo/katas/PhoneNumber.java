package com.qaacademy.module3.tddgit.aldo.katas;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "(xxx) xxx-xxxx";
        for (int index = 0; index < numbers.length; index++) {
            phoneNumber = phoneNumber.replaceFirst("x", numbers[index] + "");
        }
        return phoneNumber;
    }
}
