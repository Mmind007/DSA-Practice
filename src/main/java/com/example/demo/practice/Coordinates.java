package com.example.demo.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Coordinates {
    static int x=0,y=0;
    public static void main(String[] args) {
        String input="UUU";
        String input1="DOWN UP 2xRIGHT DOWN 3xLEFT";
        System.out.println(Arrays.toString(findCoordinates(input1)));
    }

    private static int[] findCoordinates(String input) {
        String [] words;
        if (!input.contains(" ")){
            words=input.split("");
        }else {
            words=input.split(" ");
        }
        for (String word:words){
            switch (word){
                case "U", "UP" ->y++;
                case "D", "DOWN" ->y--;
                case "R", "RIGHT" ->x++;
                case "L", "LEFT" ->x--;
                default ->processWord(word);
            }
        }
        return new int[]{x,y};
    }
    public static void processWord(String input){
        String word;
        int count;
        if (input.contains("x")){
            String[] words = input.split("x");
            if (words.length==2) {
                count = Integer.parseInt(words[0]);
                word = words[1];
                switch (word){
                    case "UP"->y+=count;
                    case "DOWN"->y-=count;
                    case "RIGHT"->x+=count;
                    case "LEFT"->x-=count;
                }
            }

        }
    }
}
