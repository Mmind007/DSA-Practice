package com.example.demo.practice;

import java.util.*;

public class FindSecondHighest {
    public static void main(String[] args) {
        String[][] input = {{"Alice", "90"}, {"Bob", "85"}, {"Alice", "95"}, {"Charlie", "78"}, {"Bob", "80"}, {"Charlie", "82"}};
        System.out.println(Arrays.toString(findSecondHighest(input)));
    }

    private static String[] findSecondHighest(String[][] input) {
        String name="";
        String sName="";
        double max=0.0;
        double secondAvg=0.0;
        Map<String, List<Integer>> avgs=new HashMap<>();
        for (String[] arr:input){
            double avg=0.0;
            if (!avgs.containsKey(arr[0])) {
                List<Integer> integerList = new ArrayList<>();
                integerList.add(1);
                integerList.add(Integer.valueOf(arr[1]));
                avgs.put(arr[0],integerList);
            } else if (avgs.containsKey(arr[0])) {
                List<Integer> integerList1 = avgs.get(arr[0]);
                integerList1.set(0,integerList1.get(0)+1);
                integerList1.set(1, integerList1.get(1)+Integer.valueOf(arr[1]));
                int total = integerList1.get(1) / integerList1.get(0);
                System.out.println(total);
                integerList1.set(1,total);
                avgs.put(arr[0],integerList1);
            }
            avg=avgs.get(arr[0]).get(1)/avgs.get(arr[0]).get(0);
            if (avg>max){
                sName=name;
                secondAvg=max;
                max=avgs.get(arr[0]).get(1);
                name=arr[0];
            }
        }


        System.out.println(max);
        System.out.println(secondAvg);
        System.out.println(avgs);
        return new String[]{sName,String.valueOf(secondAvg)};
    }
}
