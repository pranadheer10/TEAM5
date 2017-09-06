package com.Immutable;

public final class ImmutableClass {

	private String name;
	private PersonalDetails personal_Details;
	
	public ImmutableClass(String name, PersonalDetails personal_Details) {
		
	this.name=name;
	this.personal_Details= new PersonalDetails(personal_Details.getFullName(), personal_Details.getFullName(),personal_Details.getAge());
	}

	public String getName() {
		return name;
	}

	

	public PersonalDetails getPersonal_Details() {
		return new PersonalDetails(personal_Details.getFullName(), personal_Details.getFullName(),personal_Details.getAge());
	}

}
