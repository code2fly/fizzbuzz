package com.johnsnowtarg.fizzbuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldReturnEmptyFizzAndEmptyBuzz() {
		int upperBound = 2;
		FizzBuzzResult fizzbuzzResult = FizzBuzz.getFizzBuzzFor(upperBound);
		assertThat(fizzbuzzResult.getFizz(), is(empty()));
		assertThat(fizzbuzzResult.getBuzz(), is(empty()));
		assertThat(fizzbuzzResult.getFizzBuzz(), is(empty()));
	}

	@Test
	public void shouldReturnFizzAndEmptyBuzz() {
		FizzBuzzResult fizzbuzzResult = FizzBuzz.getFizzBuzzFor(3);
		assertThat(fizzbuzzResult.getFizz(), is(Arrays.asList(3)));
		assertThat(fizzbuzzResult.getBuzz(), is(empty()));
		assertThat(fizzbuzzResult.getFizzBuzz(), is(empty()));
	}
	
	
	
	@Test
	public void shouldReturnBothFizzAndBuzz() {
		FizzBuzzResult fizzbuzzResult = FizzBuzz.getFizzBuzzFor(6);
		assertThat(fizzbuzzResult.getFizz(), is(Arrays.asList(3,6)));
		assertThat(fizzbuzzResult.getBuzz(), is(Arrays.asList(5)));
		assertThat(fizzbuzzResult.getFizzBuzz(), is(empty()));
	}
	
	@Test
	public void shouldReturnAllFizzAndBuzzAndFizzBuzz() {
		FizzBuzzResult fizzbuzzResult = FizzBuzz.getFizzBuzzFor(15);
		assertThat(fizzbuzzResult.getFizz(), is(Arrays.asList(3,6,9,12)));
		assertThat(fizzbuzzResult.getBuzz(), is(Arrays.asList(5,10)));
		assertThat(fizzbuzzResult.getFizzBuzz(), is(Arrays.asList(15)));
	}
	
	
	@Test(expected= IllegalArgumentException.class)
	public void shouldThrowForZero() {
		FizzBuzz.getFizzBuzzFor(0);		
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void shouldThrowForNegativeNumber() {
		FizzBuzz.getFizzBuzzFor(-3);		
	}

}
