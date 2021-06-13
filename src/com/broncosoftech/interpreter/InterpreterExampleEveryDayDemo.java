package com.broncosoftech.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterExampleEveryDayDemo {

	public static void main(String[] args) {
		String input = "Lions, and tigers, and bears!, Oh,my god!";

		Pattern p = Pattern.compile("(lion|cat|dog|tiger|bear|human|elephant|Lion)");
		Matcher m = p.matcher(input);

		while (m.find()) {
			System.out.println("Found: " + m.group());
		}
	}
}
