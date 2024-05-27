package com.codegnan.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilitiesTest1 {

	
    // test 1 for checking the static isPrime method 
    // from Utilities class 
    // Test annotations are being used to create JUnit tests 

	/*
	 * @Test void testIsPrime() { fail("Not yet implemented"); }
	 */
	/*
	 * @Test void testIsEven() { fail("Not yet implemented"); }
	 */
	@Test
	void testIsPrime1(){ 
        assertTrue(Utilities.isPrime(13)); 
    } 
    
    // test 2 to check the isprime method 
    @Test
    void testIsPrime2(){ 
        assertFalse(Utilities.isPrime(18)); 
    } 
    
    // test 1 to check the static isEven method 
    // from Utilities class 
    @Test
    void testIsEven1(){ 
        assertFalse(Utilities.isEven(19)); 
    } 
    
    // test 2 to check the isEven method 
    @Test
    void testIsEven2(){ 
        assertTrue(Utilities.isEven(80)); 
    } 
    

}
