package com.subra;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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

	private static MathUtil mu;

	enum  Pet{ CAT, DOG};

	@BeforeEach //Junit-4 equivalent @Before
	void init(){
		mu = new MathUtil();
	}
	@AfterAll //Junit-4 eqiovalent @AfterClass
	static void tearDown(){
		System.out.println("tear down ... to be called finalize");
		mu = null;
	}

	@Test
	public void multiply (){
		double expected = 27.0;
		double actual = mu.multiply(3, 9);
		Assertions.assertEquals(expected, actual);
		System.out.println("Is it testing?");
	}

	@Test
	void testExpectedException(){
		//double x = 9, y = 2;
		//double expected = 4.5;
		//double actual = mu.divide(x,y);
		//Assertions.assertEquals(expected, actual);
		final double x1 = 9, y1 = 0;
		//Assertions.assertThrows(IllegalArgumentException.class, mu.divide(9, 0))
		//Assertions.assertThrows(Exception.class, () ->{ mu.divide(x1,0.0);});
		Assertions.assertThrows(ArithmeticException.class, () ->{ mu.divide(x1,0.0);});

	}

	@Test
	void testExpectedParseException(){
		final String strnum = "99.s"; // suppose to be int or double to be parsed
		Assertions.assertThrows(NumberFormatException.class, ()-> mu.parseCustomDouble(strnum));
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
