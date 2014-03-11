package org.project.droolsDSL.javaSession.conditions;

import org.project.droolsDSL.javaSession.Value;
import org.project.droolsDSL.javaSession.expressions.Expression;

public interface Relation extends Condition{	 
	public boolean evaluate();
    public Value getValue1();
    public Value getValue2();
    public void update(Expression expression);
}
