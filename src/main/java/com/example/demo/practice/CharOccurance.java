package com.example.demo.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurance {
    public static void main(String[] args) {
        String input = "aaabbbccdda";
        System.out.println(findCharOccurance(input));
        System.out.println(findCharOccurance1(input));
    }

    //  If the characters are not in the sequence
    private static String findCharOccurance1(String input) {
        StringBuilder result=new StringBuilder();
        Map<Character,Integer> occurance=new LinkedHashMap<>();
        for (char ch:input.toCharArray()){
            occurance.put(ch,occurance.getOrDefault(ch,0)+1);
        }
        for (char ch: occurance.keySet()){
            result.append(ch).append(occurance.get(ch));
        }


        return result.toString();
    }

    //  If the characters are in the sequence
    private static String findCharOccurance(String input) {
        StringBuilder result = new StringBuilder();
        char currentChar = ' ';
        int count = 1;
        char[] charArray = input.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i - 1]) {
                currentChar = charArray[i];
                count++;
            } else {
                result.append(currentChar).append(count);
                currentChar = charArray[i];
                count = 1;
            }

        }
        result.append(currentChar).append(count);


        return result.toString();
    }


}
