package com.johnsnowtarg.fizzbuzz;

import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;



public class Main {
	
	
	public static void main(String[] args) {
		
		/**
		 * take user input and check for valid upperbound value
		 */
		Scanner userInput = new Scanner(System.in);
		int upperBound = getUpperBoundary(userInput);
		
		// Evaluate fizzbuzz 
		FizzBuzzResult fizzbuzzResult = FizzBuzz.getFizzBuzzFor(upperBound);
		
		displayFizzBuzzResult(fizzbuzzResult);
	}
	
	
	/**
	 * method to get upperbound from user and print error in case of invalid input
	 */
	public static int getUpperBoundary(Scanner scan) {    
		int userData;
		// prompt user to enter upperbound until valid value is supplied
		while (true) {
			try {         
				System.out.print("Enter FizzBuzz upper boundary: ");
				
				//throws exception if user input is not a integer
				userData = Integer.valueOf(scan.nextLine());
				
				// checks if the user input is positive integer
				if(FizzBuzz.isUpperBoundValid(userData)){
					return userData;
				}
				
			} 
			catch (NumberFormatException e) {
				System.out.println(Constants.UPPERBOUNDARY_NOT_VALID_INTEGER_MSG);
			}
			catch (IllegalArgumentException e) {
				System.out.println(Constants.NEGATIVE_UPPERBOUNDARY_MSG);
			}
		}
	}
	
	/**
	 * method to display final result
	 */
	private static void displayFizzBuzzResult(FizzBuzzResult fizzbuzzResult) {
		
		System.out.println("\n\n\nFizzBuzz Results");
		System.out.println("====================================");
		System.out.println("Fizz: "+ getDelimitedList(fizzbuzzResult.getFizz(), ", "));
		System.out.println("Buzz: "+ getDelimitedList(fizzbuzzResult.getBuzz(), ", "));
		System.out.println("FizzBuzz: "+ getDelimitedList(fizzbuzzResult.getFizzBuzz(),", "));
		
	}

	/**
	 * get list data to print as comma separated string
	 */
	public static String getDelimitedList(List<Integer> list, String delimiter){
		StringJoiner joiner = new StringJoiner(delimiter);
		for (Integer item : list) {
			joiner.add(item.toString());
		}
		return joiner.toString();
	}
	

}
