package com.broncosoftech.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new MessageStream();

		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);

		phoneClient.addMessage("Hi, Here is a message.");
		tabletClient.addMessage("Hello, another message comes in!");

	}
}
