package com.sample.practicePrograms.StreamFilter;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class FilterSort {
    public static void main(String[] args)
    {
        String[] seasons = {"Summer","Winter","Rainy","Autumn","Spring"};
        Arrays.stream(seasons)
                .filter(x->x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);


    }
}
