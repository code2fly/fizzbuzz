package com.johnsnowtarg.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author MOHITPAN
 * class to define the result of 
 *
 */
public class FizzBuzzResult {
	
	private List<Integer> fizz;
	
	private List<Integer> buzz;
	
	private List<Integer> fizzBuzz;
	
	public FizzBuzzResult() {
		fizz = new ArrayList<Integer>();
		buzz = new ArrayList<Integer>();
		fizzBuzz = new ArrayList<Integer>();
	}

	public List<Integer> getFizz() {
		return fizz;
	}

	public void setFizz(List<Integer> fizz) {
		this.fizz = fizz;
	}

	public List<Integer> getBuzz() {
		return buzz;
	}

	public void setBuzz(List<Integer> buzz) {
		this.buzz = buzz;
	}

	public List<Integer> getFizzBuzz() {
		return fizzBuzz;
	}

	public void setFizzBuzz(List<Integer> fizzBuzz) {
		this.fizzBuzz = fizzBuzz;
	}
	
	

}
