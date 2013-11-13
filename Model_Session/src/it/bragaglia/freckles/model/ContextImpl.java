/**
 * 
 */
package it.bragaglia.freckles.model;

import it.bragaglia.freckles.model.expressions.ParameterDescr;

/**
 * @author stefano
 * 
 */
public class ContextImpl implements Context {

	/**
	 * The parameters of the context.
	 */
	private ParameterDescr[] parameters;
	private String[] paramToString;
	/**
	 * The expression of the context.
	 */
	private ExpressionDescr expression;

	/**
	 * The condition of the context.
	 */
	private ConditionDescr condition;

	/**
	 * Invariant check.
	 * 
	 * @return <code>true</code> if the state is correct, <code>false</code>
	 *         otherwise
	 */
	private boolean invariant() {
		return (condition != null && expression != null && parameters != null);
	}

	/**
	 * Basic constructor. Requires the <code>parameters</code>, the
	 * <code>expression</code> and the <code>condition</code> of the context.
	 */
	public ContextImpl(ParameterDescr[] parameters, ExpressionDescr expression,
			ConditionDescr condition) {
		
		if(parameters!=null){
			paramToString = new String[parameters.length];
			for(int i=0; i<parameters.length; i++){
				paramToString[i]=parameters[i].getName();
			}
		}
		
		if (parameters == null)
			throw new IllegalArgumentException(
					"Illegal 'parameters' in ContextImpl(String[], Expression, Condition): "
							+ parameters);
		if (expression == null || !expression.validate(paramToString))
			throw new IllegalArgumentException(
					"Illegal 'expression' in ContextImpl(String[], Expression, Condition): "
							+ expression);
		if (condition == null || !condition.validate(paramToString))
			throw new IllegalArgumentException(
					"Illegal 'condition' in ContextImpl(String[], Expression, Condition): "
							+ condition);
		this.condition = condition;
		this.expression = expression;
		this.parameters = parameters;
		assert invariant() : "Illegal state in ContextImpl(String[], Expression, Condition)";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.bragaglia.freckles.Coso#getParams()
	 */
	@Override
	public String[] getParameters() {
		assert invariant() : "Illegal state in ContextImpl.getParameters()";
		return paramToString;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.bragaglia.freckles.Coso#getExpression()
	 */
	@Override
	public ExpressionDescr getExpression() {
		assert invariant() : "Illegal state in ContextImpl.getExpression()";
		return expression;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.bragaglia.freckles.Coso#getCondition()
	 */
	@Override
	public ConditionDescr getCondition() {
		assert invariant() : "Illegal state in ContextImpl.getCondition()";
		return condition;
	}

}
