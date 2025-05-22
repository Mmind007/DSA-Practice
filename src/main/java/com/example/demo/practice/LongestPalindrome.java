package com.example.demo.practice;

public class LongestPalindrome {
    public static void main(String[] args) {
        String input = "shvracecarmadamma";
        System.out.println(findLongestPalindrome(input));
    }

    private static String findLongestPalindrome(String input) {
        String result = "";
        String palindrome;
        int maxLen = 0;
        for (int i = 1; i < input.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
                left--;
                right++;
                palindrome = input.substring(left + 1, right);
                if (palindrome.length() > maxLen) {
                    maxLen = palindrome.length();
                    result = palindrome;
                }
            }
                left = i;
                right = i - 1;
                while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
                    left--;
                    right++;
                    palindrome = input.substring(left + 1, right);
                    if (palindrome.length() > maxLen) {
                        maxLen = palindrome.length();
                        result = palindrome;
                    }
                }
            }
        return result;


    }
}
