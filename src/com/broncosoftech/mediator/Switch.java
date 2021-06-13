package com.broncosoftech.mediator;

public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}

}
