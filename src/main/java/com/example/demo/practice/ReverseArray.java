package com.example.demo.practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 6, 7, 9};
        int[] result = reverseArrDevisibleBy3(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] reverseArrDevisibleBy3(int[] arr) {
        int left=0;
        int right= arr.length-1;
        while (left<right){
            if (arr[left]%3!=0){
                left++;
            }
            if (arr[right]%3!=0){
                right--;
            } else if (arr[left]%3==0&&arr[right]%3==0) {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

        }


        return arr;
    }
}
