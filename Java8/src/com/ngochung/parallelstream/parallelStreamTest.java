package com.ngochung.parallelstream;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class parallelStreamTest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Case manually");
		System.out.println(LocalDateTime.now());
		long count = numbers.stream().filter(n -> n % 2 == 0).count();
		System.out.println(count);
		System.out.println(LocalDateTime.now());

		System.out.println("Case parallel");
		System.out.println(LocalDateTime.now());
		long parallelCount = numbers.parallelStream().filter(n -> n % 2 == 0).count();
		System.out.println(parallelCount);
		System.out.println(LocalDateTime.now());
	}
}
