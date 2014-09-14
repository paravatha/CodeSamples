package com.codesamples;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
/*
 * Unit Test class to test CurrencyDenomination use-cases.
 */
public class CurrencyDenominationTest {
	private static CurrencyDenomination currencyDenomination;

	/*
	 * One-time initialization code  
	 */
	@BeforeClass
	public static void oneTimeSetUp() {
		currencyDenomination = new CurrencyDenomination();
	}

	/*
	 * Test case to calculate number of US currency notes 
	 */
	@Test
	public void testMakeChangeForUSCurrencyNotes() {
		//Default currency for CurrencyDenomination class is USD.
		int noOfUSDBills = currencyDenomination.makeChange(135);
		assertEquals(4, noOfUSDBills);
	}

	/*
	 * Test case to calculate number of Danish currency notes 
	 */
	@Test
	public void testMakeChangeForDanishCurrencyNotes() {
		//Set Danish currency denomination
		int [] danishCurrencyDenominations = {1000, 500, 200, 100, 50};
		currencyDenomination.setDenominations(danishCurrencyDenominations);
		
		int noOfDanishBills = currencyDenomination.makeChange(1355);
		assertEquals(4, noOfDanishBills);
	}

	/*
	 * One-time cleanup code
	 */
	@AfterClass
	public static void oneTimeTearDown() {
		currencyDenomination = null;
	}
}
