package com.sample.practicePrograms.StreamFilter;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@SpringBootApplication
public class FilterForEach
{
    public static void main(String[] args)
    {
        List<String> subjects = Arrays.asList("Python","Java","C","SQL");
//      Functional method
        subjects.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String subject) {
                        return !subject.equals("SQL");
                    }
                })
                .forEach(System.out::println);
    }

}
