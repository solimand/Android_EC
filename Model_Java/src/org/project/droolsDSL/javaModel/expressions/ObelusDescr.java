package org.project.droolsDSL.javaModel.expressions;

import org.project.droolsDSL.javaModel.ExpressionDescr;
import org.project.droolsDSL.javaSession.ExpressionVisitor;
import org.project.droolsDSL.javaSession.expressions.OperationImpl;

public class ObelusDescr extends OperationDescr implements ExpressionDescr {

	public ObelusDescr(ExpressionDescr exp1, ExpressionDescr exp2) {
        super(exp1, exp2);
        assert invariant() : "Illegal state in ObelusDescr(ExpressionDescr, ExpressionDescr)";
	}

	@Override
	public String toString() {
        String result = getExp1() + " / " + getExp2();
        assert invariant() : "Illegal state in ObelusDescr(ExpressionDescr, ExpressionDescr)";
        return result;
	}
	
	private boolean invariant() {
        return (true);
	}

	@Override
	public OperationImpl accept(ExpressionVisitor exprVisitor) {
		return exprVisitor.visit(this);
	}

}
