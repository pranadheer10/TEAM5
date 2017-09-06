package com.Singleton;

public class Singleton {

	private static Singleton singleton;
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private Singleton() {
		if (singleton != null) {
			throw new RuntimeException("Object already exists");
		}
	}

	public static Singleton getSingleton() {
		return singleton;
	}

	public static void setSingleton(Singleton singleton) {
		Singleton.singleton = singleton;
	}
	
	public void displaySomething() {
		System.out.println("Display Something");
	}
	
	public static Singleton getSingletonObj() {

		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}

		}
		return singleton;
	}
	
	

}
