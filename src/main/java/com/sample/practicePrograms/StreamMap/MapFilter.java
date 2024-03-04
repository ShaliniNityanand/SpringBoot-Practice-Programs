package com.sample.practicePrograms.StreamMap;

import org.apache.catalina.Lifecycle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MapFilter {
    public static void main(String[] args)
    {
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x->x.startsWith("a"))
                .forEach(System.out::println);

        people
                .stream()
                .map(String::toUpperCase)
                .filter(y->y.startsWith("S"))
                .forEach(System.out::println);

        people
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }


}
