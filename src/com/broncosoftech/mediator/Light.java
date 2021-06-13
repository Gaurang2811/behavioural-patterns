package com.broncosoftech.mediator;

public class Light {

	private String name;
	private boolean isOn = false;

	public boolean isOn() {
		return isOn;
	}

	public String getName() {
		return name;
	}

	public Light(String name) {
		this.name = name;
	}

	public void toggle() {
		if (isOn) {
			off();
			isOn = false;
		} else {
			on();
			isOn = true;
		}
	}

	public void on() {
		System.out.println("Switching on " + name + " the lights!");
	}

	public void off() {
		System.out.println("Switching off " + name + " the lights!");
	}

}
