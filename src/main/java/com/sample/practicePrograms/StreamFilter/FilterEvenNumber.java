package com.sample.practicePrograms.StreamFilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class FilterEvenNumber {
    public static void main(String[] args)
    {
        SpringApplication.run(FilterEvenNumber.class, args);

        // Sample list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers using stream and filter
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter condition
                .toList(); // Collect filtered elements into a list

        // Print the filtered even numbers
        System.out.println("Even Numbers: " + evenNumbers);

        List<Integer> oddNumbers = numbers.stream()
                .filter(on-> on%2!=0)
                .toList();

        System.out.println("Odd Numbers: "+oddNumbers);
    }


}
