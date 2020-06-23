package com.practice.arrays;

public class SumOfEvenIndices {

    private static int findTheSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0)
                sum += arr[i];
        }
        return sum;
    }

    private static int FindTheSumForEach(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            if(element % 2 == 0)
                sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int ans = findTheSum(array);
        System.out.println(ans);
    }
}
