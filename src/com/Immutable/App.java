package com.Immutable;

public class App {

	public static void main(String[] args) {
		
		PersonalDetails pd= new PersonalDetails("dhiru", "123456789", "24");
		ImmutableClass ic= new ImmutableClass("D29", pd);
		ic.getPersonal_Details().setAge("30");
		System.out.println(ic.getName()+ic.getPersonal_Details());
	}
}
