package com.ngochung.optional;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		// Optional
		Optional<String> optionalName = Optional.ofNullable("");
		if (optionalName.isPresent()) {
			System.out.println("Name is " + optionalName.get().toUpperCase());
		} else {
			System.out.println("Name is not present");
		}

	}
}
