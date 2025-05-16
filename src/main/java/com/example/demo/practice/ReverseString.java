package com.example.demo.practice;

import java.util.HashSet;
import java.util.Set;

public class ReverseString {
    public static void main(String[] args) {
        String input="Leetcode";
        System.out.println(reverseString(input));

    }

    private static String reverseString(String input) {
        int left=0;
        int right=input.length()-1;
        char[] charArray = input.toCharArray();
        Set<Character> vowels=new HashSet<>();
        vowels.add('a');vowels.add('e');vowels.add('i');vowels.add('o');;vowels.add('u');
        while (left<right) {
            if (!vowels.contains(charArray[left])){
                left++;
            } else if (!vowels.contains(charArray[right])) {
                right--;
            } else if (vowels.contains(charArray[left])&&vowels.contains(charArray[right])){
                char temp=charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
                left++;
                right--;
            }

        }
        return String.valueOf(charArray);

    }
}
