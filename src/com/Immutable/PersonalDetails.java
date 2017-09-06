package com.Immutable;

public class PersonalDetails {

	private String fullName;
	private String phoneNumber;
	private String age;

	public PersonalDetails(String fullName, String phoneNumber, String age2) {
		this.fullName=fullName;
		this.phoneNumber=phoneNumber;
		this.age=age2;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonalDetails [fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", age=" + age + "]";
	}

}
