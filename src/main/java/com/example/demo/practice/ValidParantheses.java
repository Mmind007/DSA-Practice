package com.example.demo.practice;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String input="{{{()}}}";
        System.out.println(isValid(input));
    }

    private static boolean isValid(String input) {
        Stack<Character> stack=new Stack<>();
        String opening="{[(";
//        String closing="}])";
        for (char ch:input.toCharArray()){
            if (opening.indexOf(ch)!=-1){
                stack.push(ch);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                char temp = stack.pop();
                if (getVal(ch)!=temp){
                   return false;
                }
            }
        }
        return stack.isEmpty();

    }

    private static char getVal(char ch) {
        switch (ch){
            case '}':return '{';
            case ']':return '[';
            case ')':return '(';
            default: return ' ';
        }
    }
}
