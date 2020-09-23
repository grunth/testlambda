package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"work with pictures", "with", "with", "to a wide audience", "work with pictures", "work with pictures", "with"};
        String mostPopularString = Arrays
                .stream(arr)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet()
                .stream()
                .max((p1, p2) -> Long.compare(p1.getValue(), p2.getValue()))
                .get()
                .getKey();
        System.out.println("Строка, которая встречается чаще всего: "+mostPopularString);
        long cnt = Arrays.stream(mostPopularString.split(" ")).count();
        System.out.println("Количество слов в данной строке: " +cnt);
    }
}
