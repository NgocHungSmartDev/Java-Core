package com.ngochung.functional;

import java.util.function.BiPredicate;

public class BiPredicateTest {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isGreaterThan = (x, y) -> x > y;
		System.out.println(isGreaterThan.test(5, 3));
		System.out.println(isGreaterThan.test(2, 7));
	}
}
