package com.lambda.something;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PopulatingTheList {

	public boolean addingIntoTheList() {

		List<Person> personList = Arrays.asList(

				new Person("nike", "lName", "29age"), new Person("mike", "frlName", "301"),
				new Person("bike", "welName", "291"), new Person("cike", "delName", "129"));
		/**
		 * before sorting
		 */

		for (Person per : personList) {
			System.out.println(per);
		}

		// comparing with lname
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {

				return o1.getlName().compareTo(o2.getlName());
			}

		});

		System.out.println("============================================================");
		for (Person per : personList) {
			System.out.println(per);
		}

		return true;
	}

}
