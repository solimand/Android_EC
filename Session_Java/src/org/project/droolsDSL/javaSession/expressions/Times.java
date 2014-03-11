package org.project.droolsDSL.javaSession.expressions;

import org.project.droolsDSL.javaSession.Value;

public class Times extends OperationImpl implements Operation {

	public Times(Expression expr1, Expression expr2) {
        super(expr1, expr2);
        assert invariant() : "Illegal state in Times(Expression, Expression)";
	}
	
	@Override
	public Value evaluate(Value val1, Value val2) {
		Value result = val1.multiply(val2);
        assert invariant() : "Illegal state in Times.evaluate(Expression, Expression)";
        return result;
	}
	
	private boolean invariant() {
        return (true);
	}
}
