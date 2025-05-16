package com.example.demo.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Peach", "Apricot", "Berry");
        numbers.stream().filter(i -> i % 2 != 0).forEach(s -> System.out.print(s + ","));
        System.out.println();
        int maxNum = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("The max number in the given List is :" + maxNum);
        Double avg = numbers.stream().mapToInt(Integer::intValue).filter(s -> s % 2 == 0).average().getAsDouble();
        System.out.println("The average of the even Numbers is :" + avg);
        long count = words.stream().filter(w -> w.startsWith("A")).count();
        System.out.println("The count of the words which starts with A is " + count);
        List<String> words1 = Arrays.asList("java", "stream", "example");
        List<String> uppperCaseWords = words1.stream().map(s -> s.toUpperCase()).toList();
        System.out.println(uppperCaseWords);
        List<Integer> numbers1 = Arrays.asList(5, 3, 9, 5, 1, 3, 8);
        List<Integer> sortedList = numbers1.stream().distinct().sorted().toList();
        System.out.println(sortedList);
        List<String> words2 = Arrays.asList("apple", "bat", "batman", "cherry", "dog", "elephant");
        Map<Integer, List<String>> group = words2.stream().collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(group);
        List<String> words3 = Arrays.asList("Hello", "World", "Java", "Stream");
        String singleString = words3.stream().collect(Collectors.joining(" "));
        System.out.println(singleString);
        List<String> words4 = Arrays.asList("apple", "banana", "cherry", "date", "kiwi");
        String first = words4.stream().filter(s -> s.length() > 5).toList().getFirst();
        System.out.println(first);
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> doubled = numbers2.stream().map(a -> a + a).toList();
        System.out.println(doubled);
        List<Integer> numbers3 = Arrays.asList(5, 7, 8, 9, 11, 12, 13);
        Integer divisibleBy3 = numbers3.stream().filter(s -> s % 3 == 0).toList().getFirst();
        System.out.println(divisibleBy3);
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cherry", "date"),
                Arrays.asList("kiwi", "lemon")
        );
        List<String> list = listOfLists.stream().flatMap(a -> a.stream()).toList();
        System.out.println(list);


    }
    }
