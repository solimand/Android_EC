package org.project.droolsDSL.javaSession.expressions;

import org.project.droolsDSL.javaSession.Value;
import org.project.droolsDSL.javaSession.conditions.Relation;

public interface Expression {

	/**
	 * 		expression includes relations
	 */
	public void follow(Expression expression);
	public void follow(Relation expression);

    /**
     * 		evaluation
     */
    public Value getValue();

    public void handle(Value value);

    public void update(Expression expression);

}
