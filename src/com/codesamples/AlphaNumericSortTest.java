/**
 * 
 */
package com.codesamples;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test cases for the example scenarios mentioned in the problem description. 
 * @author Prasad Paravatha
 */
public class AlphaNumericSortTest {
	
	private static AlphaNumericSort alphaNumericSort;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		alphaNumericSort = new AlphaNumericSort();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * This is a test case for example one specified in the Code simulation document
	 * Input: { “10”, “2”, “washington”, “1”, “test”, “11” }
	 * Output: { “1”, “2”, “test”, “10”, “washington”, “11” }
	 */
	@Test
	public void testExampleOne() {
		String[] input = {"10", "2", "washington", "1", "test", "11" };
		String[] expectedOutput = { "1", "2", "test", "10", "washington", "11" };
		String[] sortedArray = alphaNumericSort.sortMixedArray(input);
		assertEquals("Both input and output arrays are same size", input.length, sortedArray.length );
		assertTrue("expectedOutput equals mixedArray  ", Arrays.equals(expectedOutput, sortedArray));
	}
	
	/**
	 * This is a test case for example two specified in the Code simulation document
	 * Input: { "6","testing","abc","5","1","beta","2321432","zeta","dog" } 
	 * Output: { “1”, “abc”, “beta”, “5”, “6”, “dog”, “2321432”, “testing”, “zeta” }
	 */
	@Test
	public void testExampleTwo() {
		String[] input = {"6","testing","abc","5","1","beta","2321432","zeta","dog", "4646SD"};
		String[] expectedOutput = { "1","4646SD", "abc", "5", "6","beta", "2321432", "dog", "testing", "zeta" };
		String[] sortedArray = alphaNumericSort.sortMixedArray(input);
		assertEquals("Both input and output arrays are same size", input.length, sortedArray.length );
		assertTrue("expectedOutput equals mixedArray  ", Arrays.equals(expectedOutput, sortedArray));
	}
	
	/**
	 * This is a test case for maximum size of the input array is 1000000 items.
	 * If the size of the input array is greater than 1000000 items, the response will be null;
	 */
	@Test
	public void testExampleThree() {
		String[] sortedArray = alphaNumericSort.sortMixedArray(buildArrayofMAXSize());
		assertNull("sortedArray should be null ", sortedArray);
	}
	/*
	 * This Utility method returns an array of size 1000010
	 */
	public String[] buildArrayofMAXSize() {
		int arraySize = 1000010;
		String[] bigArray = new String[arraySize];
		for(int index = 0; index < 1000010; index++) {
			bigArray[index] = "1";
		}
		return bigArray;
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass 
	public static void setUpAfterClass () throws Exception {
		alphaNumericSort = null;
	}

}
