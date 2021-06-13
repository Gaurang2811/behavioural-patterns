package com.broncosoftech.chainofresponsibility;

public class CEO extends Handler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("Approved, I can approve anything. - by CEO");
	}

}
