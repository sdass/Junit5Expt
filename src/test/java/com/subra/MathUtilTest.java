package com.subra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class) //giving the test running context and runner. MUST to recognize @Test
public class MathUtilTest {
	
	@Test
	public void multiply (){
		double expected = 27.0;
		MathUtil mu = new MathUtil();
		double actual = mu.multiply(3, 9);
		Assertions.assertEquals(expected, actual);
		System.out.println("Is it testing?");
	}

}
