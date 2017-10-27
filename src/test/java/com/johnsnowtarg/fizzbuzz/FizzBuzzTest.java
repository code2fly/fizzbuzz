package com.johnsnowtarg.fizzbuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class FizzBuzzTest {

	/**
	 * TEST for VALID INPUTS 
	 * 
	 * should take positive number as a valid input
	 */
	
	@Test
	public void testisUpperBoundValidForPositiveNumber() {
		FizzBuzz.isUpperBoundValid(1);
	}
	
	/* 
	 * should return empty list for all fizz,buzz,fizzbuzz for upperbound as 0
	 */
	@Test
	public void testgetFizzBuzzForZero() {
		int upperBound = 0;
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getFizz(), is(empty()));
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getBuzz(), is(empty()));
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getFizzBuzz(), is(empty()));
	}

	/**
	 * should return empty list for all fizz,buzz,fizzbuzz for upperbound as 1
	 */
	@Test
	public void testgetFizzBuzzForOne() {
		int upperBound = 1;
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getFizz(), is(empty()));
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getBuzz(), is(empty()));
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getFizzBuzz(), is(empty()));
	}

	/**
	 * should return 3 in fizz and empty buzz,fizzbuzz
	 */
	@Test
	public void testgetFizzBuzzForFour() {
		int upperBound = 4;
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getFizz(), is(Arrays.asList(3)));
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getBuzz(), is(empty()));
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getFizzBuzz(), is(empty()));
	}

	/**
	 * should return 3,6 in fizz and 5 in buzz with empty fizzbuzz
	 */
	@Test
	public void testgetFizzBuzzForSix() {
		int upperBound = 6;
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getFizz(), is(Arrays.asList(3, 6)));
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getBuzz(), is(Arrays.asList(5)));
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getFizzBuzz(), is(empty()));
	}

	/**
	 * should return 3,6,9,12 for fizz, 5,10 for buzz and 15 for fizzbuzz
	 */
	@Test
	public void testgetFizzBuzzForFifteen() {
		int upperBound = 15;
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getFizz(), is(Arrays.asList(3, 6, 9, 12)));
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getBuzz(), is(Arrays.asList(5, 10)));
		assertThat(FizzBuzz.getFizzBuzzFor(upperBound).getFizzBuzz(), is(Arrays.asList(upperBound)));
	}

	/**
	 * TEST for INVALID input
	 * 
	 * should throw exception for Negative numbers
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testisUpperBoundValidForNegativeNumber() {
		FizzBuzz.isUpperBoundValid(-1);
	}

}
