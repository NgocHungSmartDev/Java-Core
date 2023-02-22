package com.ngochung.optional;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		// check null
		String name = null;
		if (name != null) {
			System.out.println("Name is " + name.toUpperCase());
		} else {
			System.out.println("Name is not present");
		}

		// Optional
		Optional<String> optionalName = Optional.ofNullable(name);
		if (optionalName.isPresent()) {
			System.out.println("Name is " + optionalName.get().toUpperCase());
		} else {
			System.out.println("Name is not present");
		}

	}
}
