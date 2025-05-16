package com.example.demo.practice;

public class FindLongestString {
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGEES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        String longestString = findLongestString(dict, toSearch);
        System.out.println(longestString);

    }

    private static String findLongestString(String[] dict, String toSearch) {
        String longestString="";
        for (String word:dict){
            if (word.contains(toSearch)&&word.length()>longestString.length()){
                longestString=word;
            }
        }
        return longestString;
    }
}
