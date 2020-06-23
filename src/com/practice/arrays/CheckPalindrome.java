package com.practice.arrays;

public class CheckPalindrome {

    private static Boolean isPalindrome(int[] arr) {
        int[] newArray = arr;
        int end = arr.length - 1, temp, start;
        for(int i = 0; i < arr.length / 2; i++) {

            start = i;
            temp = start;
            start = end;
            end = temp;
            end--;

            if(newArray == arr) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,1,3};
        Boolean value = isPalindrome(array);
        System.out.println(value);
    }
}