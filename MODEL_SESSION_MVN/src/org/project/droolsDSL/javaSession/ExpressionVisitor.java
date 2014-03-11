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
import org.project.droolsDSL.javaSession.expressions.OperationImpl;
import org.project.droolsDSL.javaSession.expressions.Sample;

public interface ExpressionVisitor {
	OperationImpl visit(MinusDescr minusInstance);
	OperationImpl visit(PlusDescr plusInstance);
	OperationImpl visit(ObelusDescr obelusInstance);
	OperationImpl visit(TimesDescr timesInstance);
	
	Expression visit(NumberDescr numberInstance);
	OperationImpl visit(ParameterDescr parameterInstance);
	Sample visit(SampleDescr sampleInstance);
	
	OperationImpl visit(ExpressionDescr expression);
}
