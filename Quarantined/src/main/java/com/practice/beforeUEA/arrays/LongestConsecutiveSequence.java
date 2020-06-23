package com.practice.beforeUEA.arrays;

import java.util.ArrayList;

public class LongestConsecutiveSequence {

    public static void consecutiveSequence(int [] arr) {

        ArrayList arrayList = new ArrayList();
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j= i + 1; j < n;j++) {
                if(arr[j] == arr[i] + 1) {
                    //System.out.println(arr[i] + " " + arr[j]);
                    arrayList.add(arr[i]);
                    arrayList.add(arr[j]);
                    for(int k = 0; k < arrayList.size(); k++)
                        System.out.println(arrayList.get(k));
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {3,12,4,13,14};
        consecutiveSequence(array);
    }
}
