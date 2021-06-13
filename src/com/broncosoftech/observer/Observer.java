package com.broncosoftech.observer;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
