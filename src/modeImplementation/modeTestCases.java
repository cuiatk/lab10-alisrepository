package modeImplementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class modeTestCases {
	myMode m= new myMode();
	@Test
	void allNumbersExistsOneTime() {
		int[] arr = {1,2,3,4,5,6,7,8,9} ;
		long output = m.getMode(arr);
		assertEquals(1,output);
	}
	
	@Test
	void oneNumberExistsMoreThanOneTime() {
		int[] arr = {1,2,3,4,5,5,5,8,9} ;
		long output = m.getMode(arr);
		assertEquals(5,output);
	}
	
	@Test
	void twoNumbersExistsMoreThanOneTime() {
		int[] arr = {1,2,4,4,5,5,5,8,9} ;
		long output = m.getMode(arr);
		assertEquals(5,output);
	}
	
	@Test
	void arrayIsempty() {
		int[] arr = {} ;
		long output = m.getMode(arr);
		assertEquals(0,output);
	}

}
