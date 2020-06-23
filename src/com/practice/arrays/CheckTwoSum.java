package com.practice.arrays;

public class CheckTwoSum {

    private static void checkSum(int[] a, int num) {
        int sum = 0;  int[] array = new int[2];
        for(int i = 0; i < a.length; i++) {
            for(int j = 1; j < a.length; j++) {
                sum = a[i] + a[j];
                if(sum == num) {
                    System.out.println(a[i] +" and " + a[j]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,3,4};
        checkSum(array, 4);
    }
}
