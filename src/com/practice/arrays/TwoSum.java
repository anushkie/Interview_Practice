package com.practice.arrays;

public class TwoSum {

    private static void checkSum(int[] a) {
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            for(int j = 1; j < a.length; j++) {
                sum = a[i] + a[j];
                for(int k = 0; k < a.length; k++) {
                    if(sum == a[k]) {
                        System.out.println("Sum : "+sum + " Elements : " + a[i] + " and "+ a[j]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        checkSum(array);
    }
}
