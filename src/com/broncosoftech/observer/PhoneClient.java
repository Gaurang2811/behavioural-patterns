package com.broncosoftech.observer;

public class PhoneClient extends Observer {

	public PhoneClient(Subject subject) {
		this.subject = subject;
		subject.adttach(this);
	}

	public void addMessage(String message) {
		subject.setState(message + " - sent from phone.");
	}

	@Override
	void update() {
		System.out.println("Phone Stream: " + subject.getState());
	}

}
