package com.practice.arrays;

import java.util.Arrays;

public class MatchUp {
    private static int match(int[] a1, int[] a2) {
        int counter = 0;
        for(int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    counter++;
                }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {1,3,3};
        int ar = match(array1, array2);
        System.out.println(ar);
    }
}
