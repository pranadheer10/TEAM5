package com.understanding.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collectionss {

	public void working() {

		College col1 = new College(123, "MyCollname", "123address");
		College col2 = new College(124, "HisCollname", "124address");
		College col3 = new College(125, "OurCollname", "125address");
		College col4 = new College(126, "HerCollname", "126address");


		Students student1 = new Students(100, "dhiru");
		Students student2 = new Students(101, "pradeep");
		Students student3 = new Students(102, "ravi");
		Students student4 = new Students(103, "john");

		List<Students> studentsList = new ArrayList<Students>();

		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		studentsList.add(student4);

		// Iterating with regular for
		System.out.println("boring for loop");
		for (int i = 0; i < studentsList.size(); i++) {

			System.out.println(studentsList.get(i));

		}
		// using for loop (enhanced)
		System.out.println("Used enhanced for");
		for (Students student : studentsList) {
			System.out.println(student);
		}

		// Using Iterator

		Iterator<Students> itr = studentsList.iterator();
		System.out.println("USing Iterator");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// return studentsList;

	}

}
