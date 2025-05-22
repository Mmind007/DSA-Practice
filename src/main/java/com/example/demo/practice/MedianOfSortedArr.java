package com.example.demo.practice;
import java.util.Arrays;

public class MedianOfSortedArr {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 5, 8};
        int arr2[] = {10, 12, 14, 16, 18};
        System.out.println("THe median of the given two sorted array is : " +findMedian(arr1,arr2));
    }
    public static double findMedian(int[] arr1,int[] arr2){
        int n=arr1.length+arr2.length;
        int [] merged=new int[n];
        double median=0.0;
        int i=0,j=0,k=0;
        while (i<arr1.length&&j<arr2.length){
            if (arr1[i]<arr2[j]){
                merged[k]=arr1[i];
                i++;
                k++;
            }else {
                merged[k]=arr2[j];
                j++;
                k++;
            }
        }
        while (i<arr1.length){
            merged[k]=arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){
            merged[k]=arr2[j];
            j++;
            k++;
        }
        if (n%2==1){
           median=merged[n/2];
        }else {
            median=(merged[n/2]+merged[(n/2)-1])/2.0;
        }

        return median;
    }
}
