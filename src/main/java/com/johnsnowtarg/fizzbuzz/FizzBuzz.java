package com.johnsnowtarg.fizzbuzz;

public class FizzBuzz {

	/**
	 * Method for calculating FizzBuzz result
	 * 
	 */
	public static FizzBuzzResult getFizzBuzzFor(int upperBound) {

		FizzBuzzResult fizzBuzzResult = computeFizzBuzz(upperBound);

		return fizzBuzzResult;
	}

	/**
	 * 
	 * method to check upperbound entered by user is valid
	 */
	public static boolean isUpperBoundValid(int upperBound) {
		if (upperBound < 0) {
			throw new IllegalArgumentException("Error : Enter a upperbound greater than 0");
		}
		return true;
	}

	/**
	 * 
	 * method to compute fizzbuzz for entered upperbound by user
	 */
	private static FizzBuzzResult computeFizzBuzz(int upperBound) {
		FizzBuzzResult fizzBuzzResult = new FizzBuzzResult();
		for (int i = 1; i <= upperBound; i++) {
			if (isDivisibleBy3(i) && isDivisibleBy5(i)) {
				fizzBuzzResult.getFizzBuzz().add(i);
			} else if (isDivisibleBy3(i)) {
				fizzBuzzResult.getFizz().add(i);
			} else if (isDivisibleBy5(i)) {
				fizzBuzzResult.getBuzz().add(i);
			}

		}
		return fizzBuzzResult;
	}

	private static boolean isDivisibleBy3(int value) {
		return value % 3 == 0;
	}

	private static boolean isDivisibleBy5(int value) {
		return value % 5 == 0;
	}

}
