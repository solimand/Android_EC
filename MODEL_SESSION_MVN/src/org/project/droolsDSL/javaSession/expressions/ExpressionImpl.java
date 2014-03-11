package org.project.droolsDSL.javaSession.expressions;

import java.util.HashSet;
import java.util.Set;

import org.project.droolsDSL.javaSession.Value;
import org.project.droolsDSL.javaSession.conditions.Relation;

public class ExpressionImpl implements Expression {

    private Set<Expression> expressions;
    private boolean first;
    private Set<Relation> relations;
    private Value value;

    public ExpressionImpl() {
        this.expressions = new HashSet<>();
        this.first = true;
        this.relations = new HashSet<>();
        this.value = null;
        assert invariant() : "Illegal state in ExpressionImpl()";
    }
    
	@Override
	public void follow(Expression expression) {
		if (expression == null)
            throw new IllegalArgumentException(
                            "Illegal 'expression' argument in ExpressionImpl.follow(Expression): "
                                            + expression);
	    expressions.add(expression);
	    assert invariant() : "Illegal state in ExpressionImpl.follow(Expression)";
	}
	
	@Override
    public void follow(Relation relation) {
        if (relation == null)
            throw new IllegalArgumentException(
                    "Illegal 'relation' argument in ExpressionImpl.follow(Relation): "
                       + relation);
        relations.add(relation);
        assert invariant() : "Illegal state in ExpressionImpl.follow(Relation)";
    }

	@Override
	public void update(Expression expression) {
		if (expression == null)
            throw new IllegalArgumentException(
            		"Illegal 'expression' argument in ExpressionImpl.update(Expression): "
                                            + expression);
	    handle(expression.getValue());
	    assert invariant() : "Illegal state in ExpressionImpl.update(Expression)";
	}
	
	@Override
    public Value getValue() {
            assert invariant() : "Illegal state in ExpressionImpl.getValue()";
            return value;
    }
	
	 @Override
     public void handle(Value value) {
         if (value == null)
             throw new IllegalArgumentException(
            		 "Illegal 'value' argument in ExpressionImpl.handle(Value): "
            				 + value);
         if (first || !value.equals(this.value)) {
             this.value = value;
             first = false;
             for (Expression follower : expressions)
                 follower.update(this);
             for (Relation follower : relations)
                 follower.update(this);
         }
         assert invariant() : "Illegal 'value' argument in ExpressionImpl.handle(Value)";
     }	
	
	private boolean invariant() {
        return (expressions != null);
	}

}
