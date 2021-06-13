package com.broncosoftech.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

	private List<Light> lights = new ArrayList<Light>();

	public void addLight(Light light) {
		lights.add(light);
	}

	public void turnOnAll() {
		for (Light light : lights) {
			if (!light.isOn()) {
				light.toggle();
			}
		}
	}

	public void turnOffAll() {
		for (Light light : lights) {
			if (light.isOn()) {
				light.toggle();
			}
		}
	}

}
