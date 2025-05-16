package com.example.demo.practice;

import java.util.Arrays;

public class Cordinate {
    public static void main(String[] args) {
        String input1 = "DOWN UP 2xRIGHT DOWN 3xLEFT";
        int[] result;
        if (isInputSimplified(input1)) {
            result = findCordinates(input1);
        } else {
            String simplifiedInput = simplifyInput(input1);
            System.out.println(simplifiedInput);
            result = findCordinates(simplifiedInput);
        }
        System.out.println(Arrays.toString(result));

    }

    private static String simplifyInput(String input) {
        StringBuilder simplifyInput = new StringBuilder();
        String[] split = input.toUpperCase().split(" ");
        for (String str : split) {
            String word = str;
            int count = 1;
            if (str.contains("X")) {
                String[] x = str.split("X");
                if (x.length==2) {
                    count = Integer.parseInt(x[0]);
                    word = x[1];
                }

            }
            char dirChar = switch (word) {
                case "UP" -> 'U';
                case "DOWN" -> 'D';
                case "RIGHT" -> 'R';
                case "LEFT" -> 'L';
                default -> throw new IllegalStateException("Unexpected value: " + word);
            };

            simplifyInput.append(String.valueOf(dirChar).repeat(count));
        }
        return simplifyInput.toString();
    }

    private static int[] findCordinates(String input) {
        int x = 0, y = 0;
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case 'U' -> y++;
                case 'D' -> y--;
                case 'R' -> x++;
                case 'L' -> x--;

            }
        }
        return new int[]{x, y};
    }

    private static boolean isInputSimplified(String input) {
        return input.matches("[UDRLudrl]");
    }
}
