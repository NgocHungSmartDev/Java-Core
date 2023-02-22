package com.ngochung.switchcase;

public class SwitchTest {
	public static void main(String[] args) {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("It's Friday, yay!");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");
		default -> System.out.println("Invalid day of week");
		}
	}
}
