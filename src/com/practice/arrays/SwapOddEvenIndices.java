package com.practice.arrays;

import java.util.Arrays;

public class SwapOddEvenIndices {

    private static void swapIndices (int[]arr) {
        int temp;
        for(int i = 0; i < arr.length - 1; i++) {
            if(i % 2 == 0) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,76};
        swapIndices(array);
        System.out.println(Arrays.toString(array));
    }
}
