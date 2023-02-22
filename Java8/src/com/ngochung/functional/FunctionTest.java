package com.ngochung.functional;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<String, Integer> stringToLength = str -> str.length();
		System.out.println(stringToLength.apply("Hello"));
	}
}
