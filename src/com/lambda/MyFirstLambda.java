package com.lambda;

public class MyFirstLambda {

	public static void main(String[] args) {

		/*
		 * MyFirstLambda mf = new MyFirstLambda(); System.out.println(mf.add(4, 5));
		 */

		Something lame = (a, b) -> a + b;
		
	System.out.println(lame.myBad(29, 5));
		
		//System.out.println(l.myBad(4, 5));

	}

	public int add(int a, int b) {
		return a + b;
	}

	interface Something {
		int myBad(int xase, int easy);
	}
}
