package com.practice.arrays;

import java.util.Arrays;

public class SearchAnumber {

    private static int search(int[] arr, int numberToSearch) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return i;
            }
        }
        return -1;
    }

    private static void FindAndReplace(int[] arr, int newNumber, int numberToReplace) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
    }

    private static void ForFindAndReplace(int[] arr, int newNumber, int numberToReplace) {
        int counter = 0;
        for (int i : arr ) {
            if(i == numberToReplace) {
                arr[counter] = newNumber;
            }
            counter++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ForFindAndReplace(arr, 303030, 3);
        System.out.println(Arrays.toString(arr));
    }
}
