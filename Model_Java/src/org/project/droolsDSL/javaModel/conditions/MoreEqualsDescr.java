package org.project.droolsDSL.javaModel.conditions;

import org.project.droolsDSL.javaModel.ConditionDescr;
import org.project.droolsDSL.javaModel.ExpressionDescr;
import org.project.droolsDSL.javaSession.ConditionVisitor;
import org.project.droolsDSL.javaSession.conditions.ConditionImpl;

public class MoreEqualsDescr extends RelationDescr implements ConditionDescr {

	 public MoreEqualsDescr(ExpressionDescr exp1, ExpressionDescr exp2) {
         super(exp1, exp2);
	 }
	
	 @Override
	 public String toString() {
	         String result = getExp1() + " >= " + getExp2();
	         return result;
	 }

	@Override
	public ConditionImpl accept(ConditionVisitor condVisitor) {
		return condVisitor.visit(this);
	}
}
