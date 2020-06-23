package com.practice.arrays;

import java.util.Arrays;

public class Fix23 {

    private static int[] fix(int[] arr) {
        int pos;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                pos = i;
                if(arr[pos + 1] == 3) {
                    arr[pos + 1] = 0;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] ar = fix(array);
        System.out.println(Arrays.toString(ar));
    }
}
