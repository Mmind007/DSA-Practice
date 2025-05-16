package com.example.demo.practice;

public class FindElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,8,9};
        int target=17;
        int elementIndex = findElementIndex(arr, target);
        System.out.println(elementIndex);
    }

    private static int findElementIndex(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int mid=(left+right)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (target<arr[left]){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}
