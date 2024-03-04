package com.sample.practicePrograms.StreamMap;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class MapSquare {
    public static void main(String[] args)
    {
        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x->x*x)
                .average()
                .ifPresent(System.out::println);
    }

}
