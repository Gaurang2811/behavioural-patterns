package com.broncosoftech.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

	private String[] bikes;
	private int index;

	public BikeRepository() {
		bikes = new String[10];
		index = 0;
	}

	public int size() {
		return index;
	}

	public void addBike(String bike) {
		if (index == bikes.length) {
			String[] largerBikes = new String[index + 5];
			System.arraycopy(bikes, 0, largerBikes, 0, index);
			bikes = largerBikes;
			largerBikes = null;
		}
		bikes[index++] = bike;
	}

	@Override
	public Iterator<String> iterator() {
		Iterator<String> iterator = new Iterator<String>() {

			private int cursor = 0;

			@Override
			public boolean hasNext() {
				return cursor < bikes.length && null != bikes[cursor];
			}

			@Override
			public String next() {
				return bikes[cursor++];
			}

			@Override
			public void remove() {
				String[] removedBikes = new String[bikes.length - 1];
				System.arraycopy(bikes, 0, removedBikes, 0, cursor);
				System.arraycopy(bikes, cursor + 1, removedBikes, cursor, bikes.length - cursor - 1);
				bikes = removedBikes;
				index--;
				removedBikes = null;
			}
		};

		return iterator;
	}

}
