package com.subra;

public class MathUtil {
	
	public double multiply (double x, double y){
		return x * y;
	}

	public String getUpper (String numString){
		return numString.toUpperCase();
	}

	public double divide (double x, double y) throws ArithmeticException {
		System.out.println("in divide()... " + x + " ... " + y);
		try {
			if (y == 0)
				throw new ArithmeticException("Division by zero");
			return x/y;
		}catch (ArithmeticException e){
			System.out.println("Logging the desc: " + e.getMessage());
			throw e;
		}
	}

	public double parseCustomDouble (String n) throws NumberFormatException{
		try {
			return Double.parseDouble(n);
		}catch (NumberFormatException e){
			System.out.println("In parseCustomDouble: " + e.getMessage() + " " + e.getClass().getName());
			throw e;
		}
	}


}
