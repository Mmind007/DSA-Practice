package com.example.demo.practice;

public class RainTrap {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(findWaterTrap(arr));
    }

    private static int findWaterTrap(int[] arr) {
        int left=0;
        int right= arr.length-1;
        int rightMax=0;
        int leftMax=0;
        int waterTrap=0;
        while (left<right){
            if (arr[left]<arr[right]){
                if (arr[left]>=leftMax){
                    leftMax=arr[left];
                }else {
                    waterTrap+=leftMax-arr[left];
                }
                left++;
            }else {
                if (arr[right]>=rightMax){
                    rightMax=arr[right];
                }else {
                    waterTrap+=rightMax-arr[right];
                }
                right--;
            }

        }


        return waterTrap;
    }
}
