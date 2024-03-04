package com.sample.practicePrograms.StreamFilter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.function.IntPredicate;

public class FilterPrime {
    public static void main(String[] args)
    {
        IntStream stream = IntStream.range(1, 100);

        List<Integer> primes = stream.filter(FilterPrime::isPrime)
                .mapToObj(Integer::valueOf)
                .toList();

        System.out.println("Prime Numbers are : \n"+primes);
    }

    public static boolean isPrime(int i)
    {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }
}
