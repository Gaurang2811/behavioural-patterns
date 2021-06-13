package com.broncosoftech.memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MementoExampleEveryDayDemo {

	private static Customer deserialize() {

		Customer customer = null;
		try {
			FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			customer = (Customer) in.readObject();
			in.close();
			fileIn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return customer;
	}

	private static void serialize(Customer customer) {

		try {
			FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(customer);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setName("Gaurang Omar");
		customer.setAddress("Gurgaon");
		customer.setPhoneNumber("+91-9999-999-999");
		System.out.println(customer);

		serialize(customer);

		Customer newCustomer = deserialize();
		System.out.println(newCustomer);
	}

}

class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	private String phoneNumber;

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

}
