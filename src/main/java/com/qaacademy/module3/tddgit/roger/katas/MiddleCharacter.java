package com.qaacademy.module3.tddgit.roger.katas;

public class MiddleCharacter {
    /*
    * You are going to be given a word. Your job is to return the middle character of the word.
    * If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
    * Examples:
    * Kata.getMiddle("test") should return "es"
    * Kata.getMiddle("testing") should return "t"
    * Kata.getMiddle("middle") should return "dd"
    * Kata.getMiddle("A") should return "A"
    * */
    public static String getMiddle(String str){
        String result = "";
        int strSize = str.length();
        int init;
        int end;
        if(str.length()%2 == 0){
            init = strSize/2 - 1;
            end = strSize/2 + 1;
            result = str.substring(init, end);
        }
        else{
            init = (strSize - 1) /2;
            end = init + 1;
            result = str.substring(init, end);
        }
        return result;
    }
}
