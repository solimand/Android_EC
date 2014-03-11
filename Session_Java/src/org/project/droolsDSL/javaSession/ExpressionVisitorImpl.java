package org.project.droolsDSL.javaSession;

import org.project.droolsDSL.javaModel.ExpressionDescr;
import org.project.droolsDSL.javaModel.expressions.MinusDescr;
import org.project.droolsDSL.javaModel.expressions.NumberDescr;
import org.project.droolsDSL.javaModel.expressions.ObelusDescr;
import org.project.droolsDSL.javaModel.expressions.ParameterDescr;
import org.project.droolsDSL.javaModel.expressions.PlusDescr;
import org.project.droolsDSL.javaModel.expressions.SampleDescr;
import org.project.droolsDSL.javaModel.expressions.TimesDescr;
import org.project.droolsDSL.javaSession.expressions.Expression;
import org.project.droolsDSL.javaSession.expressions.ExpressionImpl;
import org.project.droolsDSL.javaSession.expressions.Minus;
import org.project.droolsDSL.javaSession.expressions.OperationImpl;
import org.project.droolsDSL.javaSession.expressions.Sample;
import org.project.droolsDSL.javaSession.expressions.Number;

public class ExpressionVisitorImpl implements ExpressionVisitor {

	@Override
	public Minus visit(MinusDescr minusInstance) {
		Expression expr1 = new ExpressionImpl();
		Expression expr2 = new ExpressionImpl();
		expr1.follow(minusInstance.getExp1().accept(this));
		expr2.follow(minusInstance.getExp1().accept(this));
		
		Minus sessionMinus = new Minus(expr1, expr2);
		return sessionMinus;
	}

	@Override
	public OperationImpl visit(PlusDescr plusInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OperationImpl visit(ObelusDescr obelusInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OperationImpl visit(TimesDescr timesInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression visit(NumberDescr numberInstance) {
		Expression numberSession = new Number(numberInstance.getValue());
		return numberSession;
	}

	@Override
	public OperationImpl visit(ParameterDescr parameterInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sample visit(SampleDescr sampleInstance) {
		Sample sampleSession = new Sample(new FluentImpl(sampleInstance.getName()));
		return sampleSession;
	}

	@Override
	public OperationImpl visit(ExpressionDescr expression) {
		expression.accept(this);
		return null;
	}

}
