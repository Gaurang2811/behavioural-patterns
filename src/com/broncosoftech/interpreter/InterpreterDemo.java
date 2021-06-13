package com.broncosoftech.interpreter;

public class InterpreterDemo {

	static Expression buildInterpreterTree() {
		Expression LionsterExp = new TerminalExpression("Lions");
		Expression tigerTerExp = new TerminalExpression("Tigers");
		Expression bearsTerExp = new TerminalExpression("Bears");

//		Tigers Or Bears
		Expression tigerOrBear = new OrExpression(tigerTerExp, bearsTerExp);

//		Lions And (Tigers Or Bears)
		Expression lionsAndTigerOrBear = new AndExpression(LionsterExp, tigerOrBear);

		return lionsAndTigerOrBear;
	}

	public static void main(String[] args) {
//		String context = "Lions";
//		String context = "Tigers";
//		String context = "Bears";
		String context = "Lions Tigers";
//		String context = "Lions Bears";
//		String context = "Tigers Bears";

		Expression define = buildInterpreterTree();
		System.out.println(context + " is " + define.intercept(context));
	}
}
