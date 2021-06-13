package com.broncosoftech.chainofresponsibility;

public class VP extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (RequestType.PURCHSE == request.getRequestType()) {
			if (request.getAmount() < 1500) {
				System.out.println("Purchase amount approved as amound was less than 1500. - by VP");
			} else {
				successor.handleRequest(request);
			}
		}
	}

}
