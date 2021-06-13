package com.broncosoftech.observer;

public class TabletClient extends Observer {

	public TabletClient(Subject subject) {
		this.subject = subject;
		subject.adttach(this);
	}

	public void addMessage(String message) {
		subject.setState(message + " - sent from Tablet.");
	}

	@Override
	void update() {
		System.out.println("Tablet Stream: " + subject.getState());
	}

}
