package com.dominionconsulting;

import java.util.Scanner;

import com.dominionconsulting.fizzbuzz.FizzBuzz;

public class App {
	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		int input = getUserInput();
		fizzBuzz.run(input);
	}
	
	private static int getUserInput() {
		System.out.print("Please enter an integer: ");
		Scanner scanner = new Scanner(System.in);
		return Integer.parseInt(scanner.next());
	}
}
