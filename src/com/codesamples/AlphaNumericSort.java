package com.codesamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem Description:
 * Given a mixed array of numbers and alphanumeric terms, please implement a method that will 
 * return a sorted array such that the numbers are in numeric order, and the alphanumeric terms 
 * are in alphabetical order subject to the following constraints:
 * 1. For any index n in the array, the type of value at index n must be the same in the input and
 *    result arrays – e.g., given the input array { 12, beta, 10, alpha } the positions (0, 2) are numeric, 
 *    while the positions (1, 3) are alphanumeric, so the sorted result should be { 10, alpha, 12, beta }.
 * 2. The maximum size of the input array is 1,000,000 items.
 * 3. Use the method signature : public String[] sortMixedArray(String[] input)
 *  
 *  Assumptions: The numeric values are assumed to be only for Integers.
 * @author Prasad Paravatha
 * 
 */
public class AlphaNumericSort {
	private static final int MAX_ARRAY_SIZE = 1000000;

	/*
	 * For a give input array (Mix of Integers and Strings), this method
	 * return a sorted array as described in the problem description.
	 * @param input array of Strings
	 * @return mixedArray array of Strings
	 */
	public String[] sortMixedArray(String[] input) {
		String[] sortedArray = null;
		System.out.println();
		// check the size of input array. if greater than 1000000, return null;
		if(input.length <= MAX_ARRAY_SIZE) {
			//Initialize the sorted array
			sortedArray = new String[input.length];
			//Initialize indexes and arrays.
			ArrayList<Integer> numericIndex = new ArrayList<Integer>();
			ArrayList<Integer> stringIndex = new ArrayList<Integer>();
			ArrayList<Integer> numericInput = new ArrayList<Integer>();
			ArrayList<String> stringInput = new ArrayList<String>();

			//Build separate indexes and arrays for Integers and Strings
			List<String> arraylist =  Arrays.asList(input);
			int index = 0;
			for(String value : arraylist) {
				if(isNumeric(value)) {
					numericIndex.add(index);
					numericInput.add(Integer.valueOf(value));
				} else {
					stringIndex.add(index);
					stringInput.add(value);
				}
				index++;
			}
			System.out.println("numericIndex = " + numericIndex);
			System.out.println("stringIndex = " + stringIndex);
			System.out.println("numericInput = " + numericInput);
			System.out.println("stringInput = " + stringInput);

			// Sort the Integer and String arrays.
			Collections.sort(numericInput);
			Collections.sort(stringInput);
			System.out.println("numericInput after sort = " + numericInput);
			System.out.println("stringInput after sort= " + stringInput);

			//Build the final sorted array as specified in the problem description.
			int numIndex = 0, strIndex = 0;
			for(int mixedArrayIndex = 0; mixedArrayIndex < input.length; mixedArrayIndex++) {
				if(numericIndex.contains(mixedArrayIndex)) {
					sortedArray[mixedArrayIndex] = String.valueOf(numericInput.get(numIndex));
					numIndex++;
				} else if(stringIndex.contains(mixedArrayIndex)) {
					sortedArray[mixedArrayIndex] = stringInput.get(strIndex);
					strIndex++;
				}
			}
		}
		return sortedArray;
	}

	/*
	 * Checks if the given String is numeric or not
	 * @param value as String
	 * @return boolean is numeric
	 */
	public boolean isNumeric(String value)  {  
		try  {  
			double numeric = Double.parseDouble(value);  
		} catch(NumberFormatException numberFormatException) {  
			return false;  
		}  
		return true;  
	}

	/*
	 * Prints the array string on the console
	 * @param input as a array of Strings
	 */
	public void printList(String[] input) {
		for(int index = 0; index < input.length; index++) {
			System.out.print(input[index] + " ");
		}
	}
}
