package com.ngochung.functional;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> printMessage = message -> System.out.println(message);
		printMessage.accept("Hello World!"); // print "Hello World!"
	}
}
