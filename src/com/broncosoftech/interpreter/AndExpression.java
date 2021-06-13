package com.broncosoftech.interpreter;

public class AndExpression implements Expression {

	Expression expression1 = null;
	Expression expression2 = null;

	public AndExpression(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public boolean intercept(String context) {
		return expression1.intercept(context) && expression2.intercept(context);
	}

}
