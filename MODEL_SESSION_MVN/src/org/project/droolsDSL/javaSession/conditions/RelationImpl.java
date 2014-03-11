package org.project.droolsDSL.javaSession.conditions;

import org.project.droolsDSL.javaSession.Value;
import org.project.droolsDSL.javaSession.expressions.Expression;

public abstract class RelationImpl extends ConditionImpl implements Relation {

	private Expression expr1;
	private Expression expr2;
//	 private Condition expr1;
//     private Condition expr2;
     private boolean first1;
     private boolean first2;
     private Value val1;
     private Value val2;
     
     public RelationImpl(Expression expr1, Expression expr2) {
         super();
         if (expr1 == null)
                 throw new IllegalArgumentException(
                                 "Illegal 'expr1' argument in RelationImpl(Expression, Expression): "
                                                 + expr1);
         if (expr2 == null)
                 throw new IllegalArgumentException(
                                 "Illegal 'expr2' argument in RelationImpl(Expression, Expression): "
                                                 + expr2);
         this.first1 = true;
         this.first2 = true;
         this.expr1 = expr1;
         this.expr2 = expr2;
         this.val1 = null;
         this.val2 = null;
         expr1.follow(this);
         expr2.follow(this);
         assert invariant() : "Illegal state in RelationImpl(Expression, Expression)";
     }

	@Override
	public Value getValue1() {
		assert invariant() : "Illegal state in RelationImpl.getValue1()";
        return val1;
	}

	@Override
	public Value getValue2() {
		assert invariant() : "Illegal state in RelationImpl.getValue2()";
        return val2;
	}

	@Override
	public void update(Expression expression) {
		if (expression == null)
            throw new IllegalArgumentException(
                            "Illegal 'expression' argument in ExpressionImpl.update(Expression): "
                                            + expression);
	    Value current = expression.getValue();
	    if (expression.equals(expr1) && (first1 || !val1.equals(current))) {
	            this.val1 = current;
	            first1 = false;
	    }
	    if (expression.equals(expr2) && (first2 || !val2.equals(current))) {
	            this.val2 = current;
	            first2 = false;
	    }
	    // if (first1 && first2) // removed because I accept null values.
	    handle(evaluate());
	    assert invariant() : "Illegal state in OperationImpl.update(Expression)";
	}

	
	private boolean invariant() {
        return (expr1 != null && expr2 != null);
	}
}
