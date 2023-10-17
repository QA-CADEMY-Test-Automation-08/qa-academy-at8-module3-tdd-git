package com.qaacademy.module3.tddgit.roger.katas;
public class CamelCase {

    /*
    * "hello case" --> "HelloCase"
      "camel case word" --> "CamelCaseWord"
    * */
    public static String camelCase(String str){
        String[] arrayWords = str.split("\\s+");
        String result = "";
        if(str.length() == 0){
            return result;
        }
        for(String word : arrayWords) {
            if(word.length() != 0){
                String firstLetter = word.substring(0, 1);
                    String newWord = word.replaceFirst(firstLetter, firstLetter.toUpperCase());
                    System.out.println(word);
                    System.out.println(firstLetter);
                    result = result + newWord;
                    System.out.println(result);
            }


        }
        return result;

    }
}
