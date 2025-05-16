package com.example.demo.practice;

import java.util.*;

public class HighestAverage {
    public static void main(String[] args) {
        String[][] input = {{"Alice", "90"}, {"Bob", "85"}, {"Alice", "95"}, {"Charlie", "78"}, {"Bob", "80"}, {"Charlie", "82"}};
        System.out.println(Arrays.toString(findSecondHighest(input)));
    }

    private static String[] findSecondHighest(String[][] input) {
        Map<String,List<Integer>> avg=new LinkedHashMap<>();
        double highestAvg=0.0;
        String student=null;
        for (String[] arr:input){
            if (!avg.containsKey(arr[0])) {
                List<Integer> integerList = new ArrayList<>();
                integerList.add(1);
                integerList.add(Integer.valueOf(arr[1]));
                avg.put(arr[0],integerList);
            } else if (avg.containsKey(arr[0])) {
                List<Integer> integerList = avg.get(arr[0]);
                integerList.set(0,integerList.get(0)+1);
                integerList.set(1, integerList.get(1)+Integer.parseInt(arr[1]));
            }
        }
        Map<String,Double> avgs=new HashMap<>();
         for (String key: avg.keySet()){
             List<Integer> integerList = avg.get(key);
             double avg1= (double) integerList.get(1) /integerList.get(0);
             if (avg1>highestAvg){
                 highestAvg=avg1;
                 student=key;
             }
             avgs.put(key,avg1);

         }
        return new String[]{student, String.valueOf(highestAvg)};
    }
}
