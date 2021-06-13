package com.broncosoftech.chainofresponsibility;

public class Request {

	private RequestType requestType;
	private double amount;

	public Request(RequestType requestType, double amount) {
		this.requestType = requestType;
		this.amount = amount;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
