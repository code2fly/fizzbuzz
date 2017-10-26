package com.johnsnowtarg.fizzbuzz;

public class FizzBuzz {


	/**
	 * Method for calculating FizzBuzz result
	 * 
	 */
	public static FizzBuzzResult getFizzBuzzFor(int upperBound) {
		
		checkUpperBound(upperBound);		
		FizzBuzzResult fizzBuzzResult = computeFizzBuzz(upperBound);
				
		return fizzBuzzResult;
	}
	
	private static void checkUpperBound(int upperBound) {
		if(upperBound <= 0) {
			throw new IllegalArgumentException("number smaller than 1");
		}
	}

	private static FizzBuzzResult computeFizzBuzz(int upperBound) {
		FizzBuzzResult fizzBuzzResult = new FizzBuzzResult();
		for (int i = 1; i <= upperBound ; i++) {
			if(i%3 == 0 && i % 5 == 0){
				fizzBuzzResult.getFizzBuzz().add(i);
			}
			else if(i % 3 == 0) {
				fizzBuzzResult.getFizz().add(i);
			}
			else if(i % 5 == 0) {
				fizzBuzzResult.getBuzz().add(i);
			}
			
		}
		return fizzBuzzResult;
	}


}
