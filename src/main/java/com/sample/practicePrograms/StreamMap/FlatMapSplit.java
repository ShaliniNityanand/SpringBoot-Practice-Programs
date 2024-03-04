package com.sample.practicePrograms.StreamMap;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class FlatMapSplit {

    public static void main(String[] args)
    {
        List<String> sentences = Arrays.asList("Java is Object Oriented Programming", "SpringBoot Framework"); //creating list of sentence
        List<String> words = sentences.stream() //converting list of streams
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Split sentences into words (flattens all streams of words into single stream)
                .collect(Collectors.toList()); //puts into a single stream (one list)
        System.out.println(words);
    }
}
