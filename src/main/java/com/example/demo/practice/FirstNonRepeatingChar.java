package com.example.demo.practice;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input="zaabbcddesdja";
        System.out.println("The first non repeating character in the given string is : "+ findFirstNonRepeatingChar(input));
    }
    public static char findFirstNonRepeatingChar(String input){
        Map<Character,Integer> occurance=new HashMap<>();
        Set<Character> chars=new LinkedHashSet<>();
        for (char ch:input.toCharArray()){
            occurance.put(ch,occurance.getOrDefault(ch,0)+1);
            if (occurance.get(ch)==1){
                chars.add(ch);
            }else {
                chars.remove(ch);
            }
        }

        return chars.isEmpty()?' ':chars.iterator().next();
    }
}
