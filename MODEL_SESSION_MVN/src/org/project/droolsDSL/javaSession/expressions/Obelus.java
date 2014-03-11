package org.project.droolsDSL.javaSession.expressions;

import org.project.droolsDSL.javaSession.Value;

public class Obelus extends OperationImpl implements Operation {

	public Obelus(Expression expr1, Expression expr2) {
        super(expr1, expr2);
        assert invariant() : "Illegal state in Obelus(Expression, Expression)";
	}
	
	@Override
	public Value evaluate(Value val1, Value val2) {
		Value result = val1.divide(val2);
        assert invariant() : "Illegal state in Obelus.evaluate(Expression, Expression)";
        return result;
	}
	
	private boolean invariant() {
        return (true);
	}
}
