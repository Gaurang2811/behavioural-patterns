package com.broncosoftech.mediator;

public class MediatorDemo {
	public static void main(String[] args) {
		Light kitchenLight = new Light("Kitchen Light");
		Light hallLight = new Light("Hall Light");
		Light roomLight = new Light("Room Light");
		Light storeLight = new Light("Store Light");
		Switch switchs = new Switch();

		Mediator mediator = new Mediator();
		mediator.addLight(kitchenLight);
		mediator.addLight(storeLight);
		mediator.addLight(roomLight);
		mediator.addLight(hallLight);

		TurnOnAllLights onAllLights = new TurnOnAllLights(mediator);
		/**
		 * We can directly call the below( i.e.: onAllLights.execute()), but in order to
		 * implement command pattern we will give this command to Switch.
		 */
		// onAllLights.execute();
		switchs.storeAndExecute(onAllLights);
		System.out.println("**** Turned On all lights ****\n");

		TurnOffAllLights offAllLights = new TurnOffAllLights(mediator);
		// offAllLights.execute();
		switchs.storeAndExecute(offAllLights);
		System.out.println("**** Turned Off all lights ****");

	}
}
