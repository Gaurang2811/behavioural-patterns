package com.broncosoftech.command;

import java.util.Arrays;

public class CommandDemo {

	public static void main(String[] args) {

		// demo for single light switch
		Light light = new Light("Light");
		Switch lightSwitch = new Switch();

		Command onCommand = new ToggleCommand(light);

		lightSwitch.storeAndExecute(onCommand);

		// demo to turn off all lights
		Light kitchenLight = new Light("Kitchen Light");
		Light hallLight = new Light("Hall Light");
		Light roomLight = new Light("Room Light");
		Light storeLight = new Light("Store Light");
		Switch switchs = new Switch();

		Command kitchenLightOnCommand = new ToggleCommand(kitchenLight);
		Command hallLightOnCommand = new ToggleCommand(hallLight);
		Command roomLightOnCommand = new ToggleCommand(roomLight);
		Command storeLightOnCommand = new ToggleCommand(storeLight);

		Command toggleCommand = new ToggleAllCommand(Arrays.asList(kitchenLight, hallLight, roomLight, storeLight));

		switchs.storeAndExecute(kitchenLightOnCommand);
		switchs.storeAndExecute(roomLightOnCommand);
		switchs.storeAndExecute(toggleCommand);
	}
}
