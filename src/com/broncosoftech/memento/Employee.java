package com.broncosoftech.memento;

/**
 * @author Gaurang
 *
 *         We wern't interested in address hence we didn't added address in
 *         EmployeeMemento. We can also use Serialization and use transient on
 *         address field.
 */
// Originator- Original Object we want to track history of
public class Employee {

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
		return "Employee [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

	public EmployeeMemento save() {
		return new EmployeeMemento(name, phoneNumber);
	}

	public void revert(EmployeeMemento memento) {
		this.name = memento.getName();
		this.phoneNumber = memento.getPhoneNumber();
	}
}
