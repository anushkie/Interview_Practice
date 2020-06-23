package com.practice.arrays;

public class CompareArraysElements {

    private static boolean compare(int[] ar1, int[] ar2) {

        int counter = 0;
        if(ar1.length != ar2.length) {
            return false;
        } else {
            for(int i = 0; i < ar1.length; i++) {
                if(ar1[i] == ar2[i]) {
                    counter++;
                }
            }
            if(counter == ar1.length) {
                return true;
            }
        }
    return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        boolean ans = compare(array1, array2);
        System.out.println(ans);
    }
    /**
     * public static boolean compare(int[] ar1, int[] ar2) {
     *         if (ar1.length != ar2.length) {
     *             return false;
     *         }
     *
     *         for (int i = 0; i < ar1.length; i++) {
     *             if (ar1[i] != ar2[i]) {
     *                 return false;
     *             }
     *         }
     *
     *         return true;
     *     }
     */
}
