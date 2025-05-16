package com.example.demo.practice;

import java.util.Stack;

public class Paratheses {
    public static void main(String[] args) {
        String input = "([)]";
        System.out.println(isValid(input));
    }
    public static boolean isValid(String input){
        Stack<Character> stack=new Stack<>();
        String opening="({[";
        String closing=")}]";
        for (char ch:input.toCharArray()){
            if (opening.indexOf(ch)!=-1){
                stack.push(ch);
            }else {
                if (stack.isEmpty() &&closing.indexOf(ch)!=-1){
                    return false;
                }else {
                    char temp = stack.pop();
                    if (getVal(ch)!=temp){
                        return false;
                    }
                }
            }

        }


        return stack.isEmpty();
    }

    public static Character getVal(char ch){
        switch (ch){
            case '}':return '{';
            case ')':return '(';
            case ']':return '[';
            default:return ' ';


        }
    }
}
