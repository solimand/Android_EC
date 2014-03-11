package org.project.droolsDSL.javaSession.conditions;

import org.project.droolsDSL.javaSession.expressions.Expression;

public class LessEquals extends RelationImpl implements Relation {

	public LessEquals(Expression expr1, Expression expr2) {
        super(expr1, expr2);
        // assert invariant() : "Illegal state in Same(Expression, Expression)";
	}
	 @Override
     public boolean evaluate() {
             boolean result = getValue1().compareTo(getValue2()) <= 0;
             // assert invariant() : "Illegal state in Same.evaluate()";
             return result;
     }

}
