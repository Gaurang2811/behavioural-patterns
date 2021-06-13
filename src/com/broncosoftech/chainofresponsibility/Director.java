package com.broncosoftech.chainofresponsibility;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (RequestType.CONFERENCE == request.getRequestType()) {
			System.out.println("Conference approved, Allocating room. - by Director");
		} else {
			successor.handleRequest(request);
		}
	}

}
