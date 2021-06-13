package com.broncosoftech.mediator;

public class TurnOnAllLights implements Command {

	private Mediator mediator;

	public TurnOnAllLights(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.turnOnAll();
	}

}
