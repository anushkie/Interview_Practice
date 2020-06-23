package com.practice.arrays;

import java.util.Arrays;

public class Reverse {

    private static void ReverseOfAnArray(int[] arr) {
        int start, temp = 0;
        int end = arr.length - 1;
        for(int i = 0; i < arr.length/2; i++) {
            start = i;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {};
        ReverseOfAnArray(array);
        System.out.println(Arrays.toString(array));
    }
}
