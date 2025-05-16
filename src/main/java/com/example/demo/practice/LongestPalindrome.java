package com.example.demo.practice;

public class LongestPalindrome {
    public static void main(String[] args) {
        String input="madamtyui";
        System.out.println(findLongestPalindrome(input));
    }

    private static String findLongestPalindrome(String input) {
        String result="";
        int maxLen=0;
        for (int i = 1; i < input.length(); i++) {
         int left=i;
         int right=i;
         while (left>0&&right<input.length()&&input.charAt(left)==input.charAt(right)){
             left--;
             right++;
             String subString=input.substring(left+1 ,right);
             if (subString.length()>maxLen){
                 result=subString;
             }

         }
        }
        return result;
    }


}
