package com.example.demo.practice;

public class ClimbingStairs {
    public static void main(String[] args) {
        int input=3;
        System.out.println("The possible combinations to climb the stairs :"+climbStairs(input));
    }

    private static int climbStairs(int input) {
        if (input<=2){
            return input;
        }
        int first=1,second=2,current=3;
        for (int i = 3; i < input; i++) {
            first=second;
            second=current;
            current=first+second;
        }
        return current;
    }
}
