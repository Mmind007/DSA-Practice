package com.example.demo.practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int target=13;
        int left=0;
        int right=arr.length-1;
        int result = binarySearch(arr, target, left, right);
        if (result!=-1)
        System.out.println("The given target is at the index of ");
        else
            System.out.println("The given target is not found ");
    }

    private static int binarySearch(int[] arr, int target, int left, int right) {
        while(left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==target)
                return mid;
            else if (arr[mid]<target)
                  return binarySearch(arr,target,mid+1,right);
            else
                return binarySearch(arr, target, left, mid-1);
        }
        return -1;
    }

    private static int findTarget(int[] arr, int target) {
        int left=0;
        int right=arr.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        return -1;

    }
}
