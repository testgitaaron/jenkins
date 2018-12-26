package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class gradeBVATest {

	private grade letterGradeChecker;

	@BeforeEach
	void setUp() throws Exception {
		letterGradeChecker = new grade();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testIsPrimeNumberTCX() {
		Assert.assertEquals('X', letterGradeChecker.letterGrade(-1));
		Assert.assertEquals('X', letterGradeChecker.letterGrade(101));
		
	}

}
