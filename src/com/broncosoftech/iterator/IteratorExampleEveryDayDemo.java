package com.broncosoftech.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExampleEveryDayDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("first");
		lst.add("second");
		lst.add("third");

		System.out.println("List size before Iterator: " + lst.size());
		
		Iterator<String> itr = lst.iterator();
		while (itr.hasNext()) {
			String el = itr.next();
			System.out.println(el);
			itr.remove();
		}
		System.out.println("List size after Iterator: " + lst.size());
		
		// this internally uses the Iterator
		for (String str : lst) {
			System.out.println(str);
		}
		
		// this will not work with the Set
		for (int i = 0; i < lst.size(); i++) {
			String str = lst.get(0);
			System.out.println(str);
		}

	}
}
