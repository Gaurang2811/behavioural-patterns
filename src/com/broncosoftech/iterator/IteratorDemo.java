package com.broncosoftech.iterator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		BikeRepository bikes = new BikeRepository();
		bikes.addBike("Ninja");
		bikes.addBike("Hayabusa");
		bikes.addBike("Intruder");
		bikes.addBike("R1000");

		System.out.println("List size before Iterator: " + bikes.size());

		for (String bike : bikes) {
			System.out.println(bike);
		}

		Iterator<String> bikeIterator = bikes.iterator();
		while (bikeIterator.hasNext()) {
			bikeIterator.remove();
		}

		System.out.println("List size after Iterator: " + bikes.size());

	}
}
