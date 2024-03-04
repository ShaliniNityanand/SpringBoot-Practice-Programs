package com.sample.practicePrograms.StreamMap;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootApplication
public class StreamFlatMap {
    public static void main(String[] args)
    {
        List<String> sentences = Arrays.asList("This is a sentence", "Another sentence");
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Split sentences into words
                .collect(Collectors.toList());
        System.out.println(words);
    }

}
