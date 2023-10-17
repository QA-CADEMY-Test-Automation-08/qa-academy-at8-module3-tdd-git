package com.qaacademy.module3.tddgit.roger.katas;

public class SumMultiplesOfNumbers {
    /*
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
     * The sum of these multiples is 23.
     * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
     * */
    public static int sumMultiplesOfNumbers(int number){
        int result = 0;
        for(int i = 1; i < number; i++){
            if(i % 3 == 0){
                result = result + i;
            }
            if(i % 5 == 0){
                result = result + i;
            }
        }
        return result;
    }
}
