package com.ngochung.functional;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> isEven = x -> x % 2 == 0;
		System.out.println(isEven.test(4)); // result is true
		System.out.println(isEven.test(5)); // result is false
	}
}
