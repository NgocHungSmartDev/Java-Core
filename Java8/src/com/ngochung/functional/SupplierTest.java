package com.ngochung.functional;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<Double> getRandomNumber = () -> Math.random();
		System.out.println(getRandomNumber.get());
	}
}
