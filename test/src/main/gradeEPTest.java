package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class gradeEPTest {
	
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
	@Test
	public void testIsPrimeNumberTCA() {
		for(int i=90; i<=100; i++)
		{
			Assert.assertEquals('A', letterGradeChecker.letterGrade(i));
		}
	}	
	@Test
	public void testIsPrimeNumberTCB() {
		for(int i=80; i<90; i++)
		{
			Assert.assertEquals('B', letterGradeChecker.letterGrade(i));
		}
	}	
	@Test
	public void testIsPrimeNumberTCC() {
		for(int i=70; i<80; i++)
		{
			Assert.assertEquals('C', letterGradeChecker.letterGrade(i));
		}
	}	
	@Test
	public void testIsPrimeNumberTCD() {
		for(int i=60; i<70; i++)
		{
			Assert.assertEquals('D', letterGradeChecker.letterGrade(i));
		}
	}
	@Test
	public void testIsPrimeNumberTCF() {
		
		Assert.assertEquals('F', letterGradeChecker.letterGrade(40));
		
	}

}
