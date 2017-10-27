package com.johnsnowtarg.fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MainTest {

	/**
	 * display list as a comma seperated string
	 */
	@Test
	public void testgetDelimitedList() {
		assertEquals("1,2,4,7", Main.getDelimitedList(Arrays.asList(1,2,4,7), ","));
	}

}
