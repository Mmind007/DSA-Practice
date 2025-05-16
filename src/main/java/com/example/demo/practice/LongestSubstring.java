package com.example.demo.practice;

public class LongestSubstring {
    public static void main(String[] args) {
        String input="11123333333333333";
        System.out.println(findLongestSubString(input));

        int arr1[] = {};
        int arr2[] = {12, 14, 16};
        System.out.println("The median is : "+findMedian(arr1,arr2));
    }

    private static double findMedian(int[] arr1, int[] arr2) {
        double median=0.0;
        int[] mergedArray=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length){
            if (arr1[i]<arr2[j]){
                mergedArray[k++]=arr1[i++];
            }else {
                mergedArray[k++]=arr2[j++];
            }
        }
        while (i<arr1.length){
            mergedArray[k++]=arr1[i++];
        }
        while (j<arr2.length){
            mergedArray[k++]=arr2[j++];
        }
        if (mergedArray.length%2==1){
            median=mergedArray[mergedArray.length/2];
        }else {
            median=(mergedArray[(mergedArray.length/2)-1]+mergedArray[(mergedArray.length/2)])/2.0;
        }



        return median;

    }

    private static String findLongestSubString(String input) {
        int count=1;
        char currentChar=' ';
        int maxCount=0;
        String result= "";
        char[] chars = input.toCharArray();
        for (int i = 1; i < input.length(); i++) {
            if (chars[i]==chars[i-1]){
                currentChar=chars[i];
                count++;
                if (count>maxCount){
                    maxCount=count;
                    result=String.valueOf(currentChar).repeat(count)+", "+count;
                }
            }else {
                currentChar=chars[i];
                count=1;
            }
        }

        return result;
    }
}
