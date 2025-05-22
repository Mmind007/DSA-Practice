package com.example.demo.practice;

public class MinDistanceBetweenWords {
    public static void main(String[] args) {
        String input="the quick the brown quick brown the frog";
        String word1="quick";
        String word2="frog";
        System.out.println("The shortest distance between given words : "+findTheMinDistance(input,word1,word2));
    }

    private static int findTheMinDistance(String input,String word1,String word2) {
        int minDistance=Integer.MAX_VALUE;
        String[] words = input.split(" ");
        int index1=-1;
        int index2=-1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)){
                index1=i;
            }if (words[i].equals(word2)){
                index2=i;
            }
            if (index1!=-1&&index2!=-1){
                int distance=index2-index1;
                if (distance<minDistance){
                    minDistance=distance;
                }
            }
        }


        return minDistance==Integer.MAX_VALUE?-1:minDistance;
    }
}
