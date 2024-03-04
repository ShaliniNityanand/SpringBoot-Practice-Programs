package com.sample.practicePrograms.StreamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterSpecialCharacter {
    public static void main(String[] args)
    {
        // Sample list of sentences
        List<String> sentences = Arrays.asList("This is a Sentence",
                "Another sentence*!",
                "No $pecial characters here#");

        // Define a Predicate to check for special characters
        Predicate<Character> isSpecialCharacter = character -> !Character.isLetterOrDigit(character) && !Character.isWhitespace(character);

        // Filter sentences with any special characters
        List<String> sentencesWithSpecialChars = sentences.stream()
                .filter(sentence -> sentence.chars()
                        .mapToObj(c -> (char) c)
                        .anyMatch(isSpecialCharacter))
                .collect(Collectors.toList());

        // Print the filtered sentences
        System.out.println("Sentences with special characters:");
        sentencesWithSpecialChars.forEach(System.out::println);
    }

}
