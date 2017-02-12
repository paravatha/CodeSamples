package com.string;

import java.util.Scanner;

/*
 * Find Palindromes
 * @author Prasad Paravatha
 */
public class Palindromes {
	/*
	 * Find if a string is a palindrome - Recursion 
	 */
	public static boolean isPalindrome(String val) {
		boolean palindrome = false;
		char[] charArray = val.toCharArray();
		int strLength = charArray.length;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == charArray[--strLength]) {
				palindrome = true;
			}
		}
		return palindrome;
	}

	/*
	 * Find if a string is a palindrome - Recursion 
	 */
	public static boolean isPalindromeRecursion(String val) {
		char[] charArray = val.toCharArray();
		int strLength = charArray.length;
		if(strLength == 0 || strLength == 1)
            return true; 
		if (charArray[0] == charArray[strLength-1]) {
			return isPalindromeRecursion(val.substring(1 , strLength - 1));
		}
		return false;
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to chek if its a palindromeab ");
        String palindromeStr = scanner.nextLine();
		
		if(isPalindrome(palindromeStr) && isPalindromeRecursion(palindromeStr))
			System.out.println(palindromeStr + " is a palindrome");
		else
			System.out.println(palindromeStr + " is not a palindrome");		
	}

}
