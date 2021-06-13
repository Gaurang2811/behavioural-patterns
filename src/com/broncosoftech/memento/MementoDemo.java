package com.broncosoftech.memento;

public class MementoDemo {

	public static void main(String[] args) {

		Caretaker caretaker = new Caretaker();

		Employee employee = new Employee();
		employee.setName("Gaurang Omar");
		employee.setAddress("Gurgaon");
		employee.setPhoneNumber("+91-9999-999-999");
		System.out.println("Initial: " + employee);
		caretaker.save(employee);

		employee.setPhoneNumber("+91-8888-888-888");
		System.out.println("Changed and save: " + employee);
		caretaker.save(employee);

		employee.setPhoneNumber("+91-7777-777-777");
		employee.setName("Danny Dang");
		System.out.println("Changed and save: " + employee);
		caretaker.save(employee);

		employee.setName("Manal Milan");
		System.out.println("Changed and not save: " + employee);

		caretaker.revert(employee);
		System.out.println("Revert: " + employee);

		caretaker.revert(employee);
		System.out.println("Revert: " + employee);

		caretaker.revert(employee);
		System.out.println("Revert: " + employee);

	}

}
