package com.practice.beforeUEA.leetcode;

public class LongestCommonPrefx {

    public static String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";
        if(strs == null || strs.length == 0) return longestCommonPrefix;

        int index = 0;
        for(char c : strs[0].toCharArray()) {
            for(int i = 1; i < strs.length; i++) {
                if(index >= strs[i].length() || c != strs[i].charAt(index)) {
                    return longestCommonPrefix;
                }
            }
            longestCommonPrefix += c;
            index++;
        }
        return longestCommonPrefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
       /*// System.out.println(strs[0]);
        for(int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }*/
       String longest = longestCommonPrefix(strs);
        System.out.println(longest);
    }
}
