package com.example.demo.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindIPAddress {
    public static void main(String[] args) {
        String [] ips={
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };
        System.out.println(findMaxOccuredIp(ips));
    }

    private static String findMaxOccuredIp(String[] ips) {
        Map<String,Integer> occurance=new LinkedHashMap<>();
        int maxOccurance=1;
        String obj=null;
        for (int i = 0; i < ips.length; i++) {
            ips[i]= ips[i].split(" ")[0];
            occurance.put(ips[i], occurance.getOrDefault(ips[i],0)+1);
            if (occurance.get(ips[i])>maxOccurance){
                maxOccurance=occurance.get(ips[i]);
                obj=ips[i];
            }
        }

        return obj+" "+ maxOccurance ;
    }
}
