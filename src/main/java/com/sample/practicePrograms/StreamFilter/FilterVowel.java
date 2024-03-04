package com.sample.practicePrograms.StreamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterVowel {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Java","Is","A", "Object" ,"Oriented","Programming");

        List<String> namesStartingWithVowel = names.stream()
                .filter(name -> name.charAt(0) == 'a' ||
                        name.charAt(0) == 'e' ||
                        name.charAt(0) == 'i' ||
                        name.charAt(0) == 'o' ||
                        name.charAt(0) == 'u' ||
                        Character.toUpperCase(name.charAt(0)) == 'A' ||
                        Character.toUpperCase(name.charAt(0)) == 'E' ||
                        Character.toUpperCase(name.charAt(0)) == 'I' ||
                        Character.toUpperCase(name.charAt(0)) == 'O' ||
                        Character.toUpperCase(name.charAt(0)) == 'U')

                .collect(Collectors.toList());

        System.out.println("Names starting with a vowel (case insensitive): " + namesStartingWithVowel);
    }
}
