package com.broncosoftech.command;

import java.util.List;

public class ToggleAllCommand implements Command {

	private List<Light> lights;

	public ToggleAllCommand(List<Light> lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		for (Light light : lights) {
			if (light.isOn()) {
				light.off();
			}
		}
	}

}
