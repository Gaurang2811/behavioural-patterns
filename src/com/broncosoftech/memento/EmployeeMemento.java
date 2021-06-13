package com.broncosoftech.memento;

// Memento- object saved by Caretaker
public class EmployeeMemento {

	private String name;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public EmployeeMemento(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

}
