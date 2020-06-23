package com.practice.arrays;

public class SumOfAnArray {
    private static int findSum(int[] arr) {
        int sum = 0;
        for(int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int sum = findSum(array);
        System.out.println("Sum : " + sum);
    }
}
