package com.sample.practicePrograms.StreamFilter;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class RangeSkip {
    public static void main(String[] args)
    {
        IntStream.range(1,20)
                .skip(5)
                .forEach(System.out::println);


        System.out.println(IntStream.range(1,10)
                .sum());
        System.out.println();


        Stream.of("Summer","Winter","Rainy","Autumn","Spring")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }

}
