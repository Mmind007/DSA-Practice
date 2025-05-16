package com.example.demo.practice;

import java.util.*;
import java.util.stream.Collectors;

public class FindWords {
    public static void main(String[] args) {
        String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input = "abcd";
        String[] dict1 =  {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
        String input1 = "caab";
        System.out.println(findPairs(dict1,input1));

    }

    private static List<String> findPairs(String[] dict,String input) {
        List<String> resultList=new ArrayList<>();
        Map<String, Long> inputOccurance = Arrays.stream(input.split("")).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        for(String word:dict){
            Map<String, Long> wordOccurance = Arrays.stream(word.split("")).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
            if (inputOccurance.equals(wordOccurance)){
                resultList.add(word);
            }

        }
        return resultList;
    }
}
