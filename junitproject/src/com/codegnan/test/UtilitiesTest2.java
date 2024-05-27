// Example for JUnit conditional annotations

package com.codegnan.test;

// Importing the necessary classes
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codegnan.test.Utilities;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

// A simple JUnit test class
class UtilitiesTest {
	// Disabling the test for Windows 64 bit
	// using the OS conditional Annotation.
	@Test
	@DisabledOnOs(value = OS.WINDOWS,
				architectures = "amd64")
	void
	dontRunThisOnWindowsWith64Bit(){
		assertTrue(Utilities.isPrime(13));
	}

	// Enabling the below test for Windows OS
	@Test @EnabledOnOs(OS.WINDOWS) void runOnWindows(){
		assertTrue(Utilities.isPrime(71));
	}

	// Enabling the test for Java version
	// 17 or higher
	@Test
	@EnabledForJreRange(min = JRE.JAVA_17)
	void runOnlyOnJava17OrHigher(){
		assertFalse(Utilities.isPrime(18));
	}

	// Enabling the test if the JVM System Property
	// matches to the regex passed
	@Test
	@EnabledIfSystemProperty(named = "java.version",
							matches = "17.*.*")
	void runOnOnlyJava17(){
		assertFalse(Utilities.isEven(19));
	}

	// Enabling the test if the regex passes
	// for Environment Variable
	@Test
	@EnabledIfEnvironmentVariable(named = "HOMEDRIVE",
								matches = "C:")
	void checkHomeDriveEnvVariable(){
		assertTrue(Utilities.isEven(80));
	}
}
