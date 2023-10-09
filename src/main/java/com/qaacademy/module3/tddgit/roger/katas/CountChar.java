package com.qaacademy.module3.tddgit.roger.katas;

public class CountChar {
    /*
    * countChar("fizzbuzz","z") => 4
    countChar("Fancy fifth fly aloof","f") => 5
    * */
    public static int countChar(String sentence, char letter){
        int result = 0;
        for(int i=0; i<sentence.length(); i++){
            char element = sentence.charAt(i);
            if(Character.compare(element, letter) == 0 || Character.compare(element, Character.toUpperCase(letter)) == 0 || Character.compare(element, Character.toLowerCase(letter)) == 0){
                result = result + 1;
            }
        }
        return result;
    }
}
