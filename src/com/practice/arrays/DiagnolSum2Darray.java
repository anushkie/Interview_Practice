package com.practice.arrays;

public class DiagnolSum2Darray {

    private static void sum(int[][] arr) {
        int sumOfMatrix = 0,sumOfDiagnols = 0;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr.length; col++) {
                //Sum of all the elements
                sumOfMatrix += arr[row][col];

                //sum of the diagnols
                if(row == col || row + col == 2)
                    sumOfDiagnols += arr[row][col];
            }
        }
        System.out.println("sum of matrix : " + sumOfMatrix);
        System.out.println("Sum of diagnols : " + sumOfDiagnols);


    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6}};
        sum(matrix);
    }
}
