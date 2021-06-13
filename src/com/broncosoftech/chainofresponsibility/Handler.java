package com.broncosoftech.chainofresponsibility;

public abstract class Handler {
	
	protected Handler successor;
	
	public void successor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(Request request);

}
