package com.subra;

public class Main {

	public static void main(String[] args)  {
		System.out.println("This is test");
		
		MathUtil mUtil = new MathUtil();
		double r = mUtil.multiply(9, 3);
		System.out.println(r);
		System.out.println(mUtil.getUpper("fifty"));
		try {
			System.out.println(mUtil.divide(7, 0));

			System.out.println(mUtil.parseCustomDouble("9.9"));
		}catch (Exception e){
			System.out.println("herer 1: " + e.getMessage());
		}
		System.out.println(mUtil.parseCustomDouble("18.9"));
		//System.out.println(mUtil.parseDouble(null)); // ("9.9ss"));
		System.out.println(mUtil.parseCustomDouble("9.9ss"));

	}

}
