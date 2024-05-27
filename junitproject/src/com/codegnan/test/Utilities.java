// Sample utility package 
package com.codegnan.test; 

// A simple utility class with two feature methods 
public class Utilities { 
	// function to check whether a number is prime 
	public static boolean isPrime(long n) 
	{ 
		// optimised loop for sqrt(n) 
		for (long val = 2; val * val <= n; val++) { 
			// checking the divisibility of n with val 
			if (n % val == 0) { 
				return false; 
			} 
		} 
		return n > 1; 
	} 
	// function to check the given number is even 
	public static boolean isEven(long n) 
	{ 
		return !((n & 1) == 1); 
	} 
}
