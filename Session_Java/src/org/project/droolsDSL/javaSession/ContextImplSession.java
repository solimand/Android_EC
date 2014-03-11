package org.project.droolsDSL.javaSession;

import org.project.droolsDSL.javaSession.expressions.Expression;

public class ContextImplSession implements Context {

    private String[] parameters;
    private Expression expression;
    private Long time;
    
    public ContextImplSession(String[] parameters, Expression expression, Long time) {
	    this.expression = expression;
	    this.parameters = parameters;
	    this.time = time;
	    assert invariant() : "Illegal state in ContextImpl(String[], Expression, Condition)";
    }
    
	@Override
	public Expression getExpression() {
		assert invariant() : "Illegal state in ContextImpl.getExpression()";
        return expression;
	}
	
	public Long getTime() {
		assert invariant() : "Illegal state in ContextImpl.getExpression()";
        return time;
	}
	
	@Override
	public String[] getParameters() {
		assert invariant() : "Illegal state in ContextImpl.getParameters()";
        return parameters;
	}

	
	private boolean invariant() {
        return (expression != null && parameters != null);
	}
}
