package com.broncosoftech.memento;

import java.util.Stack;

// Caretaker - responsible for saving the history
public class Caretaker {

	private Stack<EmployeeMemento> employeeMementos = new Stack<EmployeeMemento>();

	public void save(Employee emp) {
		employeeMementos.push(emp.save());
	}

	public void revert(Employee emp) {
		emp.revert(employeeMementos.pop());
	}
}
