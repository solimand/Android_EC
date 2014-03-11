package org.project.droolsDSL.javaSession;

import org.project.droolsDSL.javaModel.conditions.AndDescr;
import org.project.droolsDSL.javaModel.conditions.CompoundDescr;
import org.project.droolsDSL.javaModel.conditions.DifferentDescr;
import org.project.droolsDSL.javaModel.conditions.LessDescr;
import org.project.droolsDSL.javaModel.conditions.LessEqualsDescr;
import org.project.droolsDSL.javaModel.conditions.MoreDescr;
import org.project.droolsDSL.javaModel.conditions.MoreEqualsDescr;
import org.project.droolsDSL.javaModel.conditions.NotDescr;
import org.project.droolsDSL.javaModel.conditions.NullCondition;
import org.project.droolsDSL.javaModel.conditions.OrDescr;
import org.project.droolsDSL.javaModel.conditions.RelationDescr;
import org.project.droolsDSL.javaModel.conditions.SameDescr;
import org.project.droolsDSL.javaModel.conditions.TrueCondition;
import org.project.droolsDSL.javaSession.conditions.ConditionImpl;
import org.project.droolsDSL.javaSession.conditions.Less;
import org.project.droolsDSL.javaSession.conditions.Same;
import org.project.droolsDSL.javaSession.expressions.Expression;
import org.project.droolsDSL.javaSession.expressions.ExpressionImpl;

public class ConditionVisitorImpl implements ConditionVisitor {

	private ExpressionVisitor exprVisitor = new ExpressionVisitorImpl();
	
	@Override
	public ConditionImpl visit(AndDescr andInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConditionImpl visit(OrDescr orInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConditionImpl visit(NotDescr notInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConditionImpl visit(NullCondition nullConditionInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConditionImpl visit(DifferentDescr differentInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConditionImpl visit(LessDescr lessInstance) {
		Expression expr1 = new ExpressionImpl();
		Expression expr2 = new ExpressionImpl();
		expr1.follow(lessInstance.getExp1().accept(this.exprVisitor));
		expr2.follow(lessInstance.getExp2().accept(this.exprVisitor));
		Less sessionLess = new Less(expr1, expr2);
		return sessionLess;
	}

	@Override
	public ConditionImpl visit(LessEqualsDescr lessEqualsInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConditionImpl visit(MoreDescr moreInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConditionImpl visit(MoreEqualsDescr moreEqualsInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Same visit(SameDescr sameInstance) {
		Same sessionSame = new Same(sameInstance.getExp1().accept(this.exprVisitor),
				sameInstance.getExp1().accept(this.exprVisitor));
		return sessionSame;
	}

	@Override
	public ConditionImpl visit(CompoundDescr compoundInstance) {
		return null;
	}

	@Override
	public ConditionImpl visit(RelationDescr relationInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConditionImpl visit(TrueCondition trueInstance) {
		// TODO Auto-generated method stub
		return null;
	}

}
