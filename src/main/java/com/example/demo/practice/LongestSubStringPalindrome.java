package com.example.demo.practice;

public class LongestSubStringPalindrome {
    public static void main(String[] args) {
        String input="shivaavihsgdjgjhffghfp";
        System.out.println(findLongestPalindrome(input));
    }
    public static String findLongestPalindrome(String input){
        String longestPalindrome="";
        for (int i = 1; i <input.length(); i++) {
            int left=i;
            int right=i;
            while (left>=0&&right<input.length()&&input.charAt(left)==input.charAt(right)){
                left--;
                right++;
                String palindrome=input.substring(left+1,right);
                if (palindrome.length()>longestPalindrome.length()){
                    longestPalindrome=palindrome;
                }
            }

        }


        return longestPalindrome;
    }
}
