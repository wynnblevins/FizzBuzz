package com.dominionconsulting.fizzbuzz;

public class FizzBuzz {

	public void run(int input) {		
		if (input % 3 == 0 && input % 5 == 0) {
			System.out.println(input + " fizzbuzz");
		}
		else if (input % 5 == 0) {
			System.out.println(input + " buzz");
		}
		else if (input % 3 == 0) {
			System.out.println(input + " fizz");
		}
		else {
			System.out.println(input);
		}
	}
	
}
