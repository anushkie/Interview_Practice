package com.practice.beforeUEA.arrays;

import java.util.Scanner;

public class LongestPath {

    public static void main(String[] args) {
        int lenM, lenN;

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of array 1: ");
        lenM = scanner.nextInt();

        System.out.println("Enter the Elements :");
        for (int i : arrM) {
            arrM[i] = scanner.nextInt();
        }

        System.out.println("Enter the length of array 2 :");
        lenN = scanner.nextInt();
        int[] arrN = new int[lenN];
        System.out.println("Enter the Elements :");
        for (int i : arrN) {
            arrN[i] = scanner.nextInt();
        } */

        int[] arrM = {1,5,10,15,20,25};
        int[] arrN = {2,4,5,9,15};

        int answer = calculateLongestPath(arrM, arrN);
        System.out.println("Longest Sum : " + answer);
    }

    private static int calculateLongestPath(int[] arr1, int[] arr2) {
        int shortestLength, sum = 0, countIntersection = 0, previousIndexI = 0, previousIndexJ =0;

        if(arr1.length < arr2.length) {
            shortestLength = arr1.length;

        } else {
            shortestLength = arr2.length;
        }

        for(int i = 0 ; i < shortestLength ; i++) {
            for(int j = 0; j  < shortestLength ; j++) {
                if(arr1[i] == arr2[j]) {
                    ++countIntersection;

                    int maxSum = calculateMaximumSum(previousIndexI, previousIndexJ, i, j, arr1, arr2);
                    previousIndexI = i + 1;
                    previousIndexJ = j + 1;
                    sum += maxSum;
                    break;
                }
            }
        }

        if(countIntersection >= 1) {

            //Adding the rest of the longest array
            if(arr1.length > arr2.length) {
                for(int i = shortestLength - 1; i <= arr1.length -1; i++) {
                    sum += arr1[i];
                }
            } else {
                for(int i = shortestLength - 1; i <= arr2.length - 1; i++) {
                    sum += arr2[i];
                }
            }
            return sum;
        }
            else {
            int sumOfFirstArray = 0, sumOfSecondArray = 0;
            for(int x : arr1) sumOfFirstArray += arr1[x];
            for(int y : arr1) sumOfSecondArray += arr1[y];
            return Math.max(sumOfFirstArray, sumOfSecondArray);
        }
    }


    private static int calculateMaximumSum(int prevI, int prevJ, int i, int j, int[] arr1, int[] arr2) {

        int a, b, sumI = 0, sumJ = 0;

        //Calculating sum in the first Array
        for(a = prevI; a <= i; a++) {
            sumI += arr1[a];
        }

        //Calculating Sum in Array 2

        for(b= prevJ; b <= j; b++) {
            sumJ += arr2[b];
        }
        return sumI > sumJ ? sumI : sumJ;
    }

}