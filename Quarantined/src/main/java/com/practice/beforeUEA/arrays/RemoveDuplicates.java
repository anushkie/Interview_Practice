package com.practice.beforeUEA.arrays;

public class RemoveDuplicates {

    public static void removeDups(int[] arr) {

        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    newArr[i] = arr[j];
                }
            }

        }
        for(int i = 0; i < newArr.length; i++)
            System.out.println(newArr[i]);
    }
    // Hello! I have got an offer

    public static void main(String[] args) {
        int[] arr = {10,10,20};
        removeDups(arr);
    }
}