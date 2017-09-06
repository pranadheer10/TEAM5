package com.lambda.something;

public class Person {

	private String fName;
	private String lName;
	private String age;
	
	
	public Person(String fName, String lName, String age) {

		this.fName=fName;
		this.lName=lName;
		this.age=age;
	}
	
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}

	
	
	
}
