package com.subra;

public class Main {

	public static void main(String[] args) {
		System.out.println("This is test");
		
		MathUtil mUtil = new MathUtil();
		double r = mUtil.multiply(9, 3);
		System.out.println(r);
		System.out.println(mUtil.getUpper("fifty"));
		

	}

}
