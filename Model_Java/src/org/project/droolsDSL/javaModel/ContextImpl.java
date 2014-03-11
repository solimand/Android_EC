package org.project.droolsDSL.javaModel;

public class ContextImpl implements ContextDescr {

    private String[] parameters;
    private ExpressionDescr expression;
    private ConditionDescr condition;
    
    public ContextImpl(String[] parameters, ExpressionDescr expression,ConditionDescr condition) {
	    if (parameters == null)
	            throw new IllegalArgumentException(
	                            "Illegal 'parameters' in ContextImpl(String[], Expression, Condition): "
	                                            + parameters);
	    if (expression == null || !expression.validate(parameters))
	            throw new IllegalArgumentException(
	                            "Illegal 'expression' in ContextImpl(String[], Expression, Condition): "
	                                            + expression);
	    if (condition == null || !condition.validate(parameters))
	            throw new IllegalArgumentException(
	                            "Illegal 'condition' in ContextImpl(String[], Expression, Condition): "
	                                            + condition);
	    this.condition = condition;
	    this.expression = expression;
	    this.parameters = parameters;
	    assert invariant() : "Illegal state in ContextImpl(String[], Expression, Condition)";
    }
    
	@Override
	public ConditionDescr getCondition() {
		assert invariant() : "Illegal state in ContextImpl.getCondition()";
        return condition;
	}

	@Override
	public ExpressionDescr getExpression() {
		assert invariant() : "Illegal state in ContextImpl.getExpression()";
        return expression;
	}

	@Override
	public String[] getParameters() {
		assert invariant() : "Illegal state in ContextImpl.getParameters()";
        return parameters;
	}

	
	private boolean invariant() {
        return (condition != null && expression != null && parameters != null);
	}
}
