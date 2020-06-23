package com.practice.arrays;

import java.util.Arrays;

public class MakeMiddle {

    private static int[] calculate(int[] a) {
        int[] array;
        int length = a.length;
        int middle = length/2;
        array = new int[]{a[middle - 1], a[middle]};
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        calculate(array);
    }
}
