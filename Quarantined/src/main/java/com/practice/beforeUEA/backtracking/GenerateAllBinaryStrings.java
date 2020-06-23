package com.practice.beforeUEA.backtracking;
import java.util.*;

public class GenerateAllBinaryStrings {

        // Function to print the output
        static void printTheArray(int arr[], int n)
        {
            for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        // Function to generate all binary strings
        static void generateAllBinaryStrings(int n, int arr[], int i)
        {
            if (i == n)
            {
                printTheArray(arr, n);
                return;
            }

            // First assign "0" at ith position
            // and try for all other permutations
            // for remaining positions
            arr[i] = 0;
            generateAllBinaryStrings(n, arr, i + 1);

            // And then assign "1" at ith position
            // and try for all other permutations
            // for remaining positions
            arr[i] = 1;
            generateAllBinaryStrings(n, arr, i + 1);
        }

        // Driver Code
        public static void main(String args[])
        {
            int n = 2;

            int[] arr = new int[n];

            // Print all binary strings
            generateAllBinaryStrings(n, arr, 0);
        }
}
