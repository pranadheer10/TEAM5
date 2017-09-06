package com.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Singleton single= Singleton.getSingletonObj();
		single.setAge(291212);
		single.setName("dhirdadu");
		single.displaySomething();

		Singleton single1= Singleton.getSingletonObj();
		single.setAge(30);
		single.setName("dhiru");
		System.out.println(single.getName()+" "+single1.getAge());
		
		
		Class singleClass =Class.forName(Singleton.class.getName());
		Constructor<Singleton> prv= singleClass.getDeclaredConstructors()[0];
	prv.setAccessible(true);
	Singleton single3= (Singleton)prv.newInstance(null);
	single3.displaySomething();
	}

}
