package com.ngochung.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
	public static void main(String[] args) {
		// create runnable.
		Runnable r = () -> {
			System.out.println("Hello, world!");
		};
		
		r.run();
		
		// sort list number.
		List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
		Collections.sort(numbers, (a, b) -> b.compareTo(a));
		System.out.println(numbers);
		
		// filter items.
		List<String> words = Arrays.asList("apple", "banana", "orange", "pear");
		List<String> filteredWords = words.stream()
		                                   .filter(w -> w.startsWith("a"))
		                                   .collect(Collectors.toList());
		System.out.println(filteredWords);
		
		// calculate number.
		int sum = numbers.stream()
		                 .mapToInt(i -> i)
		                 .sum();
		System.out.println(sum);
	}
}
