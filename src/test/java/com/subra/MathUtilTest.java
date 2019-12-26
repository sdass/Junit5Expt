package com.subra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
/*
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
*/


// @RunWith(JUnitPlatform.class) //giving the test running context and runner. MUST to recognize @Test
// Taken over my maven sure fire plugin
public class MathUtilTest {


	enum  Pet{ CAT, DOG};

	@Test
	public void multiply (){
		double expected = 27.0;
		MathUtil mu = new MathUtil();
		double actual = mu.multiply(3, 9);
		Assertions.assertEquals(expected, actual);
		System.out.println("Is it testing?");
	}

	//https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-writing-parameterized-tests/
	@ParameterizedTest //it is subset of @Test
	@ValueSource(strings = {"fifty", "ten", "eight"})
	void shouldPassNonNullStringParam(String num){
		Assertions.assertNotNull(num);
	}


	@EnumSource(Pet.class) //works
	//@EnumSource(value = Pet.class, names = {"DOG"} ) works
	@ParameterizedTest(name = "{index} ----:: {0}") //works
	void shouldPassEnumValParam(Pet apet){
		Assertions.assertNotNull(apet);
	}


}
