package com.understanding.collections;

public class College {

	private int id;
	private String name;
	private String address;

	public College(int id, String name, String address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
