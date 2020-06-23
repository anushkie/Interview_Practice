package com.practice.arrays;

public class LargestOrSmallest {

    private static int largestNumber(int[] arr) {
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }

    private static int smallestNumber(int[] ar) {
        int smallest = ar[0];
        for(int i = 0; i < ar.length; i++) {
            if(ar[i] < smallest) {
                smallest = ar[i];
            }
        }
    return smallest;
    }

    public static void main(String[] args) {
        int[] array = {1,2,5,5,67,776,7};
        int largest = largestNumber(array);
        int smallest = smallestNumber(array);
        System.out.println(smallest +  " and " +  largest);
    }
}