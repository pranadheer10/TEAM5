package com.lambda;

public class Lambda_With_InnerClass {

	public boolean innerClass() {
		
		System.out.println("used lambda expressions");
		My_Lambda_Interface stringCon= (a,b)->a.concat(b);
		stringCon.concinatingString("dhi", "ru");
		
		System.out.println("anyno");
		My_Lambda_Interface sillyTest= new My_Lambda_Interface() {
			
			@Override
			public String concinatingString(String s1, String s2) {
				return s1.concat(s2);
			}
		};
		sillyTest.concinatingString("dhe", "eru");
		
		return true;
	}
	
	
	
}
