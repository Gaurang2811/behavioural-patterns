package com.broncosoftech.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverExampleEveryDayDemo {

	public static void main(String[] args) {
		Client c1 = new Client("Gaurang");
		Client c2 = new Client("Shivang");

		TwitterStream twitterStream = new TwitterStream();
		twitterStream.addObserver(c1);
		twitterStream.addObserver(c2);

		twitterStream.someoneTweeted();
	}
}


// Concrete Subject
class TwitterStream extends Observable {

	public void someoneTweeted() {
		setChanged();
		notifyObservers();
	}
}

// Concrete Observer
class Client implements Observer {

	private String name;

	public Client(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Update: " + name + "'s feed. Someone has tweeted!");
	}

}
