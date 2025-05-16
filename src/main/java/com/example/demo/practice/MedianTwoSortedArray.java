package com.example.demo.practice;

public class MedianTwoSortedArray {
    public static void main(String[] args) {
        int [] arr1 ={1,2,4,6};
        int [] arr2 ={1,2,3,9};
        System.out.println("the median is :" +findMedian(arr1,arr2));
    }
    public static double findMedian(int[] arr1,int[] arr2){
        int n=arr1.length+arr2.length;
        int index2=n/2;
        int index1=(n/2)+1;
        double median=0.0;
        int element1=-1;
        int element2=-1;
        int i=0,j=0,count=0;
        while (i<arr1.length&&j<arr2.length){
            if (arr1[i]<arr2[j]){
                if (index1==count){
                    element1=arr1[i];
                }
                if (index2==count){
                    element2=arr1[i];
                }
                count++;
                i++;
            }else {
                if (index1==count){
                    element1=arr1[i];
                }
                if (index2==count){
                    element2=arr1[i];
                }
                j++;
                count++;
            }
        }
        while (i<arr1.length){
            if (index1==count){
                element1=arr1[i];
            }
            if (index2==count){
                element2=arr1[i];
            }
            i++;
            count++;
        }
        while (j<arr2.length){
            if (index1==count){
                element1=arr2[j];
            }
            if (index2==count){
                element2=arr2[j];
            }
            j++;
            count++;
        }
        if (n%2==1){
            median=element2;
        }else {
            median=(element1+element2)/2.0;
        }
        return median;
    }
}
