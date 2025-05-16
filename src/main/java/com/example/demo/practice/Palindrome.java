package com.example.demo.practice;

public class Palindrome {
    public static void main(String[] args) {
        var input="helllleh";
//        boolean result = isPalindrome(input);
        boolean palindromeMiddle = isPalindromeMiddle(input);
        System.out.println(palindromeMiddle);


    }

    private static boolean isPalindromeMiddle(String input) {
        boolean result = false;
        int left;
        int right;
        int mid=input.length()/2;
        if (input.length()%2==1){
            left=mid-1;
            right=mid+1;
        }else {
           right=mid;
           left=mid-1;
        }
        while (left>=0&&right<=input.length()-1){
            if (input.charAt(left)==input.charAt(right)){
                left--;
                right++;
                result=true;
            }else {
                return false;
            }

        }
        return result;
    }

    private static boolean isPalindrome(String input) {
        boolean result=false;
        int left=0;
        int right=input.length()-1;
        while (left<right){
            if (input.charAt(left)==input.charAt(right)){
                System.out.println(input.charAt(left));
                left++;
                right--;
                result=true;
            }else {
                return false;
            }

        }
       return result;
    }
}
