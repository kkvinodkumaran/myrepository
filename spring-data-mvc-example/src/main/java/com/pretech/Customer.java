package com.pretech;

public class Customer {
	public String name;
	public String address;

	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Customer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}

}
