package com.broncosoftech.chainofresponsibility;

public class ChainOfResponsibility {

	public static void main(String[] args) {
		Director nikhil = new Director();
		VP bhavik = new VP();
		CEO alok = new CEO();

		nikhil.successor(bhavik);
		bhavik.successor(alok);

		Request request = new Request(RequestType.CONFERENCE, 0);
		nikhil.handleRequest(request);

		request = new Request(RequestType.PURCHSE, 1000);
		nikhil.handleRequest(request);

		request = new Request(RequestType.PURCHSE, 2000);
		nikhil.handleRequest(request);

		request = new Request(RequestType.PURCHSE, 1000);
		bhavik.handleRequest(request);
	}

}
