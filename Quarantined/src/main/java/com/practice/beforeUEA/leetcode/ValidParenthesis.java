package com.practice.beforeUEA.leetcode;

import java.util.Stack;

public class ValidParenthesis {


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if(c == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if(c == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else if(c == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean result = isValid("{{[]}}");
        System.out.println(result);
    }


}
