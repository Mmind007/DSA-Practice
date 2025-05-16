package com.example.demo.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        String input="aaabbbccc";
        System.out.println(findOccurance(input));
        findOccuranceByMap(input);
    }

    private static String findOccurance(String input) {
        StringBuilder result=new StringBuilder();
        char currentChar=input.charAt(0);
        int count=1;
        for (int i = 1; i < input.length(); i++) {
            if (currentChar==input.charAt(i)){
                count++;
            }else {
                result.append(currentChar).append(count);
                currentChar=input.charAt(i);
                count=1;
            }

        }
        result.append(currentChar).append(count);


        return result.toString();
    }

    private static void findOccuranceByMap(String input) {

        Map<Character,Integer> map=new LinkedHashMap<>();
        for (char ch:input.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }


        System.out.println(map); ;
    }

}
