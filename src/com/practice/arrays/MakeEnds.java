package com.practice.arrays;

import java.util.Arrays;

public class MakeEnds {

    private static int[] makeEnd(int[] arr) {
        int last = arr[arr.length - 1];
        int first = arr[0];
        int[] array = {first, last};
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] ar = makeEnd(array);
        System.out.println(Arrays.toString(ar));
    }
}
